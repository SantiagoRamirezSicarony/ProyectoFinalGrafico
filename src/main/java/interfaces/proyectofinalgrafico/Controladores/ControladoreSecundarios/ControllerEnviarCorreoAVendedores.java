package interfaces.proyectofinalgrafico.Controladores.ControladoreSecundarios;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;



public class ControllerEnviarCorreoAVendedores {

    @FXML
    private Label labelDe;

    @FXML
    private Label labelPara;

    @FXML
    private Label labelAsunto;

    @FXML
    private TextField campoDe;

    @FXML
    private TextField campoPara;

    @FXML
    private TextField campoAsunto;

    @FXML
    private TextField areaMensaje;

    @FXML
    private Button botonEnviar;

    @FXML
    private AnchorPane anchorPaneCorreo;

    @FXML
    private TableView tableViewCorreoAvendedores;

    @FXML
    private TableColumn tableColumnNombre;

    @FXML
    private TableColumn tableColumnCorreo;

}