package co.juandavid.javaJuanDavid;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Perro perro=new Perro();/*instaciamos la clase Perro para
        despues utilizar el metodo enviarAtributos de dicha clase*/

        //perro.enviarAtributos("Juan","Schauzer",3);
        /*perro.setNombre("Juan");
        perro.setEdad(1);
        perro.setRaza("Schnauzer");*/
        //perro.imprimir();

        System.out.println(Perro.getNombre());



    }

}
