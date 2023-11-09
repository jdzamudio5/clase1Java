package co.juandavid.examen2;

import javax.swing.*;

public class CuentaDeAhorros {
    private Cliente cliente;

    public CuentaDeAhorros(Cliente cliente) {
        this.cliente = cliente;
    }

    public void depositar(double cantidad) {
        double saldoActual = cliente.getSaldo();
        cliente.setSaldo(saldoActual + cantidad);
        JOptionPane.showMessageDialog(null, "Depósito realizado. Saldo actual: $" + cliente.getSaldo());
    }

    public void verSaldo() {

        JOptionPane.showMessageDialog(null, "Saldo actual: $" + cliente.getSaldo());
    }

    public void retirar(double cantidad) {
        double saldoActual = cliente.getSaldo();
        if (cantidad <= saldoActual) {
            cliente.setSaldo(saldoActual - cantidad);
            JOptionPane.showMessageDialog(null, "Retiro realizado. Saldo actual: $" + cliente.getSaldo());
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente para realizar el retiro.");
        }
    }
}
