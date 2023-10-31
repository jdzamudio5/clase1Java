package org.quizGabriel;
import javax.swing.*;
public class quizGabriel {
    public static void main(String[] args) {
        // Suma numeros
        int suma=0;
        int [] cadenaEnteros={5,10,3,8,15,7,2,9,1,6};
        for(int i = 0; i < cadenaEnteros.length; i++ ){
        suma = suma + cadenaEnteros[i];
        }
        JOptionPane.showMessageDialog(null,"La suma total es: "+ suma);

        //Promedio
        double promedio = suma / cadenaEnteros.length;
        JOptionPane.showMessageDialog(null,"El promedio es: "+ promedio);
        //Mayor-Menor
        int mayor=cadenaEnteros[0];
        int menor=cadenaEnteros[0];
        for(int i = 0; i < cadenaEnteros.length; i++ ){
            if(cadenaEnteros[i]>mayor){
                mayor = cadenaEnteros[i];
            }

            if(cadenaEnteros[i]<menor){
                menor = cadenaEnteros[i];
            }
        }
        JOptionPane.showMessageDialog(null,"El numero mayor es: "+ mayor + " y el menor es: "+ menor);
        //Es primo?
        System.out.print("Números primos en la cadena: ");
        for (int numero : cadenaEnteros) {
            if (esPrimo(numero)) {
                System.out.print(numero + " ");
            }
        }
        System.out.println("\n");
        //Reemplazar e imprimir
        for (int i = 0; i < cadenaEnteros.length; i++) {
            if (esPrimo(cadenaEnteros[i])) {
                cadenaEnteros[i] = 0;
            }
        }

        System.out.print("Array con primos reemplazados por cero: ");
        for (int numero : cadenaEnteros) {
            System.out.print(numero + " ");
        }


    }
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero <= 3) {
            return true;
        }
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }


}
