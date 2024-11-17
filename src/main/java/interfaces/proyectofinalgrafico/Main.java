package interfaces.proyectofinalgrafico;

import interfaces.proyectofinalgrafico.Socket.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.conectar("localHost",8082);
        cliente.enviarMensaje("Hola");
    }
}
