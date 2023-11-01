package Excercise.Amultidimensional;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Multidimensional {
    public static void main(String[] args) {

        int[] numeros={1,2,3,4,5,6,7,8,9};
        int suma=0;
        int[][] matriz={{1,2,3,4},{5,6,7,8}};
        int[][] matriz2={
                            {1,2,3},
                            {5,6,7},
                            {9,8,7},
                            {5,6,7}};


        // suma de todos los elementos


        for (int i=0; i< matriz2.length; i++){
            for (int j=0; j< matriz2[i].length; j++){
                suma+=matriz2[i][j];
            }
            System.out.print("\n");
        }
        JOptionPane.showMessageDialog(null,"La suma de los datos del array es: "+suma);

        int res=matriz2[1][2];
        int res2=matriz2[3][2];
        int res3=matriz2[3][1];

        for (int i=0; i< matriz2.length; i++){
            for (int j=0; j< matriz2[i].length; j++){

                System.out.print(matriz2[i][j]);
            }
            System.out.print("\n");
        }

        for (int[] e: matriz2
             ) {
            System.out.println(Arrays.toString(e));
        }





    }
}
