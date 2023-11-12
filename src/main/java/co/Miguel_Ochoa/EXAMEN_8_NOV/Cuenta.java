package co.Miguel_Ochoa.EXAMEN_8_NOV;
/*
Este código fue realizado por: Miguel Esteban Ochoa
Inicio de creación código: 08 de Noviembre 2023
Finalización de creación código: 12 de Noviembre 2023
 */
public abstract class   Cuenta {
    protected String numeroDeCuenta;
    protected double saldo;
    protected String tipoDeCuenta;

    public Cuenta(String numeroDeCuenta, double saldo, String tipoDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
        this.tipoDeCuenta = tipoDeCuenta;
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoDeCuenta() {
        return tipoDeCuenta;
    }

    public void setTipoDeCuenta(String tipoDeCuenta) {
        this.tipoDeCuenta = tipoDeCuenta;
    }
  // Operaciones de cuenta
    public void depositar(double monto) {
        this.saldo += monto;
    }

    public boolean retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            return true;
        }
        return false;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public boolean transferir(Cuenta cuentaOrigen, Cuenta cuentaDestino, double monto) {
        // Asegurarse de que la cuenta origen tiene suficiente saldo
        if (monto <= cuentaOrigen.getSaldo()) {
            cuentaOrigen.setSaldo(cuentaOrigen.getSaldo() - monto); // Disminuir el saldo de la cuenta origen
            cuentaDestino.depositar(monto); // Aumentar el saldo de la cuenta destino
            return true;
        }
        return false;
    }
}
