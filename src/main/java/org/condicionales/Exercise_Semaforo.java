package org.condicionales;

public class Exercise_Semaforo {

    public static void main(String[] args) {
        String color = "rojo";
        //String color = "verde";
        //String color = "amarillo";

        if (color.equals("verde")) {
            System.out.println("Avanzar");
        } else if (color.equals("amarillo")) {
            System.out.println("Disminuir velocidad");
        } else if (color.equals("rojo")) {
            System.out.println("Deténgase");
        }
    }
}

