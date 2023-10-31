package org.quizjdz;

import javax.swing.*;

public class Array {
    public static void main(String[] args) {
        int[] enteros=new int[10];
        enteros[0] =5;
        enteros[1] =10;
        enteros[2] =3;
        enteros[3] =8;
        enteros[4] =15;
        enteros[5] =7;
        enteros[6] =2;
        enteros[7] =9;
        enteros[8] =1;
        enteros[9] =6;
        int suma=0;
        for (int i = 0; i < enteros.length; i++) {
            suma=suma+enteros[i];

        }
        //System.out.println("la suma de los datos es: "+suma);
        JOptionPane.showMessageDialog(null,"la suma de los datos es: "+suma);

        double promedio=suma/enteros.length;
        JOptionPane.showMessageDialog(null,"El promedio es"+promedio);

        int maximo=enteros[0];
        int min=enteros[0];

        for (int i = 0; i < enteros.length; i++) {
            if (enteros[i]>maximo){
                maximo=enteros[i];
            }
            if (enteros[i]<min){
                min=enteros[i];
                //System.out.println(min);
            }
        }

        JOptionPane.showMessageDialog(null,"el maximo numero es: "+maximo);
        JOptionPane.showMessageDialog(null,"el minimo numero es: "+min);
        for (int i = 0; i < enteros.length; i++) {
            int cantidad = 0;
            for (int j = 1; j <= enteros[i]; j++) {
                if (enteros[i] % j == 0) {
                    cantidad++;
                }
            }

            if (cantidad == 2 || enteros[i] == 1) {

                System.out.println(enteros[i] + " es primo");
                //JOptionPane.showMessageDialog(null,enteros[i] + " es primo");
            } else {
                //JOptionPane.showMessageDialog(null,enteros[i] + " No es primo");
                System.out.println(enteros[i] + " no es primo");
            }
        }
        for (int i = 0; i <enteros.length ; i++) {
            int cantidad = 0;
            for (int j = 1; j <=enteros.length ; j++) {
                if (enteros[i]%j == 0) {
                    cantidad++;
                }
            }
            if (cantidad==2 || enteros[i]==1){
                enteros[i]=0;
            }
        }
        for (int i = 0; i <enteros.length ; i++) {

            System.out.print(enteros[i]+" ");
            //JOptionPane.showMessageDialog(null,enteros[i]+" ");

        }
    }

}
