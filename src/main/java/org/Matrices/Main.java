package org.Matrices;

public class Main {
    public static void main(String[] args) {
        int acumulador=0;
        int[] num={1,2,3,4,5,6,7,8,9};
        int[][] num1={{1,2,3,4},{5,6,7,8}};
        int[][] num2={
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        //recorre el array bidireccional.
        for(int i = 0; i<num2.length; i++) { //recorre cada uno de los subarrays del array bidireccional
            for (int j = 0; j < num2[i].length; j++) { //recorre en cada subarray las posicciones de cada subarray
                System.out.print(num2[i][j]);
            }
            System.out.print("\n");
        }
        //suma de todos los elementos de una matriz
        for(int i = 0; i<num2.length; i++) { //recorre cada uno de los subarrays del array bidireccional
            for (int j = 0; j < num2[i].length; j++) { //recorre en cada subarray las posicciones de cada subarray
                acumulador=acumulador+num2[i][j];
            }
        }
        System.out.print("La suma de todos los elementos da:"+acumulador);
    }
}
