<<<<<<<< HEAD:src/main/java/co/jorge/exercise/Main.java
<<<<<<<< HEAD:src/main/java/co/jorge/exercise/Main.java
package co.jorge.exercise;
========
package co.Javier_Diaz.orgJavierDiaz.condicionales2.exercise;
>>>>>>>> f480100fe0edb5075d1b7a2286e90bbbc21ff376:src/main/java/co/Javier_Diaz/orgJavierDiaz/condicionales2/exercise/Main.java
========
package co.juandavid.exercise;
>>>>>>>> d359635bc162ac16495aa8e1ef4c8daca9d9b52f:src/main/java/co/juandavid/exercise/Main.java
/*
 * @(#) Matrices.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class Main {
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
        iguales= dia.equals(noche);

        System.out.println(iguales);








    }
}
