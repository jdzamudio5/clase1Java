package org.ArrayList;

import java.util.ArrayList;

public class Main {
    //Declara la variable cars como una clase ArrayList
    static ArrayList<String> cars = new ArrayList<>();

    public static void main(String[] args) {
        addData();
        System.out.println(cars);
    }
    public static void addData() {
        cars.add("Volvo");
        cars.add("Mazda");
        cars.add("Renault");
    }

}
