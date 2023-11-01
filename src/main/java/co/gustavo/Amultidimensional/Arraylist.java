package co.gustavo.Amultidimensional;
import java.util.ArrayList; // import the ArrayList class
public class Arraylist {

    static ArrayList<String> cars = new ArrayList<>();

    public static void AddData(){
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
    }
    public static void UpdateData(){
        cars.set(0,"Mazda");
    }

    public void getData2(){
        System.out.println(cars);
    }


}
