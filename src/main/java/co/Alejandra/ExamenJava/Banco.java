package co.Alejandra.ExamenJava;

import javax.swing.*;

public class Banco {

    public static void inicio(){

        int Menu =0;
        do {
            switch (Menu){
                case 0:
                    JOptionPane.showMessageDialog(null, "Bienvenido al banco");
                    break;
                case 1:
                    System.out.println("Agregar Cliente");
                    Cliente clienteNuevo=new Cliente();
                    clienteNuevo.solicitarDatos();
                    break;
                case 2:
                    System.out.println("Crear cuenta");
                    GestionCuenta nuevaCuenta=new GestionCuenta();
                    nuevaCuenta.crearCuenta();
                    break;
                case 3:
                    System.out.println("Consignar dinero");
                    GestionCuenta consignar=new GestionCuenta();
                    consignar.consignarDinero();
                    break;
                case 4:
                    System.out.println("Consultar saldo");
                    GestionCuenta consulta=new GestionCuenta();
                    consulta.consultaSaldo();
                    break;
                case 5:
                    System.out.println("Retirar dinero");
                    GestionCuenta retirar=new GestionCuenta();
                    retirar.retirarDinero();
                    break;
                case 6:
                    System.out.println("Modificar cliente");
                    Cliente Actualizar=new Cliente();
                    Actualizar.actualizarDatos();
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
            Menu = Integer.parseInt(JOptionPane.showInputDialog("Menu \n1: Agregar Cliente " +
                    "\n2: Crear cuenta \n3: Consignar dinero \n4: Consultar saldo \n5: Retirar dinero"+
                    "\n6: Modificar cliente \n7: Salir"));

        }while (Menu!=7);
    }

}
