<<<<<<<< HEAD:src/main/java/co/andres/ejercicios/Ejercicio.java
package co.andres.ejercicios;
/*
 * @(#) Main.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class Ejercicio {
========
package org.example;

public class Main3 {
>>>>>>>> develop:src/main/java/co/Javier_Diaz/orgJavierDiaz/Main3.java
    public static void main(String[] args) {
        int x,y,z, sum,res,mult=0;
        float mod;
        String dia,noche;

        dia="lunes";
        noche="si";

        x=4;
        y=12;
        z=4;

        sum=x+y+z;
        System.out.println(sum);
        res=x-y-z;
        System.out.println(res);
        mult=x*y*z;
        System.out.println(mult);

        mod= y%x;
        System.out.println(mod);

        boolean a,b,c,iguales;

        a= x<y;
        b= x==y;
        c= (x-y)<z;

        iguales=dia.equals(noche); //CON STRING UTILIZAR EQUALS PREFERIBLE
        System.out.println(iguales);
    }
}
