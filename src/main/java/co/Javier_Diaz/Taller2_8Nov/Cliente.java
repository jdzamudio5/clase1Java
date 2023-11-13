package co.Javier_Diaz.Taller2_8Nov;

public class Cliente extends Persona {
    // Atributos y métodos de Cliente
    private Cuenta cuenta;

    private String Usuario;
    private String Contrasena;

    private boolean Estado_Cliente;


    public Cliente(Cuenta cuenta, String usuario, String contrasena, boolean estado_Cliente) {
        this.cuenta = cuenta;
        Usuario = usuario;
        Contrasena = contrasena;
        Estado_Cliente = estado_Cliente;
    }

    public Cliente(String nombres, String apellidos, String numero_Documento, Cuenta cuenta, String usuario, String contrasena, boolean estado_Cliente) {
        super(nombres, apellidos, numero_Documento);
        this.cuenta = cuenta;
        Usuario = usuario;
        Contrasena = contrasena;
        Estado_Cliente = estado_Cliente;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String contrasena) {
        Contrasena = contrasena;
    }

    public boolean getEstado_Cliente() {
        return Estado_Cliente;
    }

    public void setEstado_Cliente(boolean estado_Cliente) {
        Estado_Cliente = estado_Cliente;
    }
}
