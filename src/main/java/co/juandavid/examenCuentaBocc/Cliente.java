package co.juandavid.examenCuentaBocc;

public class Cliente {
    String nombre;
    String apellido;
    String identificacion;
    double saldo;

    public Cliente(String nombre, String apellido, String identificacion, double saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.saldo = saldo;
    }
}
