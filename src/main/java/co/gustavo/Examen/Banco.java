package co.gustavo.Examen;

import javax.swing.*;
import java.util.ArrayList;

public class Banco {

    private static String nombre;
    private static ArrayList<Cuenta> cuentas;

    public Banco(String nombre) {
        this.nombre = nombre;
        this.cuentas = new ArrayList<>();
    }





    public static void abrirCuenta(Cuenta cuenta) {
        if (cuenta.getSaldo() >= 50000) {
            cuentas.add(cuenta);
            JOptionPane.showMessageDialog(null,"Se abrió una nueva cuenta en " + nombre + " con número: " + cuenta.getNumeroCuenta());
        } else {
            JOptionPane.showMessageDialog(null,"El saldo inicial minimo 50,000 para abrir la cuenta en " + nombre);
        }
    }


    public static void mostrarCuentas() {
        System.out.println("Cuentas en el banco " + nombre + ":");
        for (Cuenta cuenta : cuentas) {
            System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta() + " - Saldo: " + cuenta.getSaldo());
        }
    }

    public static Cuenta buscarCuenta(String numeroCuenta) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumeroCuenta().equals(numeroCuenta)) {
                return cuenta;
            }
        }
        System.out.println("Cuenta no encontrada.");
        return null;
    }

    public static void deposito(double cantidad, Persona titular) {
        if (cantidad > 0) {
            JOptionPane.showMessageDialog(null,"depósito en efectivo de " + cantidad + " por " + titular.getNombre());
        } else {
            JOptionPane.showMessageDialog(null,"El valor a depositar debe ser mayor que cero");
        }
    }

    public static void retiro(double cantidad, Persona titular) {
        if (cantidad > 0) {
            JOptionPane.showMessageDialog(null,"Retiro en efectivo de " + cantidad + " unidades por " + titular.getNombre());
        } else {
            JOptionPane.showMessageDialog(null,"El valor a retirar debe ser mayor que cero");
        }
    }






}
