package org.MiguelAcevedo.DoWhile;

import javax.swing.*;

public class Menu {
    public static void main(String[] args) {
        int menu=1;

        do{
            switch (menu){
                case 1:
                    System.out.println("Bienvenido a facturación.");
                    break;
                case 2:
                    System.out.println("Bienvenido a soporte.");
                    break;
                case 3:
                    System.out.println("Bienvenido a cancelación.");
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("opción incorrecta");
            }
            System.out.println("Menú: \n1: Facturación \n2: Soporte \n3: Cancelacion \n4: Salir");
            menu = Integer.parseInt(JOptionPane.showInputDialog("Ingresa una opción: "));

        }while (menu!=4);
    }
}
