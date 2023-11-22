package co.juandavid.quiz8Noviembre;

import java.util.ArrayList;

public class CuentaQuiz {
    private int numCuenta;
    private double saldoCuenta;
    private static ArrayList<CuentaQuiz> cuentasClientes = new ArrayList<CuentaQuiz>();
    private ClienteQuiz clienteQuiz;

    public CuentaQuiz(int numCuenta, double saldoCuenta, ClienteQuiz clienteQuiz) {
        this.numCuenta = numCuenta;
        this.saldoCuenta = saldoCuenta;
        this.clienteQuiz = clienteQuiz;
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

    public static ArrayList<CuentaQuiz> getCuentasClientes() {
        return cuentasClientes;
    }

    public static void setCuentasClientes(ArrayList<CuentaQuiz> cuentasClientes) {
        CuentaQuiz.cuentasClientes = cuentasClientes;
    }

    public ClienteQuiz getClienteQuiz() {
        return clienteQuiz;
    }

    public void setClienteQuiz(ClienteQuiz clienteQuiz) {
        this.clienteQuiz = clienteQuiz;
    }
}