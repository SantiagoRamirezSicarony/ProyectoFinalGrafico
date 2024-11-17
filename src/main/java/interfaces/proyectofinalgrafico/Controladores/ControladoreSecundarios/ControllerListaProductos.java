package interfaces.proyectofinalgrafico.Controladores.ControladoreSecundarios;

import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ControllerListaProductos {

    @FXML
    private AnchorPane AnchorPaneListaProductos;

    @FXML
    private AnchorPane AnchorPanePublicarProducto;

    @FXML
    private Button ButtonSubirImagen;

    @FXML
    private Button ButtonVerEstadisticaProduccto;

    @FXML
    private Label LabelCategoria;

    @FXML
    private Label LabelCodigo;

    @FXML
    private Label LabelDescripcion;

    @FXML
    private Label LabelEstado;

    @FXML
    private Label LabelNombre;

    @FXML
    private Label LabelPrecio;

    @FXML
    private TabPane TabListaProductos;

    @FXML
    private TextField TextFieldCategoria;

    @FXML
    private TextField TextFieldDescripcion;

    @FXML
    private TextField TextFieldEstado;

    @FXML
    private TextField TextFieldNombre;

    @FXML
    private TextField TextFieldPrecio;

    @FXML
    private Label labelImagen;

    @FXML
    private Tab tabProductos;

    @FXML
    private Tab tabPublicar;

    @FXML
    private TableColumn<?, ?> tableColumnNombreProductos;

    @FXML
    private TableColumn<?, ?> tableColumnsCodigoProducto;

    @FXML
    private TableView<?> tableViewProductos;

    @FXML
    private TextField textFieldCodigo;
}
