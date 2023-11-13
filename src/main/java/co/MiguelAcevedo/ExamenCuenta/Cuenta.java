package co.MiguelAcevedo.ExamenCuenta;

import javax.swing.*;
import java.util.ArrayList;

public class Cuenta {
    private ArrayList<Cliente> clientes;
    private ArrayList<Cliente> cuentas;

    public Cuenta(){
        clientes = new ArrayList<>();
        cuentas = new ArrayList<>();
    }
    private String tipoCuenta;
    private int numCuenta;
    private double saldoCuenta;
    private Cliente cliente;
    public Cuenta(String tipoCuenta, int numCuenta, double saldoCuenta, Cliente cliente) {
        this.tipoCuenta = tipoCuenta;
        this.numCuenta= numCuenta;
        this.saldoCuenta= saldoCuenta;
        this.cliente=cliente;
    }
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setCuentas(ArrayList<Cliente> cuentas) {
        this.cuentas = cuentas;
    }

    public Cuenta(Cliente cliente) {
        this.cliente=cliente;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public int getNumCuenta() {
        return numCuenta;
    }
    public Cuenta saldoCuenta(){
            if (numCuenta<=50000){
                JOptionPane.showMessageDialog(null,"El valor inicial debe ser mayor a $50.000. ");
            }return null;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
