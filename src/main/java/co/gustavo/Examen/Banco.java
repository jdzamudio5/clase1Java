package co.gustavo.Examen;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Banco {

    private static String nombre;
    public static ArrayList<Cuenta> cuentas=new ArrayList<>();


    public static void abrirCuenta(Cuenta cuenta) {
        if (cuenta.getSaldo() >= 50000) {
            cuentas.add(0,cuenta);
            JOptionPane.showMessageDialog(null,"Se abrió una nueva cuenta en " + nombre + " con número: " + cuenta.getNumeroCuenta());
        } else {
            JOptionPane.showMessageDialog(null,"El saldo inicial minimo 50,000 para abrir la cuenta en " + nombre);
        }
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
