package interfaces.proyectofinalgrafico.Services;


import interfaces.proyectofinalgrafico.DOT.Administrador;

public interface AdministradService {
    Administrador crearAdministrador(String nombre,
                                     String cedula, String apellido, String correo, String contrasenia) throws Exception;
    void crearPersona(String nombre, String cedula, String apellido);
}
