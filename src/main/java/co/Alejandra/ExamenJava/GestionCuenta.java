package co.Alejandra.ExamenJava;

import javax.swing.*;
import java.util.ArrayList;

import static co.Alejandra.ExamenJava.Cliente.Clientes;
import static co.Alejandra.ExamenJava.Cliente.getClientes;

public class GestionCuenta {

    public static ArrayList<Cuenta> cuentas = new ArrayList<>();

    public static ArrayList<Cuenta> getCuentas(){
        return cuentas;
    }
    public void crearCuenta(){
        double saldoCuenta=0;

        int identificacionCliente = Integer.parseInt(JOptionPane.
                showInputDialog(null, "Ingrese la identidicacion del cliente: "));

        for (int j=0; j< Clientes.size(); j++){
            if (getClientes().get(j).getIdentificacionUsuario()==identificacionCliente){
                int numCuenta = Integer.parseInt(JOptionPane.
                        showInputDialog(null, "Ingrese el número de cuenta: "));
                while (saldoCuenta<50000){
                    saldoCuenta = Double.parseDouble(JOptionPane.
                            showInputDialog(null,"Ingrese saldo de cuenta:"));
                    if (saldoCuenta<50000){
                        JOptionPane.showMessageDialog(null, "El valor minimo para abrir su cuenta es de 50.000");
                    } else if (saldoCuenta>=50000) {
                        Cuenta cuentas = new Cuenta(identificacionCliente,numCuenta,saldoCuenta);
                        if (GestionCuenta.cuentas.isEmpty()){
                            GestionCuenta.cuentas.add(0,cuentas);
                            JOptionPane.showMessageDialog(null, "Su número de cuenta es: "+
                                    getCuentas().get(0).getCuenta()+
                                    "\nSu saldo actual es:"+getCuentas().get(0).getSaldo());
                        }else {
                            for (int i = 0; i< GestionCuenta.cuentas.size(); i++){
                                GestionCuenta.cuentas.add(i,cuentas);
                                JOptionPane.showMessageDialog(null, "Su número de cuenta es: "+
                                        getCuentas().get(i).getCuenta()+
                                        "\nSu saldo actual es:"+getCuentas().get(i).getSaldo());
                            }
                        }
                    }
                }
            }
        }
    }

    public void consignarDinero(){
        int numCuenta = Integer.parseInt(JOptionPane.
                showInputDialog(null, "Ingrese el numero de la cuenta:"));

        for (int i = 0; i< cuentas.size(); i++){
            if ( getCuentas().get(i).getCuenta() == numCuenta) {
                double nuevosaldoCuenta = Double.parseDouble(JOptionPane.
                        showInputDialog(null, "Ingrese el valor a depositar:"));
                nuevosaldoCuenta = getCuentas().get(i).getSaldo()+nuevosaldoCuenta;

                int idCliente=getCuentas().get(i).getIdcliente();
                Cuenta nuevoSaldo = new Cuenta(idCliente,numCuenta,nuevosaldoCuenta);
                cuentas.set(i, nuevoSaldo);
            }
        }
    }

    public void consultaSaldo(){
        int numCuenta = Integer.parseInt(JOptionPane.
                showInputDialog(null, "Ingrese el numero de la cuenta:"));
        for (int i = 0; i< cuentas.size(); i++){
            if (getCuentas().get(i).getCuenta() == numCuenta) {
                JOptionPane.showMessageDialog(null, "Su saldo actual es: "+
                        getCuentas().get(i).getSaldo());
            }
        }
    }

    public void retirarDinero(){
        int numCuenta = Integer.parseInt(JOptionPane.
                showInputDialog(null, "Ingrese el numero de la cuenta:"));

        for (int i = 0; i< cuentas.size(); i++){
            if ( getCuentas().get(i).getCuenta() == numCuenta) {
                double nuevosaldoCuenta = Double.parseDouble(JOptionPane.
                        showInputDialog(null, "Ingrese el valor a retirar:"));
                nuevosaldoCuenta = getCuentas().get(i).getSaldo()-nuevosaldoCuenta;

                int idCliente=getCuentas().get(i).getIdcliente();
                Cuenta nuevoSaldo = new Cuenta(idCliente,numCuenta,nuevosaldoCuenta);
                cuentas.set(i, nuevoSaldo);
            }
        }
    }

}
