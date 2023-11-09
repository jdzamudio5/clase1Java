package co.Lina.CuentaBanco;

public class Banco {

    String nombre;
    int codidoBanco;
    String direccionBanco;
    Cuenta cuenta;
    Cliente cliente;
    Usuario usuario;

    public Banco() {
    }

    public Banco(String nombre, int codidoBanco, String direccion) {
        this.nombre = nombre;
        this.codidoBanco = codidoBanco;
        this.direccionBanco = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodidoBanco() {
        return codidoBanco;
    }

    public void setCodidoBanco(int codidoBanco) {
        this.codidoBanco = codidoBanco;
    }

    public String getDireccionBanco() {
        return direccionBanco;
    }

    public void setDireccionBanco(String direccionBanco) {
        this.direccionBanco = direccionBanco;
    }

    public void tenerCuentas(){

    }
}
