package org.ejercicio;

public class Main {
    public static void main(String[] args) {
        String luz="Verde";

        if(luz.equals("Rojo")){
            System.out.println("Detenerse");
        } else if (luz.equals("Amarillo")) {
            System.out.println("Disminuya se velocidad hasta detenerse");
        } else if (luz.equals("Verde")){
            System.out.println("Puede avanzar");
        } else {
            System.out.println("No se encuentra en un semaforo");
        }
    }
}


