package co.Miguel_Ochoa.EXAMEN_8_NOV;
/*
Este código fue realizado por: Miguel Esteban Ochoa
Inicio de creación código: 08 de Noviembre 2023
Finalización de creación código: 12 de Noviembre 2023
 */
public class CuentaCorriente extends Cuenta {


    public CuentaCorriente(String numeroDeCuenta, double saldo) {
        super(numeroDeCuenta, saldo, "Corriente");
    }

    // Métodos específicos de la cuenta corriente
    @Override
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

    public boolean transferir(Cuenta cuentaDestino, double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            cuentaDestino.depositar(monto);
            return true;
        }
        return false;
    }


}

