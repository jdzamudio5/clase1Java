package co.Alejandra.EjercicioPoo;

public class Producto {
    private String nombreProducto;
    private String descProducto;
    private int cantidad;

    public Producto(String nomnreProducto, String descProducto, int cantidad) {
        this.nombreProducto = nomnreProducto;
        this.descProducto = descProducto;
        this.cantidad=cantidad;
    }


    public String getNombreProducto() {
        return nombreProducto;
    }

    public String getDescProducto() {
        return descProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
