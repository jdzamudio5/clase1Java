package Multidimencional;

import java.util.Arrays;

public class Matriz {
    public static void main(String[] args) {
        int[] enteros = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[][] num1 = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        int[][] num2 = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3},
                {5, 4, 7}
        };

        int res = num2[1][2];
        int res2 = num2[1][2];
        int res3 = num2[1][2];
        int suma =0;

        for (int i = 0; i < num2.length; i++) {
            for (int j = 0; j < num2[i].length; j++) {
                suma +=num2[i][j];
                System.out.println(num2[i][j]);
            }
            System.out.println("\n");
        }
        System.out.println("La suma de los elementos de la matriz es: " + suma);

        for (int[] e : num2
        ) {
            System.out.println(Arrays.toString(e));
        }
    }
}