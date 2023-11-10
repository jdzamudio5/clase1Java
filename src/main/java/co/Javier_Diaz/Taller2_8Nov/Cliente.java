package co.Javier_Diaz.Taller2_8Nov;

public class Cliente extends Persona {
    // Atributos y métodos de Cliente
    private Cuenta cuenta;

    private String Usuario;
    private String Contrasena;

    public Cliente(String nombres, String apellidos, String numero_Documento,String Usuario,String Contrasena) {
        super(nombres, apellidos, numero_Documento);
        this.Usuario = Usuario;
        this.Contrasena = Contrasena;
    }

    public Cliente() {
        super();

    }

    public Cliente(String nombres, String apellidos, String numero_Documento) {
        super(nombres, apellidos, numero_Documento);
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
}
