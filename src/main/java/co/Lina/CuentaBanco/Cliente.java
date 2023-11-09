package co.Lina.CuentaBanco;

public class Cliente extends Persona {

    int numeroCliente;
    int numeroCuentaCliente;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, int numero_Identificacion, int numeroCliente, int numeroCuentaCliente) {
        super(nombre, apellido, numero_Identificacion);
        this.numeroCliente = numeroCliente;
        this.numeroCuentaCliente = numeroCuentaCliente;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public int getNumeroCuentaCliente() {
        return numeroCuentaCliente;
    }

    public void setNumeroCuentaCliente(int numeroCuentaCliente) {
        this.numeroCuentaCliente = numeroCuentaCliente;
    }

}
