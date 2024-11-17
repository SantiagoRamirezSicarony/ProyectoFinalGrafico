package interfaces.proyectofinalgrafico.Controladores.ControladoreSecundarios;

import interfaces.proyectofinalgrafico.Controladores.ControladorPrincipal;
import interfaces.proyectofinalgrafico.DTO.Chat;
import interfaces.proyectofinalgrafico.DTO.LoginUsuario;
import interfaces.proyectofinalgrafico.DTO.Vendedor;
import interfaces.proyectofinalgrafico.Excepciones.ArgumentosFaltantesException;
import interfaces.proyectofinalgrafico.Excepciones.ContactoEncontradoException;
import interfaces.proyectofinalgrafico.Excepciones.MaximoContactosException;
import interfaces.proyectofinalgrafico.Socket.Cliente;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.event.ActionEvent;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ControllerEstadisticaReferenteAVendedor implements Initializable {

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
    private TableColumn<Vendedor, String> tableColumnCorreoChat;

    @FXML
    private TableColumn<Vendedor, String> tableColumnCorreoRedVendedores;

    @FXML
    private TableColumn<Vendedor, String> tableColumnCorreoSolicitudes;

    @FXML
    private TableColumn<Vendedor, String> tableColumnNombreChat;

    @FXML
    private TableColumn<Vendedor, String> tableColumnNombreRedVendedores;

    @FXML
    private TableColumn<Vendedor, String> tableColumnNombreSolicitudes;

    @FXML
    private TableView<Vendedor> tableViewChar;

    @FXML
    private TableView<Vendedor> tableViewRedVendedores;

    @FXML
    private TableView<Vendedor> tableViewSolicitudes;

    @FXML
    private Tab tabtabRedVendedores;

    @FXML
    void setActualizarInformacion(ActionEvent event) {

        controladorPrincipal.actualizarVendedor(usuarioLogueado.getUsuarioLogueado().getNombre(), LbTelefono.getText(), LbPassword.getText() );
    }

    Cliente cliente;
    ControladorPrincipal controladorPrincipal;
    LoginUsuario usuarioLogueado;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.cliente = new Cliente();
        cliente.conectar("localHost", 8082);
        this.controladorPrincipal = ControladorPrincipal.getInstance();
        this.usuarioLogueado = LoginUsuario.getInstancia();
        initDataBading();
        mostarTabla();
        setearTexto();
    }

    private void initDataBading(){
        tableColumnNombreRedVendedores.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        tableColumnCorreoRedVendedores.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getCorreo())));
        tableColumnNombreChat.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        tableColumnCorreoChat.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getCorreo())));

    }
    public void mostarTabla(){
        tableViewChar.getItems().clear();
        tableViewRedVendedores.getItems().clear();
        try {
            ArrayList<Chat> chat = ((Vendedor)(controladorPrincipal.buscarVendedorExcato(((Vendedor)usuarioLogueado.getUsuarioLogueado()).getCorreo()))).getChats();
            ArrayList<Vendedor> participantes = new ArrayList<>();
            for(Chat c : chat){
                participantes.add((Vendedor) c.getParticipantes().get(1));
            }
            tableViewRedVendedores.setItems(FXCollections.observableArrayList(((Vendedor)usuarioLogueado.getUsuarioLogueado()).getContactos()));
            tableViewChar.setItems(FXCollections.observableArrayList(participantes));

        } catch (ArgumentosFaltantesException e) {

        controladorPrincipal.mostrarAlerta(e.getMessage(), Alert.AlertType.ERROR);        }
    }

    public void setearTexto(){
        LbConNombre.setText(usuarioLogueado.getUsuarioLogueado().getNombre());
        LbConIdentificacion.setText(usuarioLogueado.getUsuarioLogueado().getCedula());
        LbTelefono.setText(((Vendedor)usuarioLogueado.getUsuarioLogueado()).getDireccion());
        LbPassword.setText(((Vendedor)usuarioLogueado.getUsuarioLogueado()).getContrasenia());
        LbEmail.setText(((Vendedor)usuarioLogueado.getUsuarioLogueado()).getCorreo());
    }
    @FXML
    void agregar(ActionEvent event) {
        try {
            controladorPrincipal.agregarContacto((Vendedor) usuarioLogueado.getUsuarioLogueado(),tableViewSolicitudes.getSelectionModel().getSelectedItem());
        } catch (MaximoContactosException e) {
            controladorPrincipal.mostrarAlerta(e.getMessage(), Alert.AlertType.INFORMATION);
        } catch (ContactoEncontradoException e) {
            controladorPrincipal.mostrarAlerta(e.getMessage(), Alert.AlertType.INFORMATION);
        } catch (ArgumentosFaltantesException e) {
            controladorPrincipal.mostrarAlerta(e.getMessage(), Alert.AlertType.INFORMATION);
        }
    }

    @FXML
    void eliminarProducto(ActionEvent event) {
        try {
            Vendedor v = ((Vendedor) (controladorPrincipal.buscarVendedorExcato(((Vendedor) usuarioLogueado.getUsuarioLogueado()).getCorreo())));
            v.getSolicitudes().remove(tableViewSolicitudes.getSelectionModel().getSelectedItem());
        } catch (ArgumentosFaltantesException e) {
            controladorPrincipal.mostrarAlerta(e.getMessage(), Alert.AlertType.INFORMATION);
        }
    }
    @FXML
    void irAChat(ActionEvent event) {

    }
}
