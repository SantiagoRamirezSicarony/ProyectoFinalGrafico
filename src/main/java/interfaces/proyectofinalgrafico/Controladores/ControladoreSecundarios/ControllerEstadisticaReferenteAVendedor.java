package interfaces.proyectofinalgrafico.Controladores.ControladoreSecundarios;

import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.awt.*;

public class ControllerEstadisticaReferenteAVendedor {

    @FXML
    private AnchorPane ActualizarInformacion;

    @FXML
    private Button BtIrPestanaActualizar;

    @FXML
    private Button CerrarInformaiconPerfil;

    @FXML
    private Label LbConIdentificacion;

    @FXML
    private Label LbConNombre;

    @FXML
    private Label LbContrasena;

    @FXML
    private Label LbCorreo;

    @FXML
    private Label LbEmail;

    @FXML
    private Label LbIdentificacion;

    @FXML
    private Label LbNombre;

    @FXML
    private Label LbPassword;

    @FXML
    private Label LbTelefono;

    @FXML
    private Label MensajePerfil;

    @FXML
    private AnchorPane anchorPaneEstadisticaReferenteAVendedor;

    @FXML
    private Button buttomEliminarRedVendedores;

    @FXML
    private Button buttomIrAChat;

    @FXML
    private Button buttonAgregarSolicitudes;

    @FXML
    private Button buttonEliminarSolicitudes;

    @FXML
    private GridPane gridPaneInformacionPerfil;

    @FXML
    private Label labelCantidadProductos;

    @FXML
    private Label labelCedula;

    @FXML
    private Label labelLikes;

    @FXML
    private Label labelNombre;

    @FXML
    private Label labelNumeroComentarios;

    @FXML
    private Label labelNumeroVentas;

    @FXML
    private Label labelValorCantidadProductos;

    @FXML
    private Label labelValorLikes;

    @FXML
    private Label labelValorNumeroComentarios;

    @FXML
    private Label labelValorNumeroVentas;

    @FXML
    private Tab tabChat;

    @FXML
    private Tab tabEstadistica;

    @FXML
    private TabPane tabPanel;

    @FXML
    private Tab tabPerfil;

    @FXML
    private TableColumn<?, ?> tableColumnCorreoChat;

    @FXML
    private TableColumn<?, ?> tableColumnCorreoRedVendedores;

    @FXML
    private TableColumn<?, ?> tableColumnCorreoSolicitudes;

    @FXML
    private TableColumn<?, ?> tableColumnNombreChat;

    @FXML
    private TableColumn<?, ?> tableColumnNombreRedVendedores;

    @FXML
    private TableColumn<?, ?> tableColumnNombreSolicitudes;

    @FXML
    private TableView<?> tableViewChar;

    @FXML
    private TableView<?> tableViewRedVendedores;

    @FXML
    private TableView<?> tableViewSolicitudes;

    @FXML
    private Tab tabtabRedVendedores;

    @FXML
    void setActualizarInformacion(ActionEvent event) {

    }


}
