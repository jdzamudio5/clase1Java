package co.rafael.poo;
/*
 * @(#) Stock.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import java.util.ArrayList;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class Stock {
    public static ArrayList<Producto> stockProductos= new ArrayList<Producto>();

    public static ArrayList<Producto> getStockProductos() {

        return stockProductos;
    }

}
