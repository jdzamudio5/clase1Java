package Ejercicios_Javier_Diaz.Condicionales_clase1;

public class Main {
    public static void main(String[] args) {
        int Estado=3;
        //1: Rojo 2:Amarillo 3: Verde

        if (Estado==1){
            System.out.println("Prohibido EL Paso");
        } else if (Estado==2) {
            System.out.println("Preparar Marcha");
        }else if (Estado==3) {
            System.out.println("Circula");
        }else{
            System.out.println("El Estado Es Desconocido");
        }
    }

}