package co.Alejandra.ciclosRepetitivos;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        /*String[] cars={"Volvo", "BMW", "Ford"};

        for (int i=0; i<=9; i++){
            System.out.println(i);
        }

        for (int i=0; i< cars.length; i++){
            System.out.print(cars[i]+" ");
        }

        for (String car:cars) {
            System.out.println("\n");
            System.out.println("Marca de vehiculo: "+car);
        }

        for (int i=1; i<=10; i++){
            int res=7*i;
            System.out.println("7 * "+i+"="+res);
        }*/

        int lon;
        lon= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la ultima tabla"));
        int[] num = new int[lon];

        for(int i = 0; i < num.length; i++) {
            System.out.println(num[i] = i+1);
        }
        for (int n : num){
            for(int j = 1; j <= 10; j++) {
                System.out.println(n + " x " + j + " = " + (n*j));
            }
            System.out.println();
        }

    }
}
