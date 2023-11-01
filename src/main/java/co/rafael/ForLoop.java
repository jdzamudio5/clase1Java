package co.rafael;
/*
 * @(#) ForLoop.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class ForLoop {
    public static void main(String[] args) {

        String[] cars={"Volvo", "BMW", "Ford"};


        for (int i=0; i<=9; i++){
            System.out.println(i);
        }

        for(int i=0;i< cars.length;i++){
            System.out.print(cars[i]+" ");
        }

        for (String car: cars) {
            System.out.println("\n");
            System.out.println("Marca de vehiculo : "+ car);

        }


    }
}
