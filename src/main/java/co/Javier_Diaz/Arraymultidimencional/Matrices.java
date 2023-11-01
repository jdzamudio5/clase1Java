package co.Javier_Diaz.Arraymultidimencional;

public class Matrices {
    public static void main(String[] args) {

        // Declarar y crear una matriz de enteros 3x3
        int[][] matriz = new int[3][3];

        // Inicializar la matriz con valores
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;

        // Imprimir la matriz original
        System.out.println("Matriz Original:");
        imprimirMatriz(matriz);

        // Modificar un valor en la matriz
        matriz[1][1] = 99;

        // Imprimir la matriz después de la modificación
        System.out.println("\nMatriz Después de la Modificación:");
        imprimirMatriz(matriz);
    }

    // Método para imprimir una matriz de enteros
    private static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Salto de línea después de cada fila
        }
    }
}