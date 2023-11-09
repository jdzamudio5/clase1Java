package co.Alejandra.ExamenJava;

public class Cuenta {

    private int idcliente;
    private int cuenta;
    private double saldo;

    public Cuenta(int idcliente, int cuenta, double saldo) {
        this.idcliente=idcliente;
        this.cuenta = cuenta;
        this.saldo = saldo;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public int getCuenta() {
        return cuenta;
    }

    public double getSaldo() {
        return saldo;
    }
}
