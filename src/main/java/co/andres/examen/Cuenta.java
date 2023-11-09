package co.andres.examen;

public class Cuenta {
    private int numeroCuenta;
    private double saldo;

    public Cuenta(int numeroCuenta, double saldoInicial) {
        if (saldoInicial < 50000) {
            throw new IllegalArgumentException("El saldo inicial debe ser al menos $50.000");
        }
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }
}
