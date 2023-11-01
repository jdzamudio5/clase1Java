package co.Alejandra.ArraysMultidimencionales;

import java.util.Arrays;

public class Matriz {
    public static void main(String[] args) {
        int [] array ={1,2,3,4,5,6,7,8,9};
        int [][] matriz ={{1,2,3,4},{5,6,7,8}};
        int [][] matriz2={{1,2,3},
                          {4,5,6},
                          {7,8,9},
                          {10,11,12}}; // 4 Filas 3 columnas

        int res=matriz2[1][2]; // Saco el número 6
        int res2=matriz2[3][2]; // Saco el número 12

        for (int i=0; i<matriz2.length; i++){ // i es lo relacionado con las posiciones de las filas, se preite 3 vecess en total
            for (int j=0; j<matriz2[i].length; j++){ // j es lo relacionado con las posiciones de las columnas, se repite 12 veces en total
                System.out.print(matriz2[i][j]);
            }
            System.out.println("\n");
        }

        for (int[] e: matriz2) { //Imprimir array convirtiendola a String
            System.out.println(Arrays.toString(e));
        }

        int[][] num2= {
                {1,2,3},
                {1,2,3},
                {1,2,3},
                {5,4,7}};

        int sum=0;
        for (int i=0; i<num2.length; i++){ // i es lo relacionado con las posiciones de las filas, se preite 3 vecess en total
            for (int j=0; j<num2[i].length; j++){ // j es lo relacionado con las posiciones de las columnas, se repite 12 veces en total
                sum=sum+num2[i][j];
            }
        }
        System.out.println(sum);

    }
}
