package co.MiguelAcevedo.ExamenCuenta;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class Cuenta {
    private ArrayList<Cliente> cuentas;
    //Cliente cliente = new Cliente();

    public Cuenta(){
        cuentas = new ArrayList<>();
    }
    private String tipoCuenta;
    private int numCuenta;
    //private int identificacionUsuario;
    private double saldoCuenta;
    private Cliente cliente;
        //Random rand = new Random();
    public Cuenta(String tipoCuenta, int numCuenta, double saldoCuenta, Cliente cliente) {
        this.tipoCuenta = tipoCuenta;
        //Random numAleatorio = new Random();
        //this.numCuenta=Math.abs(numAleatorio.nextInt(numCuenta));
        this.numCuenta= numCuenta;
        this.saldoCuenta= saldoCuenta;
        this.cliente=cliente;
    }

    public ArrayList<Cliente> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cliente> cuentas) {
        this.cuentas = cuentas;
    }

    public Cuenta(Cliente cliente) {
        this.cliente=cliente;
    }
    public void crearCuenta(Cliente cliente){
        Cuenta cuenta = new Cuenta(cliente);
        cuentas.add(cuenta.getCliente());
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
