package interfaces.proyectofinalgrafico.Socket;
import java.io.*;
import java.net.Socket;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Cliente implements Runnable {
    private Socket socket;
    private ObjectOutputStream salida;
    private ObjectInputStream entrada;
    private BlockingQueue<String> mensajesRecibidos;

    public Cliente() {
        mensajesRecibidos = new LinkedBlockingQueue<>(); // Cola para mensajes del servidor
    }

    @Override
    public void run() {
        System.out.println("Cliente iniciado...");
        try {
            while (true) {
                Object object = entrada.readObject(); // Leer mensajes del servidor
                if (object instanceof String) {
                    String respuesta = (String) object;
                    System.out.println("Mensaje recibido: " + respuesta);
                    mensajesRecibidos.put(respuesta); // Agregar mensaje a la cola
                }
            }
        } catch (IOException | ClassNotFoundException | InterruptedException e) {
            System.err.println("Error en el cliente: " + e.getMessage());
        }
    }

    public void conectar(String servidorHost, int puertoServidor) {
        try {
            socket = new Socket(servidorHost, puertoServidor);
            salida = new ObjectOutputStream(socket.getOutputStream());
            entrada = new ObjectInputStream(socket.getInputStream());
            new Thread(this).start(); // Inicia el hilo para escuchar mensajes
        } catch (IOException e) {
            System.err.println("Error al conectar con el servidor: " + e.getMessage());
        }
    }

    public void cerrarConexion() {
        try {
            if (entrada != null) entrada.close();
            if (salida != null) salida.close();
            if (socket != null) socket.close();
            System.out.println("Cliente desconectado.");
        } catch (IOException e) {
            System.err.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }

    public void enviarMensaje(String mensaje) {
        try {
            salida.writeObject(mensaje);
            salida.flush();
        } catch (IOException e) {
            System.err.println("Error al enviar el mensaje: " + e.getMessage());
        }
    }

    public String recibirMensaje() {
        try {
            return mensajesRecibidos.take(); // Toma el mensaje desde la cola
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return "Error al recibir mensaje.";
        }
    }
}