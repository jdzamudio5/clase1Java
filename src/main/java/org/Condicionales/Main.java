package org.Condicionales;
public class Main {

    public static void main(String[] args) {
        String rojo = new String("Rojo");
        String amarillo = new String("Amarillo");
        String verde = new String("Verde");
        String estado ="Verde";
        if(rojo.equals(estado)){
            System.out.println("Frenar inmediatamente");
        }
        if(amarillo.equals(estado)){
            System.out.println("Reduzca la velocidad");
        }
        if(verde.equals(estado)){
            System.out.println("Aumente la velocidad");
        }
    }
}
