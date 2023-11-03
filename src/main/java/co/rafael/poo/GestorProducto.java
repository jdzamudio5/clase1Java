package co.rafael.poo;
/*
 * @(#) GestorProducto.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import javax.swing.*;
import java.util.ArrayList;

import static co.rafael.poo.Stock.getStockProductos;
import static co.rafael.poo.Stock.stockProductos;


/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class GestorProducto {


    public void guardarProducto(){
        String nombreProduc= JOptionPane
                .showInputDialog(null,"Ingrese el nombre del producto");
        String descProduc= JOptionPane
                .showInputDialog(null,"Ingrese la desc. del producto");

        int cantProduc= Integer.parseInt(JOptionPane
                .showInputDialog(null,"Ingrese la cantidad del producto"));

        Producto producto= new Producto(nombreProduc,descProduc,cantProduc);

        stockProductos.add(0,producto);

        System.out.println("array productos : "+getStockProductos().get(0).getNombreProducto()
                +" "+getStockProductos().get(0).getDescProducto());



    }
}
