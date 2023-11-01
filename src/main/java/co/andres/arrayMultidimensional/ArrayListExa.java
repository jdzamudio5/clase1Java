package co.andres.arrayMultidimensional;

import java.util.ArrayList;

public class ArrayListExa {
    static ArrayList<String> cars=new ArrayList<>();

    public static void addData() {
        cars.add("Volvo");
        cars.add("Renault");
        cars.add("BMW");


    }

    public static void updateData() {
        cars.set(0,"Mazda");
    }
    public void getData1(){
        System.out.println(cars);
    }
}

