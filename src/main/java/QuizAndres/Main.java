package QuizAndres;

public class Main {
    public static void main(String[] args) {
        // Crea un array de enteros con los siguientes valores 5, 10, 3, 8, 15, 7, 2, 9, 1, 6
        int[] enteros = {5, 10, 3, 8, 15, 7, 2, 9, 1, 6};
        int maximo = enteros[0];
        int minimo = enteros[0];
        int suma = 0;

        // Suma de elementos: Calcula la suma de todos los elementos en el array y mostrar el resultado por consola
        for (int i = 0; i < enteros.length; i++) {
            suma += enteros[i];
        }
        System.out.println("La suma de todos los elementos en el array es: " + suma);

        // Promedio de elementos: Calcula el promedio de todos los elementos en el array
        double promedio = (double) suma / enteros.length;
        System.out.println("El promedio de todos los elementos en el array es: " + promedio);

        // Elemento máximo: Encuentra el valor máximo del array
        for (int i = 0; i < enteros.length; i++) {
            if (enteros[i] > maximo) {
                maximo = enteros[i];
            }
        }
        System.out.println("El valor máximo en el array es: " + maximo);

        // Elemento mínimo: Encuentra el valor mínimo del array
        for (int i = 0; i < enteros.length; i++) {
            if (enteros[i] < minimo) {
                minimo = enteros[i];
            }
        }
        System.out.println("El valor mínimo en el array es: " + minimo);

        // Reemplazar números primos con 0 en el array
        for (int i = 0; i < enteros.length; i++) {
            if (esPrimo(enteros[i])) {
                enteros[i] = 0;
            }
        }

        //Donde el numero sea primo, reemplazarlo por un 0
        System.out.print("Array con primos reemplazados por 0: ");
        for (int i = 0; i < enteros.length; i++) {
            System.out.print(enteros[i] + " ");
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}









