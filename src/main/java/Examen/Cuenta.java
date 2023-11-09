package Examen;
import java.util.Random;

public class Cuenta extends Banco{
    private int cuenta;
    private String tipo;
    private String fechaApertura;
    private int saldo;
    private int cedulaCliente;
    public static void consultarSaldo(){
    }
    public static void retirarDinero(){

    }
    //aqui van los getter y setter

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(int cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public Cuenta(String nombre, String direccion, int telefono, String correoInstitucional, Cuenta cuenta, int cuenta1, String tipo, String fechaApertura, int saldo, int cedulaCliente) {
        super(nombre, direccion, telefono, correoInstitucional, cuenta);
        this.cuenta = cuenta1;
        this.tipo = tipo;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
        this.cedulaCliente = cedulaCliente;
    }
}
