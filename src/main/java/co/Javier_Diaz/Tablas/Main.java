package co.Javier_Diaz.Tablas;

public class Main {
    public static void main(String[] args) {
        int longitud = 10;

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < longitud; i++) {
            for (int numero : numeros) {
                System.out.println(i + " * " + numero + " = " + (numero * i));
            }
            System.out.println();  // Agregar una línea en blanco entre cada tabla
        }
    }
}
