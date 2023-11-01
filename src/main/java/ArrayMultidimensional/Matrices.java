package ArrayMultidimensional;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Matrices {

    public static void main(String[] args) {

        int [] matriz ={1,2,3,4,5,6,7,8,9};

        int [][] matrices={{1,2,3,4},{5,6,7,8}}; // array bidimencional 2 filas y 4 columnas

        int [][] matrices2 ={{1,2,3,},
                            {4,5,6,},
                            {6,7,8},
                            {7,8,9}};

        int  res =matrices2[1][2];// sacar las posiciones del array
        int res2=matrices2[3][2];
        int res3=matrices2[3][1];

        //realiza el recorrido primero en las filas y luego las columnas

        for (int f=0; f < matrices2.length; f++){
            for(int c=0; c< matrices2[f].length; c++){ // tener en cuenta que el tamaño de la columna se va con el tema de la fila, para que no se salga de las margenes
                System.out.print(matrices2[f][c]);
            }
            System.out.print("\n");
        }

        //for each- validar como funciona
        for (int []e : matrices2
             ) {
            System.out.println(Arrays.toString(e));
        }
    }
}




// Nota : Validar expresiones landa que son nuevas
