package interfaces.proyectofinalgrafico.Services;


import interfaces.proyectofinalgrafico.DTO.EstadisticaProducto;
import interfaces.proyectofinalgrafico.DTO.EstadisticaVendedor;

public interface EstadisticasService {
    EstadisticaProducto generarEstadisticaProducto(double calificacionProducto, int meGustas);
    EstadisticaVendedor generarEstadisticaVendedor(int productosVendidos, int productosPublicados, int mensajesEnviados);
}