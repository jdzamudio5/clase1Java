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
        System.out.println("la suma de los datos es: "+suma);
        JOptionPane.showMessageDialog(null,"la suma de los datos es: "+suma);

        double promedio=suma/enteros.length;
        JOptionPane.showMessageDialog(null,"El promedio es"+promedio);

        int maximo=enteros[0];
        int min=enteros[0];
        boolean primo=true;
        for (int i = 0; i < enteros.length; i++) {
            if (enteros[i]>maximo){
                maximo=enteros[i];
            }
            if (enteros[i]<min){
                min=enteros[i];
            }
        }

        JOptionPane.showMessageDialog(null,"el máximo número es: "+maximo);
        JOptionPane.showMessageDialog(null,"el máximo número es: "+min);


    }

}
