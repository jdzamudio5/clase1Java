package org.RETO_JAVA_1;

public class Main {
    public static void main(String[] args) {
        // Crear un array de enteros con los valores dados
        int[] numeros = {5, 10, 3, 8, 15, 7, 2, 9, 1, 6};
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println(); //

        // Inicializar variables
        int suma = 0;
        int maximo = numeros[0];
        int minimo = numeros[0];

        // Recorrer el array para calcular suma, promedio, máximo y mínimo
        for (int num : numeros) {
            suma += num;
            if (num > maximo) {
                maximo = num;
            }
            if (num < minimo) {
                minimo = num;
            }
        }

        // Calcular el promedio
        double promedio = (double) suma / numeros.length;

        // Mostrar resultados
        System.out.println("Suma de elementos: " + suma);
        System.out.println("Promedio de elementos: " + promedio);
        System.out.println("Elemento máximo: " + maximo);
        System.out.println("Elemento mínimo: " + minimo);

        // Identificar y mostrar números primos, y reemplazarlos por cero
        System.out.print("Números primos en el array: ");
        for (int i = 0; i < numeros.length; i++) {
            if (esPrimo(numeros[i])) {
                System.out.print(numeros[i] + " ");
                numeros[i] = 0;
            }
        }

        // Imprimir el array modificado
        System.out.println("\nArray después de reemplazar primos por ceros:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }

    // Método para determinar si un número es primo
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
