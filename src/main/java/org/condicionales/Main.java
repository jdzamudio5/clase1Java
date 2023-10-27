package org.condicionales;

public class Main {
    public static void main(String[] args) {
        int edad=17;

        /*if(edad>18){
            System.out.println("Puede ingresar");

        }else {
            System.out.println("No puede ingresar");
        }*/


        if(edad>15 & edad<18){
            System.out.println("Puede ingresar a zona familiar");
        } else if (edad>=18 & edad<=25) {
            System.out.println("El usuario puede ingresar a la zona rosa");
        } else if (edad>25){
            System.out.println("El usuario puede ingresar a la zona VIP");
        } else {
            System.out.println("No tiene la edad suficiente para ingresar");
        }
    }
}
