package org.Quiz;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int acumulado = 0;
        double promedio;
        System.out.println("Quiz JAVA Automatizacion");
        int[] numeros = {5, 10, 3, 8, 15, 7, 2, 9, 1, 6};
        //Segundo punto
        System.out.println("La suma de los numeros es:");
        for (int i = 0; i < numeros.length; i++) {
            acumulado += numeros[i];
        }
        System.out.println(acumulado);
        //Tercer punto
        promedio = (double) acumulado / numeros.length;
        System.out.println("El promedio de los numeros es: " + promedio);
        System.out.println("Numero Maximo es: " + Arrays.stream(numeros).max().getAsInt());
        System.out.println("Numero Minimo es: " + Arrays.stream(numeros).min().getAsInt());

        //Validar numeros primos
        System.out.println("lo numeros primos son:");
        for(int i=0; i<numeros.length; i++){
            int esPrimo = 1;
            for(int j=2; j<=Math.sqrt(numeros[i]); j++){
                if(numeros[i] % j ==0){
                    esPrimo=0;
                    break;
                }
            }
            if(esPrimo == 1){
                System.out.println(numeros[i] + " es un numero primo");
            }
        }
        System.out.println("El contenido del array es:");
        for(int i=0; i<numeros.length; i++){
            System.out.print(numeros[i]+",");
        }
    }
}
