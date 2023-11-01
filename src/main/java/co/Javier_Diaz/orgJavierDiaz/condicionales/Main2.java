<<<<<<<< HEAD:src/main/java/co/andres/condicionales/Condicionales.java
package co.andres.condicionales;
========
<<<<<<<< HEAD:src/main/java/co/Javier_Diaz/orgJavierDiaz/condicionales/Main.java
package co.Javier_Diaz.orgJavierDiaz.condicionales;
/*
 * @(#) Main.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */
========
package org.condicionales;
>>>>>>>> 637d63ab1dd3e36ef69defc48209edf8c2fcf295:src/main/java/co/Javier_Diaz/orgJavierDiaz/condicionales/Main2.java
>>>>>>>> develop:src/main/java/co/Javier_Diaz/orgJavierDiaz/condicionales/Main2.java


public class Condicionales {
    public static void main(String[] args) {
        int edad=10;

      /* if(edad>18){
            System.out.println("puede ingresar");

        }else {
            System.out.println("No puede ingresar");
        }*/


        if(edad>15 & edad<18){

            System.out.println("Puede ingresar a zona familiar");
        } else if (edad>=18 & edad<=25) {
            System.out.println("El usuario puede ingresar a la zona rosa");
        } else if (edad>25){
            System.out.println("El usuario puede ingresar a la zona VIP");

        }else {

            System.out.println("No tiene la edad suficiente para ingresar");
        }
    }
}
