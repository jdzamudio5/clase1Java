package arrayMultidimencional;

import java.util.Arrays;

public class Matrices {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6,7,8,9};
        int[][] num1={{1,2,3,4},{5,6,7,8}};
        int[][] num2= {
                {1,2,3},
                {1,2,3},
                {1,2,3},
                {5,4,7}};

        int res=num2[1][2];
        int res2=num2[3][2];
        int res3=num2[3][1];

        for (int i = 0; i <num2.length ; i++) {
            for (int j = 0; j < num2[i].length; j++) {
                System.out.print(num2[i][j]);

            }
            System.out.print("\n");
        }

        for (int[] e: num2
             ) {
            System.out.println(Arrays.toString(e));

        }


    }
}
