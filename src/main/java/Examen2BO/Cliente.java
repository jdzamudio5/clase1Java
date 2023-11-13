package Examen2BO;
import javax.swing.JOptionPane;

public class Cliente extends Persona{
    double saldo;
    boolean clienteExistente;

    public Cliente(String nombre, String apellido, String identificacion, double saldo, boolean clienteExistente) {
        super(nombre, apellido, identificacion);
        this.saldo = saldo;
        this.clienteExistente = clienteExistente;
    }




    public void depositar(double monto) {
        saldo += monto;
        JOptionPane.showMessageDialog(null, "Depósito exitoso. Nuevo saldo: " + saldo);
    }

    public void verSaldo() {
        JOptionPane.showMessageDialog(null, "Saldo actual: " + saldo);
    }



    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            JOptionPane.showMessageDialog(null, "Retiro exitoso. Nuevo saldo: " + saldo);
        }else {
            JOptionPane.showMessageDialog(null, "Fondos insuficientes");
        }
    }

}
