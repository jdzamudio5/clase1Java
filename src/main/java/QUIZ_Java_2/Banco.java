package QUIZ_Java_2;

import javax.swing.*;
import java.util.ArrayList;

class Banco {
    private static ArrayList<Cliente> listaClientes = new ArrayList<>();

    public static Cliente crearCliente() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido del cliente:");
        String identificacion = JOptionPane.showInputDialog("Ingrese la identificacion del cliente CC :");
        Cliente cliente = new Cliente(nombre, apellido, identificacion);
        listaClientes.add(cliente);
        return cliente;
    }

    public static Cuenta crearCuenta(Cliente titular) {
        JOptionPane.showMessageDialog(null, "No tiene cuenta creada");
        double saldoInicial = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo inicial de su nueva cuenta\n" +
                "(El saldo Minimo es 50.000):"));
        return new Cuenta(null, saldoInicial, titular);
    }

    public static void mostrarClientes() {
        String clientesInfo = "Lista de Clientes:\n";

        for (Cliente cliente : listaClientes) {
            clientesInfo += "----------------------------\n";
            clientesInfo += "Nombre: " + cliente.getNombre() + "\n";
            clientesInfo += "Apellido: " + cliente.getApellido() + "\n";
            clientesInfo += "Identificacion: " + cliente.getIdentificacion() + "\n";
            clientesInfo += "----------------------------\n";
        }

        JOptionPane.showMessageDialog(null, clientesInfo);
    }

    public static void actualizarInformacion() {
        if (listaClientes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lista vAcia, no hay clientes para actualizar");
            return;
        }

        String identificacionBuscar = JOptionPane.showInputDialog("Ingrese la identificacion del cliente que desea actualizar:");
        Cliente clienteEncontrado = null;

        for (Cliente cliente : listaClientes) {
            if (cliente.getIdentificacion().equals(identificacionBuscar)) {
                clienteEncontrado = cliente;
                break;
            }
        }

//        validacion de cliente*

        if (clienteEncontrado == null) {
            JOptionPane.showMessageDialog(null, "No se encontro un cliente con la identificación Ingresada");
            return;
        }

        String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del cliente:");
        String nuevoApellido = JOptionPane.showInputDialog("Ingrese el nuevo apellido del cliente:");


        clienteEncontrado.setNombre(nuevoNombre);
        clienteEncontrado.setApellido(nuevoApellido);

        JOptionPane.showMessageDialog(null, "Informacin del cliente  se actualizo correctamente");
    }

    public static void depositarDinero(Cuenta cuenta) {
        if (cuenta != null) {
            double cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a depositar:"));
            cuenta.depositar(cantidad);
        } else {
            JOptionPane.showMessageDialog(null, "No hay cuentas creadas. Primero debe crear una cuenta");
        }
    }

    public static void retirarDinero(Cuenta cuenta) {
        if (cuenta != null) {
            double cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a retirar:"));
            cuenta.retirar(cantidad);
        } else {
            JOptionPane.showMessageDialog(null, "No hay cuentas creadas.Se debe crear primero una cuenta");
        }
    }

    public static void verSaldo(Cuenta cuenta) {
        if (cuenta != null) {
            cuenta.verSaldo();
        } else {
            JOptionPane.showMessageDialog(null, "No hay cuentas creadas. Primero debe crear una cuenta");
        }
    }

    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente cliente = null;
        Cuenta cuenta = null;

        while (true) {
            String opcion = JOptionPane.showInputDialog(
                            "1. Crear cliente y cuenta \n" +
                            "2. Mostrar Clientes\n" +
                            "3. Actualizar Informacion\n" +
                            "4. Depositar Dinero\n" +
                            "5. Retirar Dinero\n" +
                            "6. Ver Saldo\n" +
                            "7. Salir\n" +
                            "Seleccione una opcion:");

            switch (opcion) {
                case "1":
                    cliente = banco.crearCliente();
                    cuenta = banco.crearCuenta(cliente);
                    JOptionPane.showMessageDialog(null, "Cliente y cuenta creados exitosamente");
                    break;
                case "2":
                    banco.mostrarClientes();
                    break;
                case "3":
                    banco.actualizarInformacion();
                    break;
                case "4":
                    banco.depositarDinero(cuenta);
                    break;
                case "5":
                    banco.retirarDinero(cuenta);
                    break;
                case "6":
                    banco.verSaldo(cuenta);
                    break;
                case "7":
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida Por favor seleccione una opcion" +
                            " del MENU del 1 al 7");
                    break;
            }
        }
    }
}
