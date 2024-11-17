package interfaces.proyectofinalgrafico.Controladores.ControladoreSecundarios;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.TextField;

public class ControllerListaProductoUnVendedor {

    @FXML
    private AnchorPane anchorPaneProducto;

    @FXML
    private Button buttonComprar;

    @FXML
    private Label labelCategoria;

    @FXML
    private Label labelCodigo;

    @FXML
    private Label labelDescripcion;

    @FXML
    private Label labelEstado;

    @FXML
    private Label labelNombre;

    @FXML
    private Label labelPrecio;

    @FXML
    private Label labelUnidadesDeCompra;

    @FXML
    private Label labelValorCategoria;

    @FXML
    private Label labelValorCodigo;

    @FXML
    private Label labelValorDescripcion;

    @FXML
    private Label labelValorEstado;

    @FXML
    private Label labelValorNombre;

    @FXML
    private Label labelValorPrecio;

    @FXML
    private TableColumn<?, ?> tableColumnCodigo;

    @FXML
    private TableColumn<?, ?> tableColumnNombre;

    @FXML
    private TableView<?> tableViewListaUnProducto;

    @FXML
    private TextField textFieldUnidadesDeCompra;
}
