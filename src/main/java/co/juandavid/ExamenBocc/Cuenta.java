package co.juandavid.ExamenBocc;

import co.juandavid.ExamenBocc.Cliente;

import javax.swing.*;

public class Cuenta {
    private Cliente cliente;

    private int numCuenta;
    private double saldoCuenta;



    public Cuenta(Cliente cliente, int numCuenta, double saldoCuenta) {
        this.cliente = cliente;
        this.numCuenta = numCuenta;
        this.saldoCuenta = saldoCuenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public void depositar(double depositar){
        //JOptionPane.showMessageDialog(null, "Saldo actual: $" + cliente.getSaldo());

    }
    public void consultarSaldo(){
        //JOptionPane.showMessageDialog(null, "Saldo actual: $" + cliente.getSaldo());
    }
    public void retirar(double retiro){

    }


}
