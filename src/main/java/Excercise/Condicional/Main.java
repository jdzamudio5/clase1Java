package Excercise.Condicional;

public class Main {


    public static void main(String[] args) {

        int edad=17;

        if(edad>18){
            System.out.println("Puede Ingresar");
        } else {
            System.out.println("No Puede Ingresar");
        }

        if(edad>15 & edad<18){
            System.out.println("El usuario puede ingresar a la zona familiar");
        } else if(edad>=18& edad<=25){
            System.out.println("El usuario puede ingresar a la zona familiar");
        }else if(edad>25){
            System.out.println("El usuario puede ingresar a la zona VIP");
        }else {
            System.out.println("El usuario puede ingresar a la zona familiar");
        }


        String Estado,V,R,A;
        Estado="amarillo";

        if(Estado.equals("verde")){
            System.out.println("Puede Cruzar la Calle");
        } else if(Estado.equals("amarillo")){
            System.out.println("Cruce la calle con Precaucion");
        }else{
            System.out.println("No Puede Cruzar la calle");
        }




    }

}
