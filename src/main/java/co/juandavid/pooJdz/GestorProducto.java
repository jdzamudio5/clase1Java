package co.juandavid.pooJdz;

import javax.swing.*;
import java.util.ArrayList;

import static co.juandavid.pooJdz.Stock.getDameDatos;
import static co.juandavid.pooJdz.Stock.getStockProductos;

;

public class GestorProducto {

    public void guardarProducto(){
       String nombreProduc= JOptionPane.
               showInputDialog(null,"Ingrese el nombre del producto");
       String descProduc= JOptionPane.
               showInputDialog(null,"Ingrese el descripción del producto");
       int cantProduc=Integer.parseInt(JOptionPane.
               showInputDialog(null,"Ingrese cantidad Producto"));

       //Producto producto=new Producto("Azucar","Endulzante natural",)
        Producto producto=new Producto(nombreProduc,descProduc,cantProduc);

        getStockProductos().add(0,producto);

        System.out.println(getDameDatos());

    }
}
