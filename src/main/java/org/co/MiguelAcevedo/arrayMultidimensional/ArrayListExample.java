package org.co.MiguelAcevedo.arrayMultidimensional;

import java.util.ArrayList;

public class ArrayListExample {
    //método para guardar datos dentro de un array, el arraylist podemos modificarlo en cualquier momento
    static ArrayList<String> cars=new ArrayList<>();

    public static void addData(){
        cars.add("volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Ferrari");
    }

    public static void updateDate() {
        cars.set(0, "Mazda");//SET PARA ACTUALIZAR
    }

    public void getData1() {
        System.out.println(cars);
    }
}
