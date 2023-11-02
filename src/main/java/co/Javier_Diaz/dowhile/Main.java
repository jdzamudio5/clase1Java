package co.Javier_Diaz.dowhile;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int Menu=1;

        do {
            switch (Menu){
                case 1:
                    System.out.println("Bienvenido a Facturacion");
                    break;
                case 2:
                    System.out.println("Bienvenido a soporte");
                    break;
                case 3:
                    System.out.println("Bienvenido a Cancelacion");
                    break;
                case 4:
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("Opcion Incorreta");

            }

            System.out.println("Menu: \n1: Facturación \n2: Soporte \n3: Cancelación \n4: Salir");
            Menu = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la Opcion: "));

        }while(Menu!=4);


    }
}
