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

    public Persona getTitular() {
        return titular;
    }


    //Metodos


    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Se depositaron " + cantidad + " unidades a la cuenta " + numeroCuenta);
        } else {
            System.out.println("La cantidad a depositar debe ser mayor que cero");
        }
    }


    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (saldo >= cantidad) {
                saldo -= cantidad;
                System.out.println("Se retiraron " + cantidad + " unidades de la cuenta " + numeroCuenta);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("La cantidad a retirar debe ser mayor que cero");
        }


    }

}