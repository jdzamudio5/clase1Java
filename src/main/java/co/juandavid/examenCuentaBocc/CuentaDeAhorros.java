package co.juandavid.examenCuentaBocc;

import javax.swing.*;

class CuentaDeAhorros {
    Cliente cliente;

    public CuentaDeAhorros(Cliente cliente) {
        this.cliente = cliente;
    }

    public void depositar(double cantidad) {
        cliente.saldo += cantidad;
        JOptionPane.showMessageDialog(null,"Depósito realizado. Saldo actual: $" + cliente.saldo);
    }

    public void verSaldo() {
        JOptionPane.showMessageDialog(null,"Saldo actual: $" + cliente.saldo);
    }

    public void retirar(double cantidad) {
        if (cantidad <= cliente.saldo) {
            cliente.saldo -= cantidad;
            JOptionPane.showMessageDialog(null,"Retiro realizado. Saldo actual: $" + cliente.saldo);

        } else {
            JOptionPane.showMessageDialog(null,"Saldo insuficiente para realizar el retiro.");
        }
    }
}
