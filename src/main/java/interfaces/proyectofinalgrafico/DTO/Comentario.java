package interfaces.proyectofinalgrafico.DTO;

import java.io.Serializable;
import java.util.Date;

public class Comentario implements Serializable {
    private static final long serialVersionUID = 1L;

    private String mensaje;
    private Date fecha;
    private Persona autor;
    private Producto producto;
    public Comentario() {}
    // Constructor
    public Comentario(String mensaje, Date fecha, Persona autor, Producto producto) {
        this.mensaje = mensaje;
        this.fecha = fecha;
        this.autor = autor;
        this.producto = producto;

    }

    // Getters
    public String getMensaje() {
        return mensaje;
    }

    public Date getFecha() {
        return fecha;
    }

    public Persona getAutor() {
        return autor;
    }

    public Producto getProducto() {
        return producto;
    }

    // Setters
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    // toString method
    @Override
    public String toString() {
        return  fecha + "\n" + autor.getNombre() + " " + autor.getApellido() + ":\n" + mensaje;

    }


}

