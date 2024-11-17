package interfaces.proyectofinalgrafico.Controladores.ControladoreSecundarios;

import interfaces.proyectofinalgrafico.Controladores.ControladorPrincipal;
import interfaces.proyectofinalgrafico.DTO.Administrador;
import interfaces.proyectofinalgrafico.DTO.LoginUsuario;
import interfaces.proyectofinalgrafico.DTO.Persona;
import interfaces.proyectofinalgrafico.DTO.Vendedor;
import interfaces.proyectofinalgrafico.Socket.Cliente;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;


public class MyController implements Initializable {
    @FXML
    private Button myButton; // Ejemplo de un componente de la UI

    @FXML
    private TextField campoTextoUsuario;

    @FXML
    private PasswordField campoTextoContraseña;

    @FXML
    private Button botonLogin;

    @FXML
    private Button botonRegistrarse;




    Cliente cliente;
    ControladorPrincipal controladorPrincipal;
    LoginUsuario usuarioLogueado;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.cliente = new Cliente();
        cliente.conectar("localHost", 8082);
        this.controladorPrincipal = ControladorPrincipal.getInstance();
    }





    public void Ingresar(javafx.event.ActionEvent actionEvent) {
        try {
            if(controladorPrincipal.autenticar(campoTextoContraseña.getText(), campoTextoUsuario.getText()) ) {

                Persona persona = controladorPrincipal.buscarVendedorExcato(campoTextoContraseña.getText());

                if (persona instanceof Vendedor) {
                    this.usuarioLogueado = LoginUsuario.getInstancia();
                    usuarioLogueado.setUsuarioLogueado(persona);
                    controladorPrincipal.cerrarVentana(campoTextoUsuario);
                    controladorPrincipal.navegar("EstadisticaReferenteAVendedor.fxml", "menu principal ");

                } else if (persona instanceof Administrador) {
                    this.usuarioLogueado = LoginUsuario.getInstancia();
                    usuarioLogueado.setUsuarioLogueado(persona);
                    controladorPrincipal.cerrarVentana(campoTextoUsuario);
                    controladorPrincipal.navegar("EnviarCorreoAVendedores", "Menu administrador");


                }

            } else {
                controladorPrincipal.mostrarAlerta("Usuario no identificado", Alert.AlertType.INFORMATION);
            }

        }catch (Exception e){
            controladorPrincipal.mostrarAlerta(e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    public void registrarse(javafx.event.ActionEvent actionEvent) {
        controladorPrincipal.cerrarVentana(campoTextoUsuario);
        controladorPrincipal.navegar("CrearCuenta.fxml", "Creacion de cuenta ");

    }
}



