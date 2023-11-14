package Examen;

public class Usuario extends Persona{
    private String usuario;
    private String clave;
    private boolean cliente;
    public static void ingresarSistema(){ }
    public String getUsuario() {return usuario;}
    public void setUsuario(String usuario) {this.usuario = usuario;}
    public String getClave() {return clave;}
    public void setClave(String clave) {this.clave = clave;}
    @Override
    public boolean isCliente() {return cliente;}
    @Override
    public void setCliente(boolean cliente) {this.cliente = cliente;}

    //Constructores

    public Usuario(double cedula, String nombre, String apellido, int edad, String genero, String direccion, boolean cliente, String usuario, String clave, boolean cliente1) {
        super(cedula, nombre, apellido, edad, genero, direccion, cliente);
        this.usuario = usuario;
        this.clave = clave;
        this.cliente = cliente1;
    }
}
