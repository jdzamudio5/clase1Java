<<<<<<<< HEAD:src/main/java/co/rafael/example/Main2.java
package co.rafael.example;
========
package co.Miguel_Ochoa.example;
>>>>>>>> develop:src/main/java/co/Miguel_Ochoa/example/Main2.java

public class Main2 {
    public static void main(String[] args) {
        String helloWord="Este es mi primer hola Mundo";
        System.out.println(helloWord.length());
        System.out.println(helloWord.toLowerCase());
        System.out.println(helloWord.toUpperCase());
        int entero=58;
        //System.out.println(helloWord.indexOf("mi"));
        String helloWord2="y voy muy bien";
        String espacio=" ";
        System.out.println(helloWord+espacio.concat(Integer.toString(entero)));
    }
}
