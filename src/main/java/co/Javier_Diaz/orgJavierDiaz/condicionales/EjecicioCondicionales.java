package org.condicionales;

public class EjecicioCondicionales {

    public static void main(String[] args) {

        String luz="roj";
        if(luz.equals("verde")){
        System.out.println("Puede continuar avanzando");
        }else if(luz.equals("amarillo")){
            System.out.println("Reduzca la velocidad para detenerse antes del sendero peatonal");
        }else if (luz.equals("rojo")) {
            System.out.println("Detenerse obligatoriamente");

        }else {
            System.out.println("Continuar con precaucion, semaforo fallando");

        }
    }
}
