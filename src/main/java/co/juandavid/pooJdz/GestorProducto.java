package co.juandavid.pooJdz;

import javax.swing.*;
import java.util.ArrayList;

public class GestorProducto {
    private ArrayList<Producto> stockProductos;
    public void guardarProducto(){
       String nombreProduc= JOptionPane.
               showInputDialog(null,"Ingrese el nombre del producto");
       String descProduc= JOptionPane.
               showInputDialog(null,"Ingrese el descripción del producto");
       int cantProduc=Integer.parseInt(JOptionPane.
               showInputDialog(null,"Ingrese cantidad Producto"));

       //Producto producto=new Producto("Azucar","Endulzante natural",)
        Producto producto=new Producto(nombreProduc,descProduc,cantProduc);
    }
}
