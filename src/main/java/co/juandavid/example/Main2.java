<<<<<<<< HEAD:src/main/java/co/jorge/example/Main2.java
<<<<<<<< HEAD:src/main/java/co/jorge/example/Main2.java
package co.jorge.example;
========
package co.Javier_Diaz.orgJavierDiaz;

import java.sql.SQLOutput;
>>>>>>>> f480100fe0edb5075d1b7a2286e90bbbc21ff376:src/main/java/co/Javier_Diaz/orgJavierDiaz/Main2.java
========
package co.juandavid.example;
>>>>>>>> d359635bc162ac16495aa8e1ef4c8daca9d9b52f:src/main/java/co/juandavid/example/Main2.java

public class Main2 {
    public static void main(String[] args) {

        String HelloWolrd="Este es mi primer Hola Mundo";

        System.out.println(HelloWolrd.length());
        System.out.println(HelloWolrd.toLowerCase());
        System.out.println(HelloWolrd.toUpperCase());
        //System.out.println(HelloWolrd.indexOf("mi")); //Sacar indice de dónde comienza la palabra
        System.out.println(HelloWolrd.indexOf("mi"));

        String HelloWorld2="Y voy muy bien";
        int x=55;
        String espacio=" ";

        System.out.println(HelloWolrd+espacio.concat(Integer.toString(x)));

    }
}
