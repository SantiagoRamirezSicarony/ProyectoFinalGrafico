package interfaces.proyectofinalgrafico.Controladores.ControladoreSecundarios;

import interfaces.proyectofinalgrafico.DOT.Vendedor;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;


public class MyController2 {

    @FXML
    private Button botonAgregarVendedor;

    @FXML
    private Button botonEliminarVendedor;

    @FXML
    private Button botonVerEstadistica;

    @FXML
    private ListView<Vendedor> listaVendedores;

    @FXML
    private ListView<Vendedor> listaVendedores1;

    @FXML
    private Tab tabSolicitudes;

    @FXML
    private Tab tabVendedores;

}
