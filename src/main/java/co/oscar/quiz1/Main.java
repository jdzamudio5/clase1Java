package co.oscar.quiz1;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        // 1. crear el array de numeros enteros
        int[] entero = {5, 10, 3, 8, 15, 7, 2, 9, 1, 6};

        // 2. suma de los  numeros enteros
        int suma= 0;
        for (int i = 0; i < entero.length; i++) {
            suma += entero[i];
        }
        // Imprime la suma en la consola
        JOptionPane.showMessageDialog(null, "Suma de elementos: " + suma);

        // 3.Calcula el promedio
        double promedio = (double) suma / entero.length;

        // Imprime el promedio en la consola
        JOptionPane.showMessageDialog(null, "Promedio de elementos: " + promedio);

        int valorMaximo = entero[0];  // Inicializa el valor máximo con el primer elemento del array

        // 4.valor máximo del array
        for (int i = 1; i < entero.length; i++) {
            if (entero[i] > valorMaximo) {
                valorMaximo = entero[i];
            }

        }
        System.out.println("El valor máximo : " + valorMaximo);

        // 5. valor mínimo
        int valorMinimo = entero[0];
        for (int i = 1; i < entero.length; i++) {
            if (entero[i] < valorMinimo) {
                valorMinimo = entero[i];
            }
        }
        System.out.println("El valor mínimo en el array es: " + valorMinimo);

        // 6) Si el números es primo, mostrarlo
        System.out.print("Números primos : ");
        for (int i = 0; i < entero.length; i++) {
            if (esPrimo(entero[i])) {
                System.out.print(entero[i] + " ");
            }
        }

        // 7.reemplaza los números primos por 0
        for (int i = 0; i < entero.length; i++) {
            if (esPrimo(entero[i])) {
                entero[i] = 0;
            }
        }

        // Imprime el array modificado
        System.out.print("El array con números primos reemplazados: ");
        for (int i = 0; i < entero.length; i++) {
            System.out.print(entero[i] +" ");
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



