package org.semaforojdz;

public class Main {
    public static void main(String[] args) {
        String colorSemaforo="Amarillo";
        if (colorSemaforo == "Verde") {
            System.out.println("Puede pasar");
        } else if (colorSemaforo=="Amarillo") {
            System.out.println("Prepárese para frenar");
        } else if (colorSemaforo=="Rojo") {
            System.out.println("Debe detenerse");
        } else {
            System.out.println("No estás en un semáforo");
        }
    }


}
