package interfaces.proyectofinalgrafico.DTO;

public class Reputacion {
    private int calificacion;
    private String reseña;
    private Vendedor evaluador;

    // Constructor vacío
    public Reputacion() {
    }

    // Constructor lleno
    public Reputacion(int calificacion, String reseña, Vendedor evaluador) {
        this.calificacion = calificacion;
        this.reseña = reseña;
        this.evaluador = evaluador;
    }

    // Getters
    public int getCalificacion() {
        return calificacion;
    }

    public String getReseña() {
        return reseña;
    }

    public Vendedor getEvaluador() {
        return evaluador;
    }

    // Setters
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public void setReseña(String reseña) {
        this.reseña = reseña;
    }

    public void setEvaluador(Vendedor evaluador) {
        this.evaluador = evaluador;
    }

    // Método toString
    @Override
    public String toString() {
        return "Reputacion{" +
                "calificacion=" + calificacion +
                ", reseña='" + reseña + '\'' +
                ", evaluador=" + evaluador +
                '}';
    }
}
