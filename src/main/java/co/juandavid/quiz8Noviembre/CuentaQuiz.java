package co.juandavid.quiz8Noviembre;

import java.util.ArrayList;

public class CuentaQuiz {
    private int numCuenta;
    private double saldoCuenta;
    private static ArrayList<CuentaQuiz> cuentasClientes = new ArrayList<CuentaQuiz>();

    public CuentaQuiz(int numCuenta, double saldoCuenta) {
        this.numCuenta = numCuenta;
        this.saldoCuenta = saldoCuenta;
    }

    public static ArrayList<CuentaQuiz> getCuentasClientes() {
        return cuentasClientes;
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

}