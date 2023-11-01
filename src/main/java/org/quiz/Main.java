package org.quiz;

import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] enteros={5,10,3,8,15,7,2,9,1,6};

        int suma=0;
        for(int i = 0; i < enteros.length; i++) {
            suma+=enteros[i];
        }
        JOptionPane.showMessageDialog(null, "La suma de los datos del array es: "+suma);

        double promedio = (double) suma/enteros.length;
        JOptionPane.showMessageDialog(null, "El promedio de los datos del array es: "+promedio);

        int maximo = enteros[0];
        for (int i = 1; i < enteros.length; i++){
            if (enteros[i] > maximo) {
                maximo = enteros[i];
            }
        }
        JOptionPane.showMessageDialog(null, "El valor maximo es: "+maximo);

        int minimo = enteros[0];
        for (int i = 1; i < enteros.length; i++){
            if (enteros[i] < minimo) {
                minimo = enteros[i];
            }
        }
        JOptionPane.showMessageDialog(null, "El valor minimo es: "+minimo);

        //Numeros primos
        for (int i=0; i<enteros.length; i++){
            int aux=0;
            for (int j=1; j<=enteros[i]; j++){
                if (enteros[i] % j ==0){
                    aux++;
                }
            }
            if (aux==2){
                System.out.print(enteros[i]+" ");
            }
        }

        System.out.println();

        //Reemplazar números primos por cero
        for (int i=0; i<enteros.length; i++){
            int aux=0;
            for (int j=1; j<=enteros[i]; j++){
                if (enteros[i] % j ==0){
                    aux++;
                }
            }
            if (aux==2){
                enteros[i]=0;
            }
            System.out.print(enteros[i]+", ");
        }

    }
}
