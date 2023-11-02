package co.Alejandra.condicionalesAle;

public class Main {
    public static void main(String[] args) {
        int edad=17;

        /* if(edad>18){
            System.out.println("Puede ingresar");
        }else{
            System.out.println("No puede ingresar");
        } */
        /*
        if(edad>15 & edad<18){
            System.out.println("El usuario puede ingresar a zona familiar");
        } else if (edad>=18 & edad<=25) {
            System.out.println("El usuario puede ingresar a la zona rosa");
        } else if (edad>25){
            System.out.println("El usuario puede ingresar a la zona VIP");
        } else {
            System.out.println("No tiene la edad suficiente para ingresar");
        }
        */
        String luz="Naranja";
        
        if(luz.equals("Rojo")){
            System.out.println("Debe detenerse");
        } else if (luz.equals("Naranja")) {
            System.out.println("Debe prepararse para frenar");
        } else if (luz.equals("Verde")) {
            System.out.println("Puede avanzar");
        } else {
            System.out.println("Semáforo dañado");
        }
    }
}
