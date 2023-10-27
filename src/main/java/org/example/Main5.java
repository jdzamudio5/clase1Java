package org.example;

public class Main5 {
    public static void main(String[] args) {

        String rojo="rojo";
        String amarillo="amarillo";
        String verde="verde";
        String semaforo="";
        semaforo="amarillo";

        if(semaforo.equals(rojo))
        {
            System.out.println("Detengase, no puede pasar");
        } else if (semaforo.equals(amarillo)){
            System.out.println("Reduzca la velocidad y detengase");
        }else {
            System.out.println("pase xd");
        }
    }
}
