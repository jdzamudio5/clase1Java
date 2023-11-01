package arrayMultidim;

import java.util.Arrays;

public class matrices {
    public static void main(String[] args) {
        int [] num ={1,2,3,4,5,6,7,8,9};
        int [][] num1={{1,2,3,4},{5,6,7,8}};
        int [][] num2= {{1,2,3},{1,2,3},{1,2,3},{5,4,7}};
        int suma=0;
        for (int i = 0; i< num2.length;i++){
            for(int j = 0; j<num2[i].length; j++){
                System.out.println(num2[i][j]);
                suma=suma+num2[i][j];
            }
            System.out.println("\n");
        }
        System.out.println("La suma total de los elementos es:"+suma);
        for (int[] e: num2
        ){
            System.out.println(Arrays.toString(e));
        }

    }
}
