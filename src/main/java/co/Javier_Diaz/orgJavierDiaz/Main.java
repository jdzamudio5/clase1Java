<<<<<<<< HEAD:src/main/java/co/jorge/example/Main.java
package co.jorge.example;
========
package co.Javier_Diaz.orgJavierDiaz;
>>>>>>>> f480100fe0edb5075d1b7a2286e90bbbc21ff376:src/main/java/co/Javier_Diaz/orgJavierDiaz/Main.java

public class Main {
    public static void main(String[] args) {
        String letra="";
        letra="Hola";
        System.out.println(letra);

        int x;
        x=0;
        System.out.println(x);

        float f;
        f=5.5f;
        System.out.println(f);

        boolean b;
        b=true;
        System.out.println(b);

        char c;
        c='a';
        System.out.println(c);

        //Convertir un float a String
        String f2=Float.toString(f);

        //Concatenar
        String union=letra+" "+c+" "+f2;
        System.out.println(union);
    }
}
