package co.MiguelAcevedo.ExamenCuenta;

public class Cuenta_Cliente extends Cliente {
    private Cuenta cuenta;

    public Cuenta_Cliente(String nombre, String apellido, int identificacionUsuario, boolean clienteExiste, Cuenta cuenta) {
        super(nombre, apellido, identificacionUsuario, clienteExiste);
        this.cuenta=cuenta;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
}
