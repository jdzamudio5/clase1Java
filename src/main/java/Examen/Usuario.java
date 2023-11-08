package Examen;

public class Usuario extends Persona{
    String usuario;
    String clave;
    boolean cliente;
    public static void ingresarSistema(){
    }
    //aqui van los getter y setter
    public String getUsuario() {
        return usuario;
    }

    public boolean isCliente() {
        return cliente;
    }
    public void setCliente(boolean cliente) {
        this.cliente = cliente;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }

    public Usuario(String nombre, byte edad, char genero, String direccion, String usuario, String clave, boolean cliente) {
        super(nombre, edad, genero, direccion);
        this.usuario = usuario;
        this.clave = clave;
        this.cliente = cliente;
    }
}
