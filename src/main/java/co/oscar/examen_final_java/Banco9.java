package co.oscar.examen_final_java;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class Banco9 {

    private static ArrayList<Cliente9> listaClientes = new ArrayList<>();
    private static ArrayList<Cuenta9> listaCuentas = new ArrayList<>();

    public static Cliente9 crearCliente() {
        String nombre = JOptionPane.showInputDialog("Ingrese nombre del cliente:");
        String apellido = JOptionPane.showInputDialog("Ingrese apellido del cliente:");
        String identificacion = JOptionPane.showInputDialog("Ingrese número de CC del cliente:");
        Cliente9 cliente = new Cliente9(nombre, apellido, identificacion);
        listaClientes.add(cliente);
        return cliente;
    }

    public static Cuenta9 crearCuenta(Cliente9 cliente) {
        if (cliente == null) {
            JOptionPane.showMessageDialog(null, "Cliente no válido");
            return null;
        }

        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo a su nueva cuenta\n" +
                "(El saldo Mínimo es 50.000):"));
        String tipoCuenta = JOptionPane.showInputDialog("Ingrese el tipo de cuenta (ej: Ahorros, Corriente):");

        int numeroCuenta;
        do {
            numeroCuenta = generarNumeroCuentaUnico();
        } while (numeroCuentaYaExiste(numeroCuenta));

        Cuenta9 cuenta = new Cuenta9(saldo, tipoCuenta, cliente.getIdentificacion());
        cuenta.setNumeroCuenta(numeroCuenta); // Configurar el número de cuenta
        listaCuentas.add(cuenta);
        JOptionPane.showMessageDialog(null, "Cuenta creada exitosamente. Número de cuenta: " + numeroCuenta);
        return cuenta;
    }

    private static int generarNumeroCuentaUnico() {
        Random random = new Random();
        return 100000 + random.nextInt(900000); // Número entre 100000 y 999999
    }

    private static boolean numeroCuentaYaExiste(int numeroCuenta) {
        for (Cuenta9 cuenta : listaCuentas) {
            if (cuenta.getNumeroCuenta() == numeroCuenta) {
                return true;
            }
        }
        return false;
    }

    public static void mostrarClientes() {
        String clientesInfo = "Lista de Clientes:\n";
        for (Cliente9 cliente : listaClientes) {
            clientesInfo += "----------------------------\n";
            clientesInfo += "Nombre: " + cliente.getNombre() + "\n";
            clientesInfo += "Apellido: " + cliente.getApellido() + "\n";
            clientesInfo += "Identificación: " + cliente.getIdentificacion() + "\n";
            clientesInfo += "----------------------------\n";
        }
        JOptionPane.showMessageDialog(null, clientesInfo);
    }

    public static void actualizarInformacion() {
        // Implementación del método para actualizar información de los clientes
        // ...
    }

    public static void consignar(int numeroCuenta) {
        Cuenta9 cuenta = buscarCuenta(numeroCuenta);
        if (cuenta != null) {
            double cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a consignar:"));
            cuenta.consignar(cantidad);
        } else {
            JOptionPane.showMessageDialog(null, "Cuenta no encontrada");
        }
    }

    public static void retirar(int numeroCuenta) {
        Cuenta9 cuenta = buscarCuenta(numeroCuenta);
        if (cuenta != null) {
            double cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto del retiro:"));
            cuenta.retirar(cantidad);
        } else {
            JOptionPane.showMessageDialog(null, "Cuenta no encontrada");
        }
    }

    public static void saldo(int numeroCuenta) {
        Cuenta9 cuenta = buscarCuenta(numeroCuenta);
        if (cuenta != null) {
            cuenta.saldo();
        } else {
            JOptionPane.showMessageDialog(null, "Cuenta no encontrada");
        }
    }

    public static boolean eliminarCliente(String identificacion) {
        for (int i = 0; i < listaClientes.size(); i++) {
            Cliente9 cliente = listaClientes.get(i);
            if (cliente.getIdentificacion().equals(identificacion)) {
                eliminarCuentasCliente(cliente);
                listaClientes.remove(i);
                return true;
            }
        }
        return false;
    }

    private static void eliminarCuentasCliente(Cliente9 cliente) {
        listaCuentas.removeIf(cuenta -> cuenta.getClienteId().equals(cliente.getIdentificacion()));
    }

    private static Cuenta9 buscarCuenta(int numeroCuenta) {
        for (Cuenta9 cuenta : listaCuentas) {
            if (cuenta.getNumeroCuenta() == numeroCuenta) {
                return cuenta;
            }
        }
        return null;
    }
}