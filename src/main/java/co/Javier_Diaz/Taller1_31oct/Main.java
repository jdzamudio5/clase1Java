package co.Javier_Diaz.Taller1_31oct;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        // Crear el array de enteros
        int[] array = {5, 10, 3, 8, 15, 7, 2, 9, 1, 6};

        // 2) Suma de elementos y mostrar resultado por JOptionPane
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        JOptionPane.showMessageDialog(null, "Suma de elementos: " + suma);

        // 3) Promedio de elementos y mostrar resultado por JOptionPane
        double promedio = (double) suma / array.length;
        JOptionPane.showMessageDialog(null, "Promedio de elementos: " + promedio);

        // 4) Elemento máximo del array
        int maximo = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximo) {
                maximo = array[i];
            }
        }
        System.out.println("Elemento máximo: " + maximo);

        // 5) Elemento mínimo del array
        int minimo = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimo) {
                minimo = array[i];
            }
        }
        System.out.println("Elemento mínimo: " + minimo);

        // 6) Si alguno de los números es primo, mostrarlo
        System.out.print("Números primos en el array: ");
        for (int i = 0; i < array.length; i++) {
            if (esPrimo(array[i])) {
                System.out.print(array[i] + " ");
            }
        }

        // 7) Reemplazar números primos por 0
        for (int i = 0; i < array.length; i++) {
            if (esPrimo(array[i])) {
                array[i] = 0;
            }
        }

        // 8) Imprimir el array por consola
        System.out.print("\nArray después de reemplazar primos por 0: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    // Método para verificar si un número es primo
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