package interfaces.proyectofinalgrafico.Controladores;

//package interfaces.proyectofinalgrafico.Controladores;
//
//import interfaces.proyectofinalgrafico.Controladores.ControladoreSecundarios.HelloApplication;
//import interfaces.proyectofinalgrafico.DOT.*;
//import interfaces.proyectofinalgrafico.Excepciones.ArgumentosFaltantesException;
//import interfaces.proyectofinalgrafico.Excepciones.ContactoEncontradoException;
//import interfaces.proyectofinalgrafico.Excepciones.MaximoContactosException;
//import interfaces.proyectofinalgrafico.Excepciones.ProductoNoDisponibleException;
//import interfaces.proyectofinalgrafico.Services.*;
//import interfaces.proyectofinalgrafico.Socket.Cliente;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Node;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.Alert;
//import javafx.stage.Stage;
//
//import java.util.ArrayList;
//import java.util.Date;
//implements AdministradService, AutenticacionService,ComentarioService, EstadisticasService, ProductoService, ReputacionService,VendedorService
public class ControladorPrincipal  {

}
//
//    private Cliente clienteSockets;
//
//    public ControladorPrincipal() {
//        this.clienteSockets = new Cliente();
//    }
//
//    public static ControladorPrincipal INSTANCE ;
//    ///Metodo para crear y retornar la intancia del controlador
//    public static ControladorPrincipal getInstance() {
//        if(INSTANCE == null){
//            INSTANCE = new ControladorPrincipal();
//
//        }
//        return INSTANCE;
//    }
//
//
//
//
//
//////Metodo para mostrar alertas
//
//    public void mostrarAlerta(String mensaje, Alert.AlertType tipo){
//        Alert alert = new Alert(tipo);
//        alert.setTitle("Alerta - Error");
//        alert.setHeaderText(null);
//        alert.setContentText(mensaje);
//        alert.showAndWait();
//    }
//    ///Metodo para navegar entre ventanas y retornar un FXMLLOADER
//    public FXMLLoader navegar(String nombreVista, String titulo){
//        try {
//
//            FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource(nombreVista));
//            Parent root = loader.load();
//
//            // Crear la escena
//            Scene scene = new Scene(root);
//
//            // Crear un nuevo escenario (ventana)
//            Stage stage = new Stage();
//            stage.setScene(scene);
//            stage.setResizable(false);
//            stage.setTitle(titulo);
//
//            // Mostrar la nueva ventana
//            stage.show();
//
//            return loader;
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//        return null;
//    }
//
//    public void cerrarVentana(Node node){
//        Stage stage = (Stage) node.getScene().getWindow();
//        stage.close();
//    }
//
//
//    @Override
//    public Administrador crearAdministrador(String nombre, String cedula, String apellido, String correo, String contrasenia) throws Exception {
//        // Crear el comando en el formato requerido
//        String comando = "CREAR_ADMINISTRADOR@@" + nombre + "@@" + cedula + "@@" + apellido + "@@" + correo + "@@" + contrasenia;
//
//        // Enviar el comando al servidor
//        clienteSockets.enviarMensaje(comando);
//
//        // Esperar y procesar la respuesta del servidor
//        String respuesta = clienteSockets.recibirMensaje();
//
//        // Analizar la respuesta para construir el objeto Administrador
//        if (respuesta.startsWith("Administrador creado:")) {
//            // Procesar los datos devueltos en la respuesta
//            String[] partes = respuesta.split(":")[1].trim().split(",");
//            return new Administrador(partes[0], partes[1], partes[2], partes[3], partes[4]); // Ajusta según el constructor de tu clase Administrador
//        } else {
//            throw new Exception("Error al crear el administrador: " + respuesta);
//        }
//    }@Override
//    public void crearPersona(String nombre, String cedula, String apellido) throws Exception {
//        String comando = "CREAR_PERSONA@@" + nombre + "@@" + cedula + "@@" + apellido;
//
//        clienteSockets.enviarMensaje(comando);
//
//        String respuesta = clienteSockets.recibirMensaje();
//
//        if (!respuesta.startsWith("Persona creada:")) {
//            throw new Exception("Error al crear persona: " + respuesta);
//        }
//    }
//
//    @Override
//    public Comentario crearComentario(String mensaje, Date fecha, Persona autor, Producto producto) throws ArgumentosFaltantesException {
//        String comando = "CREAR_COMENTARIO@@" + mensaje + "@@" + fecha.getTime() + "@@" + autor.getCedula() + "@@" + producto.getCodigo();
//
//        clienteSockets.enviarMensaje(comando);
//
//        String respuesta = clienteSockets.recibirMensaje();
//
//        if (respuesta.startsWith("Comentario creado:")) {
//            String[] partes = respuesta.split(":")[1].trim().split(",");
//            return new Comentario(partes[0], new Date(Long.parseLong(partes[1])), autor, producto);
//        } else {
//            throw new ArgumentosFaltantesException("Error al crear comentario: " + respuesta);
//        }
//    }
//
//    @Override
//    public EstadisticaProducto generarEstadisticaProducto(double calificacionProducto, int meGustas) {
//        String comando = "GENERAR_ESTADISTICA_PRODUCTO@@" + calificacionProducto + "@@" + meGustas;
//
//        clienteSockets.enviarMensaje(comando);
//
//        String respuesta = clienteSockets.recibirMensaje();
//
//        if (respuesta.startsWith("Estadistica producto generada:")) {
//            String[] partes = respuesta.split(":")[1].trim().split(",");
//            return new EstadisticaProducto(Double.parseDouble(partes[0]), Integer.parseInt(partes[1]));
//        } else {
//            return null; // Manejo de error si es necesario
//        }
//    }
//
//    @Override
//    public EstadisticaVendedor generarEstadisticaVendedor(int productosVendidos, int productosPublicados, int mensajesEnviados) {
//        String comando = "GENERAR_ESTADISTICA_VENDEDOR@@" + productosVendidos + "@@" + productosPublicados + "@@" + mensajesEnviados;
//
//        clienteSockets.enviarMensaje(comando);
//
//        String respuesta = clienteSockets.recibirMensaje();
//
//        if (respuesta.startsWith("Estadistica vendedor generada:")) {
//            String[] partes = respuesta.split(":")[1].trim().split(",");
//            return new EstadisticaVendedor(Integer.parseInt(partes[0]), Integer.parseInt(partes[1]), Integer.parseInt(partes[2]));
//        } else {
//            return null; // Manejo de error si es necesario
//        }
//    }
//
//    @Override
//    public Producto crearProducto(String nombre, String codigo, byte[] imagen, String categoria, double precio, String descripcion, int cantidad, Vendedor vendedor) throws Exception {
//        String comando = "CREAR_PRODUCTO@@" + nombre + "@@" + codigo + "@@" + categoria + "@@" + precio + "@@" + descripcion + "@@" + cantidad + "@@" + vendedor.getCedula();
//
//        clienteSockets.enviarMensaje(comando);
//
//        String respuesta = clienteSockets.recibirMensaje();
//
//        if (respuesta.startsWith("Producto creado:")) {
//            String[] partes = respuesta.split(":")[1].trim().split(",");
//            return new Producto(partes[0], partes[1], null, partes[2], Double.parseDouble(partes[3]), partes[4], Integer.parseInt(partes[5]), vendedor);
//        } else {
//            throw new Exception("Error al crear producto: " + respuesta);
//        }
//    }
//
//    @Override
//    public boolean modificarProducto(String nombre, byte[] imagen, String categoria, double precio, String descripcion, EstadoProducto estado, String codigo, int cantidad) throws ProductoNoDisponibleException {
//        String comando = "MODIFICAR_PRODUCTO@@" + nombre + "@@" + categoria + "@@" + precio + "@@" + descripcion + "@@" + estado + "@@" + codigo + "@@" + cantidad;
//
//        clienteSockets.enviarMensaje(comando);
//
//        String respuesta = clienteSockets.recibirMensaje();
//
//        if (respuesta.startsWith("Producto modificado:")) {
//            return true;
//        } else if (respuesta.startsWith("Error:")) {
//            throw new ProductoNoDisponibleException(respuesta);
//        } else {
//            return false;
//        }
//    }
//
//    @Override
//    public void eliminarProducto(String codigo, Vendedor vendedor) throws Exception {
//        String comando = "ELIMINAR_PRODUCTO@@" + codigo + "@@" + vendedor.getCedula();
//
//        clienteSockets.enviarMensaje(comando);
//
//        String respuesta = clienteSockets.recibirMensaje();
//
//        if (!respuesta.startsWith("Producto eliminado:")) {
//            throw new Exception("Error al eliminar producto: " + respuesta);
//        }
//    }
//
//    @Override
//    public String validarCodigoProducto(String codigo) throws Exception {
//        String comando = "VALIDAR_CODIGO_PRODUCTO@@" + codigo;
//
//        clienteSockets.enviarMensaje(comando);
//
//        String respuesta = clienteSockets.recibirMensaje();
//
//        if (respuesta.startsWith("Codigo valido:")) {
//            return "Valido";
//        } else {
//            throw new Exception("Codigo no valido: " + respuesta);
//        }
//    }
//
//
//    @Override
//    public ArrayList<Producto> buscarProducto(String codigo, String nombre) throws ProductoNoDisponibleException {
//        String comando = "BUSCAR_PRODUCTO@@" + codigo + "@@" + nombre;
//
//        clienteSockets.enviarMensaje(comando);
//
//        String respuesta = clienteSockets.recibirMensaje();
//
//        if (respuesta.startsWith("Productos encontrados:")) {
//            String[] productosStr = respuesta.split(":")[1].trim().split(";");
//            ArrayList<Producto> productos = new ArrayList<>();
//            for (String prod : productosStr) {
//                String[] partes = prod.split(",");
//                productos.add(new Producto(partes[0], partes[1], null, partes[2], Double.parseDouble(partes[3]), partes[4], Integer.parseInt(partes[5]), null));
//            }
//            return productos;
//        } else {
//            throw new ProductoNoDisponibleException("Error al buscar productos: " + respuesta);
//        }
//    }
//
//    @Override
//    public Producto buscarProductoExacto(String codigo) throws ProductoNoDisponibleException {
//        String comando = "BUSCAR_PRODUCTO_EXACTO@@" + codigo;
//
//        clienteSockets.enviarMensaje(comando);
//
//        String respuesta = clienteSockets.recibirMensaje();
//
//        if (respuesta.startsWith("Producto encontrado:")) {
//            String[] partes = respuesta.split(":")[1].trim().split(",");
//            return new Producto(partes[0], partes[1], null, partes[2], Double.parseDouble(partes[3]), partes[4], Integer.parseInt(partes[5]), null);
//        } else {
//            throw new ProductoNoDisponibleException("Producto no encontrado: " + respuesta);
//        }
//    }
//
//    @Override
//    public String crearNumeroCodigoProducto() {
//        String comando = "CREAR_NUMERO_CODIGO_PRODUCTO";
//
//        clienteSockets.enviarMensaje(comando);
//
//        String respuesta = clienteSockets.recibirMensaje();
//
//        if (respuesta.startsWith("Codigo generado:")) {
//            return respuesta.split(":")[1].trim();
//        } else {
//            return "Error: " + respuesta;
//        }
//    }
//
//    @Override
//    public String generarCodigoProducto() {
//        String comando = "GENERAR_CODIGO_PRODUCTO";
//
//        clienteSockets.enviarMensaje(comando);
//
//        String respuesta = clienteSockets.recibirMensaje();
//
//        if (respuesta.startsWith("Codigo generado:")) {
//            return respuesta.split(":")[1].trim();
//        } else {
//            return "Error: " + respuesta;
//        }
//    }
//
//    @Override
//    public void comprarProducto(String codigo, int cantidad) throws Exception {
//        String comando = "COMPRAR_PRODUCTO@@" + codigo + "@@" + cantidad;
//
//        clienteSockets.enviarMensaje(comando);
//
//        String respuesta = clienteSockets.recibirMensaje();
//
//        if (!respuesta.startsWith("Producto comprado:")) {
//            throw new Exception("Error al comprar producto: " + respuesta);
//        }
//    }
//
//    @Override
//    public void calificarVendedor(String comentario, int calificacion, Vendedor calificado, Vendedor calificador) {
//        String comando = "CALIFICAR_VENDEDOR@@" + comentario + "@@" + calificacion + "@@" + calificado.getCedula() + "@@" + calificador.getCedula();
//
//        clienteSockets.enviarMensaje(comando);
//
//        String respuesta = clienteSockets.recibirMensaje();
//
//        if (!respuesta.startsWith("Calificación registrada:")) {
//            System.err.println("Error al calificar vendedor: " + respuesta);
//        }
//    }
//
//    @Override
//    public Vendedor crearVendedor(String nombre, String cedula, String apellido, String correo, String contrasenia, String direccion) throws Exception {
//        String comando = "CREAR_VENDEDOR@@" + nombre + "@@" + cedula + "@@" + apellido + "@@" + correo + "@@" + contrasenia + "@@" + direccion;
//
//        clienteSockets.enviarMensaje(comando);
//
//        String respuesta = clienteSockets.recibirMensaje();
//
//        if (respuesta.startsWith("Vendedor creado:")) {
//            String[] partes = respuesta.split(":")[1].trim().split(",");
//            return new Vendedor(partes[0], partes[1], partes[2], partes[3], partes[4], partes[5]);
//        } else {
//            throw new Exception("Error al crear vendedor: " + respuesta);
//        }
//    }
//
//    @Override
//    public void agregarContacto(Vendedor inicial, Vendedor contacto) throws MaximoContactosException, ContactoEncontradoException, ArgumentosFaltantesException {
//        String comando = "AGREGAR_CONTACTO@@" + inicial.getCedula() + "@@" + contacto.getCedula();
//
//        clienteSockets.enviarMensaje(comando);
//
//        String respuesta = clienteSockets.recibirMensaje();
//
//        if (!respuesta.startsWith("Contacto agregado:")) {
//            if (respuesta.contains("Maximo contactos alcanzado")) {
//                throw new MaximoContactosException(respuesta);
//            } else if (respuesta.contains("Contacto ya existe")) {
//                throw new ContactoEncontradoException(respuesta);
//            } else {
//                throw new ArgumentosFaltantesException("Error al agregar contacto: " + respuesta);
//            }
//        }
//    }
//
//    @Override
//    public void comentarProducto(String mensaje, Date fecha, Persona autor, Producto producto) throws ArgumentosFaltantesException, ProductoNoDisponibleException {
//        String comando = "COMENTAR_PRODUCTO@@" + mensaje + "@@" + fecha.getTime() + "@@" + autor.getCedula() + "@@" + producto.getCodigo();
//
//        clienteSockets.enviarMensaje(comando);
//
//        String respuesta = clienteSockets.recibirMensaje();
//
//        if (!respuesta.startsWith("Comentario registrado:")) {
//            if (respuesta.contains("Producto no disponible")) {
//                throw new ProductoNoDisponibleException(respuesta);
//            } else {
//                throw new ArgumentosFaltantesException("Error al comentar producto: " + respuesta);
//            }
//        }
//    }
//
//    @Override
//    public void darMeGusta(Date fecha, Vendedor autor, Producto producto) throws ArgumentosFaltantesException {
//        String comando = "DAR_MEGUSTA@@" + fecha.getTime() + "@@" + autor.getCedula() + "@@" + producto.getCodigo();
//
//        clienteSockets.enviarMensaje(comando);
//
//        String respuesta = clienteSockets.recibirMensaje();
//
//        if (!respuesta.startsWith("Me gusta registrado:")) {
//            throw new ArgumentosFaltantesException("Error al dar me gusta: " + respuesta);
//        }
//    }
//
//    @Override
//    public ArrayList<Vendedor> buscarVendedor(String cedula, String nombre, String apellido) throws ArgumentosFaltantesException {
//        String comando = "BUSCAR_VENDEDOR@@" + cedula + "@@" + nombre + "@@" + apellido;
//
//        clienteSockets.enviarMensaje(comando);
//
//        String respuesta = clienteSockets.recibirMensaje();
//
//        if (respuesta.startsWith("Vendedores encontrados:")) {
//            String[] vendedoresStr = respuesta.split(":")[1].trim().split(";");
//            ArrayList<Vendedor> vendedores = new ArrayList<>();
//            for (String vendedorStr : vendedoresStr) {
//                String[] partes = vendedorStr.split(",");
//                vendedores.add(new Vendedor(partes[0], partes[1], partes[2], partes[3], partes[4], partes[5]));
//            }
//            return vendedores;
//        } else {
//            throw new ArgumentosFaltantesException("Error al buscar vendedor: " + respuesta);
//        }
//    }
//
//    @Override
//    public boolean encontrarContactos(Vendedor inicial, Vendedor contacto) {
//        String comando = "ENCONTRAR_CONTACTOS@@" + inicial.getCedula() + "@@" + contacto.getCedula();
//
//        clienteSockets.enviarMensaje(comando);
//
//        String respuesta = clienteSockets.recibirMensaje();
//
//        return respuesta.startsWith("Contacto encontrado:");
//    }
//
//    @Override
//    public void ennviarSolicitud(Vendedor solicitador, Vendedor enviarSolicitud) throws ArgumentosFaltantesException {
//        String comando = "ENVIAR_SOLICITUD@@" + solicitador.getCedula() + "@@" + enviarSolicitud.getCedula();
//
//        clienteSockets.enviarMensaje(comando);
//
//        String respuesta = clienteSockets.recibirMensaje();
//
//        if (!respuesta.startsWith("Solicitud enviada:")) {
//            throw new ArgumentosFaltantesException("Error al enviar solicitud: " + respuesta);
//        }
//    }
//
//    @Override
//    public ArrayList<Vendedor> sugerirAmistades(Vendedor vendedorActual) {
//        return null;
//    }
//
//    @Override
//    public boolean autenticar(String correo, String contrasenia) {
//        return false;
//    }
//}
