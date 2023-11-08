package co.Alejandra.EjercicioPoo;

import javax.swing.*;
import java.util.ArrayList;

import static co.Alejandra.EjercicioPoo.Stock.getStockProductos;
import static co.Alejandra.EjercicioPoo.Stock.stockProductos;

public class GestorProducto {

    //Declaramos varible de tipo porviada y sólo se van a guardar datos de tipo Producto
    //private ArrayList<Producto> stockProductos;

    //Creamos el método encargado de guardar info y no va a retornar nada
    public void guardarProducto(){
        //Definimos varaibles según las variables que creamos en la Clase "Producto"
        String nombreProduc= JOptionPane.
                showInputDialog(null,"Ingrese el nombre del producto:");
        String descProduc= JOptionPane.
                showInputDialog(null,"Ingrese la descripción del producto:");
        int cantProduc= Integer.parseInt(JOptionPane.
                showInputDialog(null,"Ingrese la cantidad del producto:"));

        //Inicializamos y guardamos temporalmente
        Producto producto = new Producto(nombreProduc,descProduc,cantProduc);
        //Guardamos lo recibido en la línea anterior, esto se hace para cuando la variable ArrayList<Producto> stockProductos; esta en la misma clase
        //stockProductos.add(producto);

        //Otra forma de guardar el producto cuando la varaible array stockProductos esta en la clase externa y es de tipo publica
        //Stock stock=new Stock(); Se crea el objeto para acceder a la variable de la clase
        //stock.stockProductos.add(producto);
        //stockProductos.add(producto); // Esta opción se usa para evitar tener que hacerlo por medio del objeto

        //Guardamos lo recibido en Producto producto = new Producto en el array stockProductos que creamos en la clase Stock
        stockProductos.add(0,producto);

        System.out.println("array productos: "+getStockProductos().get(0).getNombreProducto()+
                " "+getStockProductos().get(0).getDescProducto());

    }
}
