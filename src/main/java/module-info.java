module interfaces.proyectofinalgrafico {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens interfaces.proyectofinalgrafico to javafx.fxml;
    exports interfaces.proyectofinalgrafico.Controladores;
    opens interfaces.proyectofinalgrafico.Controladores to javafx.fxml;
    exports interfaces.proyectofinalgrafico.Controladores.ControladoreSecundarios;
    opens interfaces.proyectofinalgrafico.Controladores.ControladoreSecundarios to javafx.fxml;
}