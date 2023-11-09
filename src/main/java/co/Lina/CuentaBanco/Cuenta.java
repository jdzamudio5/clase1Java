package co.Lina.CuentaBanco;

public class Cuenta{

    Persona persona;
    Banco banco;
    int numeroCuenta;
    double saldoCuenta;

    public Cuenta() {
    }

    public Cuenta(Persona persona, int numeroCuenta, double saldoCuenta) {

        this.persona = persona;
        this.numeroCuenta = numeroCuenta;
        this.saldoCuenta = saldoCuenta;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public void depositar(double cantidad){
        saldoCuenta+=cantidad;
    }

    public void retirar(double cantidad){
        if(cantidad<= saldoCuenta){
            saldoCuenta-=cantidad;
        }else {
            System.out.println("saldo insuficiente");
        }
    }

    public static Cuenta crearCuenta(Persona persona){
        return new Cuenta();
    }

    public boolean validarMonton(double valorCuenta){
        if(valorCuenta >=50000){
            System.out.println("Se puede crear Usuario");
            return true;
        }else{
            System.out.println("Valor minimo para aperturar cuenta es de $50.000");
        }
        return false;
    }
}
