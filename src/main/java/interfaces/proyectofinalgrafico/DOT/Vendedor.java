package interfaces.proyectofinalgrafico.DOT;





import interfaces.proyectofinalgrafico.Excepciones.MaximoContactosException;
import interfaces.proyectofinalgrafico.Excepciones.ProductoDuplicadoException;
import interfaces.proyectofinalgrafico.Excepciones.VendedorNoEncontradoException;

import java.io.Serializable;
import java.util.ArrayList;

public class Vendedor extends Persona implements Serializable {
    private static final long serialVersionUID = 1L;

    private String contrasenia;
    private String direccion;
    private String correo;
    private ArrayList<Producto> productos;
    private ArrayList<Vendedor> contactos;
    private ArrayList<Vendedor> solicitudes;
    private ArrayList<Producto> productosComprados;
    private int reputacionVendedor;
    private ArrayList<Reputacion> calificaciones;
    private ArrayList<Chat> chats ;

    // Constructor vacío
    public Vendedor() {
        super();
        this.chats = new ArrayList<>();
        this.productos = new ArrayList<>();
        this.contactos = new ArrayList<>();
        this.solicitudes = new ArrayList<>();
        this.productosComprados = new ArrayList<>();
        this.calificaciones = new ArrayList<>();
    }

    // Constructor con parámetros
    public Vendedor(String nombre, String apellido, String cedula, String contrasenia, String direccion,
                    String correo, ArrayList<Producto> productos, ArrayList<Vendedor> contactos,
                    ArrayList<Vendedor> solicitudes, ArrayList<Producto> productosComprados, int reputacionVendedor, ArrayList<Reputacion> calificaciones, ArrayList<Chat> chats) {
        super(nombre, cedula, apellido); // Llamar al constructor de Persona
        this.contrasenia = contrasenia;
        this.chats = chats;
        this.reputacionVendedor = reputacionVendedor;
        this.direccion = direccion;
        this.correo = correo;
        this.productos = productos;
        this.contactos = contactos;
        this.solicitudes = solicitudes;
        this.productosComprados = productosComprados;
        this.calificaciones = calificaciones;
    }



    // Getters
    public String getContrasenia() {
        return contrasenia;
    }
    public ArrayList<Producto> getProductosComprados(){
        return productosComprados;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public ArrayList<Vendedor> getContactos() {
        return contactos;
    }
    public ArrayList<Vendedor> getSolicitudes() {
        return solicitudes;
    }
    public int getReputacionVendedor() {
        return reputacionVendedor;
    }

    public ArrayList<Reputacion> getCalificaciones() {
        return calificaciones;
    }



    public ArrayList<Chat> getChats() {
        return chats;
    }


    // Setters
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    public void setCalificaciones(ArrayList<Reputacion> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public void setChats(ArrayList<Chat> chats) {
        this.chats = chats;
    }

    public void setReputacionVendedor(int reputacionVendedor) {
        this.reputacionVendedor = reputacionVendedor;
    }

    public void setProductosComprados(ArrayList<Producto> productosComprados) {
        this.productosComprados = productosComprados;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void setContactos(ArrayList<Vendedor> contactos) {
        this.contactos = contactos;
    }
    public void setSolicitudes(ArrayList<Vendedor> solicitudes) {
        this.solicitudes = solicitudes;
    }




}
