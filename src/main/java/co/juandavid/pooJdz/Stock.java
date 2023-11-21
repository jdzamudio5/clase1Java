package co.juandavid.pooJdz;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;

public class Stock {
    private static ArrayList<Producto> stockProductos =new ArrayList<Producto>();
    private String dameDatos;

    public static ArrayList<Producto> getStockProductos() {
        return stockProductos;
    }

    public static String getDameDatos() {
        return "producto :"+getStockProductos().get(0).getNombreProducto();
    }
}
