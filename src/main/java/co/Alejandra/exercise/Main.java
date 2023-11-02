<<<<<<< HEAD:src/main/java/co/jorge/exercise/Main.java
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
=======

<<<<<<< HEAD:src/main/java/co/Miguel_Ochoa/exercise/Main.java
package co.Miguel_Ochoa.exercise;

>>>>>>> 70ff61825c9a4fedbc34236a591d1007b236aa2e:src/main/java/co/Miguel_Ochoa/exercise/Main.java
=======
package co.Alejandra.exercise;
/*
 * @(#) Matrices.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */
>>>>>>> 8dd141e42026e9338fac03e88590554ef76a36a2:src/main/java/co/Alejandra/exercise/Main.java

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
