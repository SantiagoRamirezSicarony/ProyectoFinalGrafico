package interfaces.proyectofinalgrafico.Services;



import interfaces.proyectofinalgrafico.DOT.Comentario;
import interfaces.proyectofinalgrafico.DOT.Persona;
import interfaces.proyectofinalgrafico.DOT.Producto;
import interfaces.proyectofinalgrafico.Excepciones.ArgumentosFaltantesException;

import java.util.Date;

public interface ComentarioService {
     Comentario crearComentario(String mensaje, Date fecha, Persona autor, Producto producto) throws ArgumentosFaltantesException;
}
