<<<<<<<< HEAD:src/main/java/co/rafael/exercise/Main.java
package co.rafael.exercise;
/*
 * @(#) Main.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */
========
package org.example;
>>>>>>>> develop:src/main/java/co/Javier_Diaz/orgJavierDiaz/Main3.java

public class Main3 {
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
