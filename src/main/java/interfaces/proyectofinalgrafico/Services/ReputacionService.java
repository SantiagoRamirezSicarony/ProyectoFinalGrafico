package interfaces.proyectofinalgrafico.Services;


import interfaces.proyectofinalgrafico.DTO.Vendedor;

public interface ReputacionService {
    void calificarVendedor(String comentario, int calificacion, Vendedor calificado, Vendedor calificador);
}
