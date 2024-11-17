package interfaces.proyectofinalgrafico.Services;



import interfaces.proyectofinalgrafico.DTO.Comentario;
import interfaces.proyectofinalgrafico.DTO.Persona;
import interfaces.proyectofinalgrafico.DTO.Producto;
import interfaces.proyectofinalgrafico.Excepciones.ArgumentosFaltantesException;

import java.util.Date;

public interface ComentarioService {
     Comentario crearComentario(String mensaje, Date fecha, Persona autor, Producto producto) throws ArgumentosFaltantesException;
}
