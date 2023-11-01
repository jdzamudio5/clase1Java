package Alejandro;
import java.util.ArrayList;

public class Array_List_Example {
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
