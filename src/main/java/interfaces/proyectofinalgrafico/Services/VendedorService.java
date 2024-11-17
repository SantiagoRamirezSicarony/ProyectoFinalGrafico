package interfaces.proyectofinalgrafico.Services;



import interfaces.proyectofinalgrafico.DOT.Persona;
import interfaces.proyectofinalgrafico.DOT.Producto;
import interfaces.proyectofinalgrafico.DOT.Vendedor;
import interfaces.proyectofinalgrafico.Excepciones.ArgumentosFaltantesException;
import interfaces.proyectofinalgrafico.Excepciones.ContactoEncontradoException;
import interfaces.proyectofinalgrafico.Excepciones.MaximoContactosException;
import interfaces.proyectofinalgrafico.Excepciones.ProductoNoDisponibleException;

import java.util.ArrayList;
import java.util.Date;

public interface VendedorService {
    Vendedor crearVendedor(String nombre, String cedula, String apellido, String correo, String contrasenia, String direccion) throws Exception;
    void agregarContacto(Vendedor inicial, Vendedor contacto) throws MaximoContactosException, ContactoEncontradoException, ArgumentosFaltantesException;
    void comentarProducto(String mensaje, Date fecha, Persona autor, Producto producto) throws ArgumentosFaltantesException, ProductoNoDisponibleException;
    void darMeGusta(Date fecha, Vendedor autor, Producto producto) throws ArgumentosFaltantesException;
    ArrayList<Vendedor> buscarVendedor(String cedula, String nombre, String apellido)throws ArgumentosFaltantesException;
    boolean encontrarContactos(Vendedor inicial, Vendedor contacto);
    void ennviarSolicitud(Vendedor solicitador, Vendedor enviarSolicitud) throws ArgumentosFaltantesException;
    ArrayList<Vendedor> sugerirAmistades(Vendedor vendedorActual);
}
