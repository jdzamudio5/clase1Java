package co.juandavid.ExamenBocc;

import co.juandavid.examen2.Cliente;

import javax.swing.*;

public class Cuenta {
    private Cliente cliente;
    public Cuenta(Cliente cliente) {

        this.cliente = cliente;
    }

    public Cuenta() {

    }

    public void depositar(double depositar){
        double saldoActual=cliente.getSaldo();
        cliente.setSaldo(saldoActual+depositar);
        JOptionPane.showMessageDialog(null, "Depósito realizado. Saldo actual: $" + cliente.getSaldo());

    }
    public void consultarSaldo(){
        JOptionPane.showMessageDialog(null, "Saldo actual: $" + cliente.getSaldo());
    }
    public void retirar(double retiro){
        double saldoActual=cliente.getSaldo();
        if (saldoActual<=retiro){
            cliente.setSaldo(saldoActual-retiro);
            JOptionPane.showMessageDialog(null, "Retiro realizado. Saldo actual: $" + cliente.getSaldo());
        }else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente para realizar el retiro.");
        }


    }


}
