package co.rafael.poo;
/*
 * @(#) Producto.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class Producto {
    private String nombreProducto;
    private String descProducto;
    private int cantidad;

    public Producto(String nombreProducto, String descProducto, int cantidad) {
        this.nombreProducto = nombreProducto;
        this.descProducto = descProducto;
        this.cantidad= cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public String getDescProducto() {
        return descProducto;
    }
}
