package co.juandavid.pooJdz;

public class Producto {
    private String nombreProducto, descProducto;
    private int cantidad;

    public Producto(String nombreProducto, String descProducto, int cantProduc){
        this.nombreProducto=nombreProducto;
        this.descProducto=descProducto;
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
