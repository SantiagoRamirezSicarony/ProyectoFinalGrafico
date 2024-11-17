package interfaces.proyectofinalgrafico.DTO;

import java.io.Serializable;
import java.util.Date;

public class MeGusta implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Date fecha;
    private Vendedor autor;
    private Producto producto;
    public MeGusta() {}
    // Constructor con builder
    public MeGusta(Date fecha, Vendedor autor, Producto producto) {
        this.fecha = fecha;
        this.autor = autor;
        this.producto = producto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Vendedor getAutor() {
        return autor;
    }

    public void setAutor(Vendedor autor) {
        this.autor = autor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "MeGusta{" +
                "fecha=" + fecha +
                ", autor=" + autor +
                ", producto=" + producto +
                '}';
    }
}

