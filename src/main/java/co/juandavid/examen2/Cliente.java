package co.juandavid.examen2;

public class Cliente {
    private String nombre;
    private String apellido;
    private String identificacion;
    private double saldo;

    public Cliente(String nombre, String apellido, String identificacion, double saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
