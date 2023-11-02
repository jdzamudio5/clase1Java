package co.gabriel;

import java.util.ArrayList;

public class metodos {

    public static void addData(ArrayList<String> cars){
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

    }
    public static void updateDate(ArrayList<String> cars){
        cars.set(0,"Mazda");
    }
}
