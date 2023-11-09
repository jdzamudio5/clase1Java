package co.juandavid.examenCuentaBocc;
import javax.swing.*;
import java.util.Scanner;
public class Banco {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"Bienvenido al Banco de Occidente");

        String nombre = JOptionPane.showInputDialog(null,"Ingrese su nombre: ");

        String apellido = JOptionPane.showInputDialog(null,"Ingrese su apellido: ");

        String identificacion = JOptionPane.showInputDialog(null,"Ingrese su identificación: ");

        double saldoInicial = 50000; // Saldo inicial mínimo de $50,000
        Cliente cliente = new Cliente(nombre, apellido, identificacion, saldoInicial);
        CuentaDeAhorros cuenta = new CuentaDeAhorros(cliente);

        while (true) {
            String mensaje = "\n¿Qué desea hacer?\n1. Depositar dinero\n2. Ver saldo\n3. Retirar dinero\n4. Salir\n\nSeleccione una opción:";

            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double deposito = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la cantidad a depositar: "));
                    cuenta.depositar(deposito);
                    break;
                case 2:
                    cuenta.verSaldo();
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double retiro = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la cantidad a retirar: "));
                    cuenta.retirar(retiro);
                    break;
                case 4:
                    JOptionPane.showInputDialog(null,"Gracias por usar nuestros servicios. ¡Hasta luego!");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }
}