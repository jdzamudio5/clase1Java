package org.MiguelAcevedo.bucles;

public class Main {
    public static void main(String[] args) {
        //ARRAY
        String[] cars={"Ferrari", "BMW", "Ford"};//unidimensional por eso un par de corchetes
        int tabla7= 7;
        for (int i=0; i<=9; i++){
            System.out.println(i);
        }
        for (int i=0; i<cars.length;i++) { //menor porque el indice empieza desde 0
            System.out.println(cars[i]+" ");
        }
        for (String car:cars){
            System.out.println("\n");
            System.out.println("Marca de vehículo: "+ car);
        }
        for (int i=0; i<=10; i++){
            System.out.println(i*tabla7);
        }
    }
}
