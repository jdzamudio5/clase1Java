package arrayList;

import java.util.ArrayList;

public class arraylist {

    static ArrayList<String> cars = new ArrayList<>();
    public static void main(String[] args) {

        addData();
        updateDate();
        System.out.println(cars);

    }

    public static void addData(){
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

    }
    public static void updateDate(){
        cars.set(0,"Mazda");
    }
}
