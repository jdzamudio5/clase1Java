package co.Alejandro.Poo_example;

import java.security.PrivateKey;

public class Producto {
    private String nombreProducto;
    private String descProducto;
    private int cantidad;

    public Producto(String nombreProducto, String descProducto, int cantidad) {
        this.nombreProducto = nombreProducto;
        this.descProducto = descProducto;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public String getDescProducto() {
        return descProducto;
    }
}
