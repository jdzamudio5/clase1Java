package co.MiguelAcevedo.ExamenCuenta;

public class Cliente extends Persona {
    private boolean clienteExiste;
    private String nombre;
    private String apellido;
    private int identificacionUsuario;
    public Cliente(String nombre, String apellido, int identificacionUsuario, boolean clienteExiste) {
        super(nombre, apellido, identificacionUsuario);
        this.nombre=nombre;
        this.apellido=apellido;
        this.identificacionUsuario=identificacionUsuario;
        this.clienteExiste = clienteExiste;
    }

    public boolean isClienteExiste() {
        return clienteExiste;
    }

    public void setClienteExiste(boolean clienteExiste) {
        this.clienteExiste = clienteExiste;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public int getIdentificacionUsuario() {
        return identificacionUsuario;
    }

    public void setIdentificacionUsuario(int identificacionUsuario) {
        this.identificacionUsuario = identificacionUsuario;
    }
}
