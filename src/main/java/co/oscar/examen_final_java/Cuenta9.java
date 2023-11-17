package co.oscar.examen_final_java;

import javax.swing.*;

public class Cuenta9 {

    private double saldo;
    private int numeroCuenta;
    private String tipoCuenta;
    private String clienteId; // Campo adicional para asociar la cuenta con un cliente

    public Cuenta9(double saldoInicial, String tipoCuenta, String clienteId) {
        this.clienteId = clienteId;
        if (saldoInicial < 50000) {
            JOptionPane.showMessageDialog(null,
                    "El Monto mínimo para abrir una cuenta es de 50.000. No se pudo crear la cuenta.");
            return;
        }
        this.saldo = saldoInicial;
        this.tipoCuenta = tipoCuenta;
        // La generación del número de cuenta se maneja en Banco9
    }

    public void saldo() {
        JOptionPane.showMessageDialog(null,
                "Total saldo: " + this.saldo);
    }

    public void consignar(double monto) {
        this.saldo += monto;
        JOptionPane.showMessageDialog(null,
                "Su consignación fue exitosa. Su nuevo saldo es: " + this.saldo);
    }

    public void retirar(double monto) {
        if (monto > this.saldo) {
            JOptionPane.showMessageDialog(null,
                    "Saldo Insuficiente");
        } else {
            this.saldo -= monto;
            JOptionPane.showMessageDialog(null,
                    "Retiro exitoso" + "\n Nuevo saldo: " + this.saldo);
        }
    }

    // Getters
    public double getSaldo() {
        return this.saldo;
    }

    public int getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public String getTipoCuenta() {
        return this.tipoCuenta;
    }

    public String getClienteId() {
        return this.clienteId;
    }

    // Setters
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }
}