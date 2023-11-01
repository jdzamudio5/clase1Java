package co.Javier_Diaz.Arraymultidimencional;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[][] num2= {
                {1,2,3},
                {1,2,3},
                {1,2,3},
                {5,4,7}};

        int suma=0;
        for (int i = 0; i < num2.length; i++) {
            for (int j = 0; j < num2[i].length; j++) {
                suma+=num2[i][j];
            }
        }
        System.out.println("La sumatoria de la matriz es: "+suma);
    }
}
