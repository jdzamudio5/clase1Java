package co.Lina.EjercicioBanco;

public class Cuenta {
    Persona usuario;
    int numeroCuenta;
    double saldoCuenta;


    public Cuenta(int numeroCuenta, double saldoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldoCuenta = saldoCuenta;
    }

    public Cuenta(Persona usuario, double saldoCuenta) {
        this.usuario = usuario;
        this.saldoCuenta = saldoCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public Persona getUsuario() {
        return usuario;
    }

    public void depositarenCuenta(double cantidad){
        saldoCuenta+=cantidad;
    }

    public void retirarenCuenta(double cantidad){
        if(cantidad<=saldoCuenta){
            saldoCuenta-=cantidad;
        }else {
            System.out.println("saldo insuficiente");
        }
    }


}
