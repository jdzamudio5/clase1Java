package org.condicionales;
/*
 * @(#) Main.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class Main {
    public static void main(String[] args) {
        int edad=10;

      /* if(edad>18){
            System.out.println("puede ingresar");

        }else {
            System.out.println("No puede ingresar");
        }*/


        if(edad>15 & edad<18){
            System.out.println("el usuario puede ingresa a zona familiar");
        } else if (edad>=18 & edad<=25) {
            System.out.println("El usuario puede ingresar a la zona rosa");
        }else if( edad>25){
            System.out.println("El usuario puede ingresar a la zona VIP");
        }else {
            System.out.println("No tiene la edad suficiente para ingresar");
        }
    }
}
