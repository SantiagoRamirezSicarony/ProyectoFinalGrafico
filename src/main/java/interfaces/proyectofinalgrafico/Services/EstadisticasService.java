package interfaces.proyectofinalgrafico.Services;


import interfaces.proyectofinalgrafico.DOT.EstadisticaProducto;
import interfaces.proyectofinalgrafico.DOT.EstadisticaVendedor;

public interface EstadisticasService {
    EstadisticaProducto generarEstadisticaProducto(double calificacionProducto, int meGustas);
    EstadisticaVendedor generarEstadisticaVendedor(int productosVendidos, int productosPublicados, int mensajesEnviados);
}