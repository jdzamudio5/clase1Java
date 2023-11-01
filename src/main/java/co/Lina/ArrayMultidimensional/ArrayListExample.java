package co.Lina.ArrayMultidimensional;

import java.util.ArrayList;

public class ArrayListExample {

    static ArrayList<String> cars =new ArrayList<>(); // variable global,tener presente si la variable es estatica el metodo de uso tambien

  // metodos para guardar datos en un arraylist

   /* public static void main(String[] args) {
        //llamar los metodos
        agregarDatos();
        actualizarDatos();

        //agregar un nuevo dato sin posicion
        cars.add("VW");

        //ver el contenido del arraylist
        System.out.println(cars);//imprime todo el array
        //System.out.println(cars.get(1)); // imprime solo una posición solicitada
    }

    */

    public static void agregarDatos(){ // agregar datos al arraylist, si el metodo es statico la variable de uso debe tambien ser statica
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
    }

    public static void actualizarDatos(){
        //cars.add(0,"Mazda");// agregar un nuevo elemento al array
        cars.set(0,"Mazda");// cambiar el metodo
    }

    public void obtenerDatos(){
        System.out.println(cars);
    }
}

/*Nota: validar los metodos staticos
 */
