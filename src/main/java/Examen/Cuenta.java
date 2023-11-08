package Examen;

public class Cuenta extends Banco{
    String tipo;
    String fechaApertura;
    int saldo;
    int cedulaCliente;
    public static void crearCuenta(){

    }
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
}
