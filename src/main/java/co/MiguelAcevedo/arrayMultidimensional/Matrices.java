package co.MiguelAcevedo.arrayMultidimensional;

import java.util.Arrays;

public class Matrices {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6,7,8,9};
//ARRAY VACIO BIDIMENSIONAL PORQUE EN LA PARTE DE LAS LLAVES HAY OTROS 2 PARES DE LLAVES QUE CADA UNO INDICA UNA DIMENSIÓN
//EL ARRAY TIENE 2 FILAS Y 4 COLUMNAS. FILAS SON CORCHETES {} Y COLUMNAS VALORES INTERNOS
//PRIMERA FILA ESTA EN POSICIÓN 0 ES DECIR VALOR 1
        int[][] num1={{1,2,3,4},{5,6,7,8}};
        int[][] num2={{1,2,3},{1,2,3},{1,2,3},{5,4,7}};

        int res=num2[1][2];
        int res2=num2[1][2];
        int res3=num2[1][2];
        int suma=0;

        for (int i=0; i<num2.length;i++){
            for (int j=0;j<num2[i].length;j++){
                System.out.println(num2[i][j]);
            }
            System.out.println("\n");
        }
        for (int[] e: num2){
            System.out.println(Arrays.toString(e));
        }
//EJ
        for (int i=0; i<num2.length;i++){
            for (int j=0;j<num2[i].length;j++){
                System.out.println(num2[i][j]);
                suma += num2[i][j];
            }
            System.out.println("\n"+ suma);
        }
        System.out.println();
    }
}
