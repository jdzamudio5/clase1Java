package co.gustavo.Examen;

public class Cuenta {

    private String numeroCuenta;
    private double saldo;
    private Cliente titular; // Suponiendo que la clase Persona ya está definida

    public Cuenta(String numeroCuenta, double saldoInicial, Cliente titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.titular = titular;
    }

    // get

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }


}