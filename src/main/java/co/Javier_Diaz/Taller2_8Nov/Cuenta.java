package co.Javier_Diaz.Taller2_8Nov;

public class Cuenta {
    private int Numero_Cuenta;
    private double Saldo;

    private boolean EstadoCuenta;

    public Cuenta(int numero_Cuenta, double saldo, boolean estadoCuenta) {
        Numero_Cuenta = numero_Cuenta;
        Saldo = saldo;
        EstadoCuenta = estadoCuenta;
    }

    public int getNumero_Cuenta() {
        return Numero_Cuenta;
    }

    public void setNumero_Cuenta(int numero_Cuenta) {
        Numero_Cuenta = numero_Cuenta;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    public boolean getEstadoCuenta() {
        return EstadoCuenta;
    }

    public void setEstadoCuenta(boolean estadoCuenta) {
        EstadoCuenta = estadoCuenta;
    }
}