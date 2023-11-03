package co.Alejandra.cicloWhile;

import javax.swing.*;

public class DoWhile {
    public static void main(String[] args) {
        int contador=1;
        do{
            System.out.println(contador);
            contador++;
        }while (contador<=5);

        int Menu =1;

        do {
            switch (Menu){
                case 1:
                    System.out.println("Bienvenido a facturación");
                    break;
                case 2:
                    System.out.println("Bienvenido a soporte");
                    break;
                case 3:
                    System.out.println("Bienvenido a cancelación");
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }

            System.out.println("Menu: \n1: Facturacion \n2: Soporte \n3: Cancelacion \n4: Salir");
            Menu = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la opcion"));

        }while (Menu!=4);
    }
}
