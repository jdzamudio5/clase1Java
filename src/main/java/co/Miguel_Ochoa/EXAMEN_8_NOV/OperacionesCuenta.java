package co.Miguel_Ochoa.EXAMEN_8_NOV;
/*
Este código fue realizado por: Miguel Esteban Ochoa
Inicio de creación código: 08 de Noviembre 2023
Finalización de creación código: 12 de Noviembre 2023
 */
import javax.swing.JOptionPane;
public class OperacionesCuenta {
    private Cuenta cuenta;

    // Método para consultar el saldo de una cuenta
    public static double consultarSaldo(Cuenta cuenta) {
        double saldo = cuenta.getSaldo();
        String montoConsultado= String.valueOf(saldo);
        JOptionPane.showMessageDialog(null, "Saldo de la cuenta " + cuenta.getTipoDeCuenta() + " " + cuenta.getNumeroDeCuenta() + " es: $" + montoConsultado);
        return saldo;
    }

    // Método para depositar dinero en una cuenta
    public static void depositar(Cuenta cuenta, double monto) {
        double saldoAnterior = cuenta.getSaldo();
        cuenta.depositar(monto);
        double saldoNuevo = cuenta.getSaldo();
        JOptionPane.showMessageDialog(null, "Se han depositado $ " + monto +
                " en la cuenta " + cuenta.getNumeroDeCuenta() +
                ".\n Saldo anterior: $ " + saldoAnterior +
                ", Saldo nuevo: $ " + saldoNuevo);
    }


    // Método para retirar dinero de una cuenta
    public static boolean retirar(Cuenta cuenta, double monto) {
        double saldoAnterior = cuenta.getSaldo();
        if (cuenta.retirar(monto)) {
            double saldoNuevo = cuenta.getSaldo();
            JOptionPane.showMessageDialog(null, "Se han retirado $" + monto +
                    ". Saldo anterior: $" + saldoAnterior +
                    ", Nuevo saldo: $" + saldoNuevo);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo retirar dinero. Saldo insuficiente.");
            return false;
        }
    }


    // Método para transferir dinero entre cuentas
    public static boolean transferir(Cuenta cuentaOrigen, Cuenta cuentaDestino, double monto) {
        double saldoAnteriorOrigen = cuentaOrigen.getSaldo();
        if (cuentaOrigen.getSaldo() >= monto) {
            cuentaOrigen.retirar(monto);
            cuentaDestino.depositar(monto);
            double saldoNuevoOrigen = cuentaOrigen.getSaldo();
            JOptionPane.showMessageDialog(null, "Se han transferido $" + monto +
                    " a la cuenta " + cuentaDestino.getTipoDeCuenta() + " " + cuentaDestino.getNumeroDeCuenta() +
                    ". Saldo anterior de la cuenta origen: $" + saldoAnteriorOrigen +
                    ", Nuevo saldo de la cuenta origen: $" + saldoNuevoOrigen);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Transferencia fallida. Saldo insuficiente en la cuenta origen.");
            return false;
        }
    }

}
