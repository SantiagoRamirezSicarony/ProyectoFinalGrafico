package interfaces.proyectofinalgrafico.DOT;


import java.io.Serializable;

public class Administrador extends Persona implements Serializable {
    private static final long serialVersionUID = 1L;

    private String correo;
    private String contrasenia;

    public Administrador() {
    }

    // Constructor de Administrador
    public Administrador(String nombre, String cedula, String apellido, String correo, String contrasenia) {
        super(nombre, cedula, apellido); // Llamada al constructor de Persona
        this.correo = correo;
        this.contrasenia = contrasenia;
    }

    // Getter y Setter para correo y contrasenia
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }


}

