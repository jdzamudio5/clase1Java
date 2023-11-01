package co.rafael;

/*
 * @(#) ArrayList.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import java.util.ArrayList;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class ArrayListExample {

    static ArrayList<String> cars= new ArrayList<>();




    public static void addData(){
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
    }

    public static void updateDate(){
        cars.set(0,"Mazda");


    }

    public void getData1(){
        System.out.println(cars);
    }




}
