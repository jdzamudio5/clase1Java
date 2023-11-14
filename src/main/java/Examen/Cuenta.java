package Examen;

import java.util.Random;

public class Cuenta extends Banco {
    private int cuenta;
    private String tipo;
    private String fechaApertura;
    private double saldo; // Cambiado a double para manejar decimales
    private int cedulaCliente;

    public static void crearCuenta(int cedula) {
        // Utiliza una variable local en lugar de un campo de instancia
        int cedulaCliente = cedula;

        Random random = new Random();
        // Generar un número entero aleatorio entre 0 y 999999
        int numeroAleatorio = random.nextInt(999999);
        System.out.println("Número de Cuenta asociado es:" + numeroAleatorio);
    }

    public void consultarSaldo() {
        // Implementa la lógica necesaria para consultar el saldo
        System.out.println("Saldo actual: " + saldo);
    }

    public void retirarDinero() {
        // Implementa la lógica necesaria para retirar dinero
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(int cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    // Constructores

    public Cuenta(String nombre, String direccion, int telefono, String correoInstitucional,
                  int cuenta, String tipo, String fechaApertura, double saldo, int cedulaCliente) {
        super(nombre, direccion, telefono, correoInstitucional);
        this.cuenta = cuenta;
        this.tipo = tipo;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
        this.cedulaCliente = cedulaCliente;
    }
}
