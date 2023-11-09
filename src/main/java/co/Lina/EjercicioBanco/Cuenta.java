package co.Lina.EjercicioBanco;

public class Cuenta {

    Persona usuario;
    int numeroCuenta;
    double saldoCuenta;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, double saldoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldoCuenta = saldoCuenta;
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

    public Persona getUsuario() {
        return usuario;
    }

    public void setUsuario(Persona usuario) {
        this.usuario = usuario;
    }

    public void depositarenCuenta(double cantidad){
        saldoCuenta+=cantidad;
    }

    public void retirarenCuenta(double cantidad){
        if(cantidad<= saldoCuenta){
            saldoCuenta-=cantidad;
        }else {
            System.out.println("saldo insuficiente");
        }
    }


}
