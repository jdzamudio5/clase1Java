package co.MiguelAcevedo.ExamenCuenta;

import java.util.ArrayList;
import java.util.Random;

public class Cuenta {
    private ArrayList<Cuenta> cuentas;
    //Cliente cliente = new Cliente();

    public Cuenta(){
        cuentas = new ArrayList<>();
    }
    private String tipoCuenta;
    private int numCuenta;
    //private int identificacionUsuario;
    private double saldoCuenta;
    private Cliente cliente;
    Random rand = new Random();
    public Cuenta(String tipoCuenta, int numCuenta, double saldoCuenta, Cliente cliente) {
        this.tipoCuenta = tipoCuenta;
        this.numCuenta=numCuenta;
        this.saldoCuenta= 50000;
        this.cliente=cliente;
    }

    public Cuenta(Cliente cliente) {
        this.cliente=cliente;
    }
    public void crearCuenta(Cliente cliente){
        Cuenta cuenta = new Cuenta(cliente);
        cuentas.add(cuenta);
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
