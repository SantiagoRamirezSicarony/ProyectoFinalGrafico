package interfaces.proyectofinalgrafico.Controladores.ControladoreSecundarios;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class MyController {
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


    @FXML
    private void handleButtonClick() {
        System.out.println("Botón presionado");
        // Lógica adicional aquí
    }
}
