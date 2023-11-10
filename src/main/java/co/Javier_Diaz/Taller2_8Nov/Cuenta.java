package co.Javier_Diaz.Taller2_8Nov;

public class Cuenta {
    private int Numero_Cuenta;
    private double Saldo;

    public Cuenta(int numero_Cuenta, double saldo) {
        Numero_Cuenta = numero_Cuenta;
        Saldo = saldo;
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
}