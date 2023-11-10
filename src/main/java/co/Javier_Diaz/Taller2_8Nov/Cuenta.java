package co.Javier_Diaz.Taller2_8Nov;

public class Cuenta {
    private String Numero_Cuenta;
    private double Saldo;

    public Cuenta(String numero_Cuenta, double saldo) {
        Numero_Cuenta = numero_Cuenta;
        Saldo = saldo;
    }

    public String getNumero_Cuenta() {
        return Numero_Cuenta;
    }

    public void setNumero_Cuenta(String numero_Cuenta) {
        Numero_Cuenta = numero_Cuenta;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }
}