package co.oscar.examen_final_java;

import javax.swing.*;

public class Main9 {
    public static void main(String[] args) {
        int opcion;
        do {
            String[] opciones = {"Salir", "Gestionar Clientes", "Depositar", "Retirar", "Ver Saldo", "Ver todos los clientes"};
            opcion = JOptionPane.showOptionDialog(
                    null,
                    "Selecciona una opción:",
                    "Menú Banco de Occidente",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);

            switch (opcion) {
                case 1: // Gestionar Clientes
                    gestionarClientes();
                    break;
                case 2: // Depositar
                    realizarOperacion("depositar");
                    break;
                case 3: // Retirar
                    realizarOperacion("retirar");
                    break;
                case 4: // Ver Saldo
                    verSaldo();
                    break;
                case 5: // Ver todos los clientes
                    Banco9.mostrarClientes();
                    break;
                case 0: // Salir
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (opcion != 0);
    }

    private static void gestionarClientes() {
        String[] opcionesCliente = {"Crear Cliente", "Actualizar Información", "Eliminar Cliente"};
        int opcionCliente = JOptionPane.showOptionDialog(
                null,
                "Gestión de Clientes",
                "Menú Clientes",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcionesCliente,
                opcionesCliente[0]);

        switch (opcionCliente) {
            case 0: // Crear Cliente
                Cliente9 cliente = Banco9.crearCliente();
                if (cliente != null) {
                    int respuesta = JOptionPane.showConfirmDialog(null,
                            "Cliente creado. ¿Desea crear una cuenta para este cliente?",
                            "Crear Cuenta",
                            JOptionPane.YES_NO_OPTION);
                    if (respuesta == JOptionPane.YES_OPTION) {
                        Banco9.crearCuenta(cliente);
                    }
                }
                break;
            case 1: // Actualizar Información
                Banco9.actualizarInformacion();
                break;
            case 2: // Eliminar Cliente
                String identificacion = JOptionPane.showInputDialog("Ingrese la identificación del cliente a eliminar:");
                boolean eliminado = Banco9.eliminarCliente(identificacion);
                if (eliminado) {
                    JOptionPane.showMessageDialog(null, "Cliente eliminado exitosamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "Cliente no encontrado o no se pudo eliminar.");
                }
                break;
        }
    }

    private static void realizarOperacion(String operacion) {
        int numeroCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de cuenta:"));

        if (operacion.equals("depositar")) {
            Banco9.consignar(numeroCuenta);
        } else if (operacion.equals("retirar")) {
            Banco9.retirar(numeroCuenta);
        }
    }

    private static void verSaldo() {
        int numeroCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de cuenta:"));
        Banco9.saldo(numeroCuenta);
    }
}