package org.MiguelAcevedo.DoWhile;

import javax.swing.*;

public class MenuFor {
    public static void main(String[] args) {
        int opcion = 1;

        do {
            JOptionPane.showMessageDialog(null, "Seleccione la opción: \n1. Facturación \n2. Soporte \n3. Cancelacion \n4. Salir");

            if (opcion == 1) {
                System.out.println("Bienvenido a facturación");
            } else if (opcion == 2) {
                System.out.println("Bienvenido a soporte");
            } else if (opcion == 3) {
                System.out.println("Bienvenido a cancelación.");
            } else if (opcion == 4) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción incorrecta.");
            }
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la opción: "));
        } while (opcion!=4);
    }
}
