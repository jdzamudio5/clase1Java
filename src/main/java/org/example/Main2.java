package org.example;

public class Main2 {
    public static void main(String[] args) {
        String helloWord= "Este es mi primer hola mundo";
        System.out.println(helloWord.length());
        System.out.println(helloWord.toLowerCase());
        System.out.println(helloWord.toUpperCase());

        int entero=58;
        String helloWord2= "y voy muy bien";
        String espacio =" ";
        System.out.println(helloWord+espacio.concat(Integer.toString(entero)));
    }
}
