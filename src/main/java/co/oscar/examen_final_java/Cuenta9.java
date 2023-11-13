package co.oscar.examen_final_java;

import javax.swing.*;

public class Cuenta9 extends Banco9{

    private double saldo;
    private int numero_cuenta;
    private String tipo_cuenta;

    public Cuenta9(double saldo, int numero_cuenta, String tipo_cuenta) {
        this.saldo = saldo;
        this.numero_cuenta = numero_cuenta;
        this.tipo_cuenta = tipo_cuenta;
    }

    public Cuenta9() {
    }

    public Cuenta9(Object o, int numeroAleatorio) {
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public String getTipo_cuenta() {
        return tipo_cuenta;
    }

    public void setTipo_cuenta(String tipo_cuenta) {
        this.tipo_cuenta = tipo_cuenta;
    }

}
