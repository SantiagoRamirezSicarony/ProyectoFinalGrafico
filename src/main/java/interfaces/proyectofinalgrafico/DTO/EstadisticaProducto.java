package interfaces.proyectofinalgrafico.DTO;

import java.io.Serializable;

public class EstadisticaProducto implements Serializable {
    private static final long serialVersionUID = 1L;

    private double calificacionProducto;
    private int meGustas;

    // Constructor vacío
    public EstadisticaProducto() {
    }

    // Constructor completo
    public EstadisticaProducto(double calificacionProducto, int meGustas) {
        this.calificacionProducto = calificacionProducto;
        this.meGustas = meGustas;
    }

    // Getters y Setters
    public double getCalificacionProducto() {
        return calificacionProducto;
    }

    public void setCalificacionProducto(double calificacionProducto) {
        this.calificacionProducto = calificacionProducto;
    }

    public int getMeGustas() {
        return meGustas;
    }

    public void setMeGustas(int meGustas) {
        this.meGustas = meGustas;
    }



}

