package QUIZ_Java_2;

import javax.swing.*;

public class Cuenta {
    private String numeroCuenta;
    private  double saldo;
    private  Cliente titular;

    public Cuenta(String numeroCuenta, double saldo, Cliente titular) {
        this.numeroCuenta = numeroCuenta;
        if(saldo>=50000){
            this.saldo = saldo;
        }else {
            JOptionPane.showMessageDialog(null,
                    "El Monto minimo para abrir una cuenta es de 50.000\n No se pudo crear la cuenta");
            this.saldo =0;
        }
        this.titular = titular;
    }
    public void depositar(double monto){
        saldo+=monto;
        JOptionPane.showMessageDialog(null,
                "Se deposito exitosamente. Su valor es de: "+saldo);

    }
    public void retirar(double monto){
        if (monto>saldo){
            JOptionPane.showMessageDialog(null,
                    "Saldo Insuficiente");

        }else {
            saldo-=monto;
            JOptionPane.showMessageDialog(null,
                    "Retiro exitoso"+"\n Nuevo saldo es: "+saldo);
        }

    }
    public void verSaldo(){
        JOptionPane.showMessageDialog(null,
                "SU Saldo es: "+saldo);
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}
