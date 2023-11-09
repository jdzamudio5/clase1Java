package co.Alejandra.ExamenJava;

import javax.swing.*;
import java.util.ArrayList;

import static co.Alejandra.ExamenJava.Cliente.Clientes;

public class GestionCuenta {

    public static ArrayList<Cuenta> Cuentas = new ArrayList<>();

    public static ArrayList<Cuenta> getCuentas(){
        return Cuentas;
    }
    public void crearCuenta(){
        double saldoCuenta=0;

        int identificacionCliente = Integer.parseInt(JOptionPane.
                showInputDialog(null, "Ingrese la identidicacion del cliente: "));
        int numCuenta = Integer.parseInt(JOptionPane.
                showInputDialog(null, "Ingrese el numero de la cuenta:"));

        while (saldoCuenta<50000){
            saldoCuenta = Double.parseDouble(JOptionPane.
                    showInputDialog(null,"Ingrese saldo de cuenta:"));
            if (saldoCuenta<50000){
                JOptionPane.showMessageDialog(null, "El valor minimo para abrir su cuenta es de 50.000");
            } else if (saldoCuenta>=50000) {
                Cuenta cuentas = new Cuenta(identificacionCliente,numCuenta,saldoCuenta);
                if (Cuentas.isEmpty()){
                    Cuentas.add(0,cuentas);
                    JOptionPane.showMessageDialog(null, "Su saldo actual es: "+
                            getCuentas().get(0).getSaldo());
                }else {
                    for (int i=0; i<Cuentas.size(); i++){
                        Cuentas.add(i,cuentas);
                        JOptionPane.showMessageDialog(null, "Su saldo actual es: "+
                                getCuentas().get(i).getSaldo());
                    }
                }
            }
        }
    }

    public void consignarDinero(){
        int numCuenta = Integer.parseInt(JOptionPane.
                showInputDialog(null, "Ingrese el numero de la cuenta:"));

        for (int i=0; i<Cuentas.size(); i++){
            if ( getCuentas().get(i).getCuenta() == numCuenta) {
                double nuevosaldoCuenta = Double.parseDouble(JOptionPane.
                        showInputDialog(null, "Ingrese el valor a depositar:"));
                nuevosaldoCuenta = getCuentas().get(i).getSaldo()+nuevosaldoCuenta;

                int idCliente=getCuentas().get(i).getIdcliente();
                Cuenta nuevoSaldo = new Cuenta(idCliente,numCuenta,nuevosaldoCuenta);
                Cuentas.set(i, nuevoSaldo);
            }
        }
    }

    public void consultaSaldo(){
        int numCuenta = Integer.parseInt(JOptionPane.
                showInputDialog(null, "Ingrese el numero de la cuenta:"));
        for (int i=0; i<Cuentas.size(); i++){
            if (getCuentas().get(i).getCuenta() == numCuenta) {
                JOptionPane.showMessageDialog(null, "Su saldo actual es: "+
                        getCuentas().get(i).getSaldo());
            }
        }
    }

    public void retirarDinero(){
        int numCuenta = Integer.parseInt(JOptionPane.
                showInputDialog(null, "Ingrese el numero de la cuenta:"));

        for (int i=0; i<Cuentas.size(); i++){
            if ( getCuentas().get(i).getCuenta() == numCuenta) {
                double nuevosaldoCuenta = Double.parseDouble(JOptionPane.
                        showInputDialog(null, "Ingrese el valor a retirar:"));
                nuevosaldoCuenta = getCuentas().get(i).getSaldo()-nuevosaldoCuenta;

                int idCliente=getCuentas().get(i).getIdcliente();
                Cuenta nuevoSaldo = new Cuenta(idCliente,numCuenta,nuevosaldoCuenta);
                Cuentas.set(i, nuevoSaldo);
            }
        }
    }

}