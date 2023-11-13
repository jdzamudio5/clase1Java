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
    public Cuenta(Cliente cliente) {
        this.cliente=cliente;
    }
    public int getNumCuenta() {
        return numCuenta;
    }
    public Cuenta saldoCuenta(){
            if (numCuenta<=50000){
                JOptionPane.showMessageDialog(null,"El valor inicial debe ser mayor a $50.000. ");
            }return null;
    }
    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }
}
