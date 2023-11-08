package co.Alejandra.EjercicioPoo;

import java.util.ArrayList;

public class Stock {

    //Generamos la varaible de tipo global para poder usarla en cualquier clase
    //Se declara tipo publica y es un objeto
    public static ArrayList<Producto> stockProductos= new ArrayList<Producto>();

    //Creamos el getter para enviar la variable tipo array a cualquier clase
    public static ArrayList<Producto> getStockProductos() {
        //Retorna el array stock de productos
        return stockProductos;
    }

}
