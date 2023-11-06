package co.oscar.acom_poo;

public class Producto1 {
    private String nombreProduto;
    private String descProducto;
    private  int cantidad;

    // crear contructor

    public Producto1(String nombreProduto, String descProducto, int cantidad) {
        this.nombreProduto = nombreProduto;
        this.descProducto = descProducto;
        this.cantidad = cantidad;
    }

    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    public int getCantidad() {
        return cantidad;
    }
    public String getNombreProduto() {
        return nombreProduto;
    }
    public String getDescProducto() {
        return descProducto;
    }
}
