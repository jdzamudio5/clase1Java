package ArraysMultidimencionales;

import java.util.ArrayList;

public class Array_List {

    static ArrayList<String> cars= new ArrayList<>(); //Variable globar
    /*public static void main(String[] args) {
        addData(); // Se llena el arrayList
        updateDate(); // Se modifica
        cars.add("VW");
        System.out.println(cars);

    }*/

    public static void addData(){ //Metodo
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
