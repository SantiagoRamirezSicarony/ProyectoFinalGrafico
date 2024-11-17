package interfaces.proyectofinalgrafico.DOT;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Producto implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nombre;
    private String codigo;
    private String imagen;
    private String categoria;
    private double precio;
    private String descripcion;
    private EstadoProducto estado;
    private List<Comentario> comentarios;
    private List<MeGusta> meGustas;
    private int cantidad;
    private Date fechaPublicacion;

    // Constructor vacío
    public Producto() {
        this.comentarios = new ArrayList<>();
        this.meGustas = new ArrayList<>();
    }

    // Constructor con todos los atributos
    public Producto(String nombre, String codigo, String imagen, String categoria, double precio,
                    String descripcion, EstadoProducto estado, List<Comentario> comentarios,
                    List<MeGusta> meGustas, int cantidad, Date fechaPublicacion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.imagen = imagen;
        this.categoria = categoria;
        this.precio = precio;
        this.descripcion = descripcion;
        this.estado = estado;
        this.comentarios = comentarios;
        this.meGustas = meGustas;
        this.cantidad = cantidad;
        this.fechaPublicacion = fechaPublicacion;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getImagen() {
        return imagen;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public EstadoProducto getEstado() {
        return estado;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public List<MeGusta> getMeGustas() {
        return meGustas;
    }

    public int getCantidad() {
        return cantidad;
    }
    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEstado(EstadoProducto estado) {
        this.estado = estado;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public void setMeGustas(List<MeGusta> meGustas) {
        this.meGustas = meGustas;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }


    



}
