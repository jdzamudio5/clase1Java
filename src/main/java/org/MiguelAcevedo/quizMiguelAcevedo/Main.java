package org.MiguelAcevedo.quizMiguelAcevedo;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
//1-
        int[] num = {5, 10, 3, 8, 15, 7, 2, 9, 1, 6};
        int suma = 0;
//2-
        for (int i = 0; i < num.length; i++) {
            suma += num[i];
        }
        JOptionPane.showMessageDialog(null, "La suma del array es: " + suma);
//3-
        JOptionPane.showMessageDialog(null, "El promedio del array es: " + ((double) suma / num.length));
//4-
        int mayor = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > mayor) {
                mayor = num[i];
            }
        }
        JOptionPane.showMessageDialog(null, "El mayor del array es: " + mayor);
//5-
        int menor = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] < menor) {
                menor = num[i];
            }
        }
        JOptionPane.showMessageDialog(null, "El menor del array es: " + menor);
//6-
        System.out.println("Números primos:");
        for (int i = 0; i < num.length; i++) {
            if (esPrimo(num[i])) {
                System.out.println(num[i] + " ");
                //JOptionPane.showMessageDialog(null, "Los números primos del array son: " + num[i] + " ");
            }
        }
//7-
        for (int i=0;i<num.length;i++) {
            if (esPrimo(num[i])) {
                num[i] = 0;
            }
        }
//8
        System.out.println("ARRAY: ");
        for (int i=0; i<num.length;i++){
            System.out.println(num[i] + " ");
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

}

