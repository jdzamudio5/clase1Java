package co.andres.ejercicios;

public class HolaMundo {
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
