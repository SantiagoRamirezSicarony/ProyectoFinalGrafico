package interfaces.proyectofinalgrafico.DOT;



import java.io.Serializable;

public class EstadisticaVendedor implements Serializable {
    private static final long serialVersionUID = 1L;

    private int productosVendidos;
    private int productosPublicados;
    private int mensajesEnviados;
    public EstadisticaVendedor() {}
    
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public int getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductosVendidos(int productosVendidos) {
        this.productosVendidos = productosVendidos;
    }

    public int getProductosPublicados() {
        return productosPublicados;
    }

    public void setProductosPublicados(int productosPublicados) {
        this.productosPublicados = productosPublicados;
    }

    public int getMensajesEnviados() {
        return mensajesEnviados;
    }

    public void setMensajesEnviados(int mensajesEnviados) {
        this.mensajesEnviados = mensajesEnviados;
    }


    

}
