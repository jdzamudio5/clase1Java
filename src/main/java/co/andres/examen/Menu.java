package co.andres.examen;

import javax.swing.JOptionPane;

public class Menu {
    private Banco banco;

    public Menu(Banco banco) {
        this.banco = banco;
    }

    public void iniciar() {
        while (true) {
            String opcion = JOptionPane.showInputDialog(
                    "1. Agregar cliente\n" +
                            "2. Agregar cuenta\n" +
                            "3. Buscar cliente\n" +
                            "4. Buscar cuenta\n" +
                            "5. Actualizar información del cliente\n" +
                            "6. Cerrar cuenta\n" +
                            "7. Salir\n" +
                            "Seleccione una opción:"
            );

            switch (opcion) {
                case "1":
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
                    String apellido = JOptionPane.showInputDialog("Ingrese el apellido del cliente:");
                    int identificacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la identificación del cliente:"));
                    Cliente cliente = new Cliente(nombre, apellido, identificacion, null);
                    banco.agregarClientes(cliente);
                    break;
                case "2":
                    int numeroCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de cuenta:"));
                    double saldoInicial = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo inicial:"));
                    Cuenta cuenta = new Cuenta(numeroCuenta, saldoInicial);
                    banco.agregarCuenta(cuenta);
                    break;
                case "3":
                    int idCliente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la identificación del cliente:"));
                    Cliente clienteBuscado = banco.buscarCliente(idCliente);
                    if (clienteBuscado != null) {
                        JOptionPane.showMessageDialog(null, "Cliente encontrado: " + clienteBuscado.getNombre() + " " + clienteBuscado.getApellido());
                    } else {
                        JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
                    }
                    break;
                case "4":
                    int numCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de cuenta:"));
                    Cuenta cuentaBuscada = banco.buscarCuenta(numCuenta);
                    if (cuentaBuscada != null) {
                        JOptionPane.showMessageDialog(null, "Cuenta encontrada. Saldo: " + cuentaBuscada.consultarSaldo());
                    } else {
                        JOptionPane.showMessageDialog(null, "Cuenta no encontrada.");
                    }
                    break;
                case "5":
                    int idClienteActualizar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la identificación del cliente:"));
                    String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre:");
                    String nuevoApellido = JOptionPane.showInputDialog("Ingrese el nuevo apellido:");
                    Cliente clienteActualizar = banco.buscarCliente(idClienteActualizar);
                    if (clienteActualizar != null) {
                        banco.actualizarInformacionCliente(clienteActualizar, nuevoNombre, nuevoApellido);
                        JOptionPane.showMessageDialog(null, "Información del cliente actualizada.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
                    }
                    break;
                case "6":
                    int numCuentaCerrar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de cuenta:"));
                    banco.cerrarCuenta(numCuentaCerrar);
                    JOptionPane.showMessageDialog(null, "Cuenta cerrada.");
                    break;
                case "7":
                    JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
            }
        }
    }
}



