package interfaces.proyectofinalgrafico.DTO;

public class LoginUsuario {
    public static LoginUsuario INSTANCIA;

    private Persona usuarioLogueado;

    public LoginUsuario() {}

    public static LoginUsuario getInstancia() {
        if (INSTANCIA == null) {
            INSTANCIA = new LoginUsuario();
        }
        return INSTANCIA;
    }




    public Persona getUsuarioLogueado() {
        return usuarioLogueado;
    }

    public void setUsuarioLogueado(Persona usuarioLogueado) {
        this.usuarioLogueado = usuarioLogueado;
    }
}
