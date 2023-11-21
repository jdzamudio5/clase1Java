package co.juandavid.examenBocc;

import javax.swing.*;

public class Menu {
    public void menu_ingreso(){
        //Banco banco=new Banco();
        while (true) {
            int opcion=0;
            try {
                String mensaje = "\nBienvenido al banco de occidente\n¿Qué desea hacer?\n1. Ya eres cliente\n2. Quiero ser cliente\n3. Salir\n\nSeleccione una opción:";
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Ingrese un número entero");
            }


            switch (opcion) {
                case 1:
                    //double deposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad a depositar: "));

                    //banco.ingreso();
                    //cuenta.depositar(deposito);
                    break;
                case 2:
                    //cuenta.verSaldo();
                    //banco.registro();
                    break;
                case 3:
                    System.exit(0);
                    //cuenta.retirar(retiro);
                    break;
                default:
                    //JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, seleccione una opción válida.");
                    //break;
            }
        }
    }
}
