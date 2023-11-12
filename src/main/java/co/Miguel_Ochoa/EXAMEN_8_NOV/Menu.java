package co.Miguel_Ochoa.EXAMEN_8_NOV;


/*
Este código fue realizado por: Miguel Esteban Ochoa
Inicio de creación código: 08 de Noviembre 2023
Finalización de creación código: 12 de Noviembre 2023
 */

import javax.swing.JOptionPane;
import java.util.List;


/*
Este código fue realizado por: Miguel Esteban Ochoa
Inicio de creación código: 08 de Noviembre 2023
Finalización de creación código: 12 de Noviembre 2023
 */

public class Menu {
    private Banco banco;
    private ActualizarCliente actualizarCliente;
    private AgregarCliente agregaCliente;
    private BuscarCliente buscaCliente;
    private EliminarCliente eliminarCliente;
    private ConsultarClientesEliminados consultaClientesEliminados;
    private OperacionesCuenta operaCuenta;
    private MostrarTodosLosClientes mostrarClientes;


    public Menu() {
        banco = new Banco();
    }


    public void mostrarMenuPrincipal() {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Menu Principal\n" +
                            "1. Cliente\n" +
                            "2. Operaciones de Cuenta\n" +
                            "3. Cuenta\n" +
                            "4. Salir\n" +
                            "Seleccione una opcion:"));

            switch (opcion) {
                case 1:
                    submenuCliente();
                    break;
                case 2:
                    submenuOperacionesCuenta();
                    break;
                case 3:
                    submenuCuenta();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (opcion != 4);
    }

    private void submenuCuenta() {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Menu Cuenta\n" +
                            "1. Crear Cuenta\n" +
                            "2. Buscar Cuenta\n" +
                            "3. Eliminar Cuenta\n" +
                            "4. Mostrar Cuentas Eliminadas\n" +
                            "5. Salir\n" +
                            "Seleccione una opcion:"));


            switch (opcion) {
                case 1:
                    // Crear Cuenta
                    String cedulaClienteParaCrear = pedirCedula();
                    Cliente clienteParaCrearCuenta = banco.buscarClientePorCedula(cedulaClienteParaCrear);
                    if (clienteParaCrearCuenta != null) {
                        String tipoDeCuenta = JOptionPane.showInputDialog(null, "Ingrese el tipo de cuenta (Ahorro/Corriente):");
                        String saldoInicialStr = JOptionPane.showInputDialog(null, "Ingrese el saldo inicial (mínimo $50.000):");
                        double saldoInicial;
                        try {
                            saldoInicial = Double.parseDouble(saldoInicialStr);
                            if (saldoInicial < 50000) {
                                JOptionPane.showMessageDialog(null, "El saldo inicial debe ser al menos de $50.000");
                                break;
                            }
                            CrearCuenta servicioCrearCuenta = new CrearCuenta(); // Asumiendo que CrearCuenta no necesita argumentos en el constructor
                            Cuenta nuevaCuenta = servicioCrearCuenta.crearCuenta(clienteParaCrearCuenta, tipoDeCuenta, saldoInicial);
                            JOptionPane.showMessageDialog(null, "Cuenta creada con exito. Número de cuenta: " + nuevaCuenta.getNumeroDeCuenta());
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Entrada no válida para el saldo inicial");
                        } catch (IllegalArgumentException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
                    }
                    break;
                case 2:
                    // Buscar Cuenta
                    String numeroCuentaBuscar = pedirNumeroCuenta();
                    Cuenta cuentaBuscada = BuscarCuenta.buscarporNumero(banco.getClientes(), numeroCuentaBuscar);
                    if (cuentaBuscada != null) {
                        JOptionPane.showMessageDialog(null, "Cuenta encontrada: " + cuentaBuscada.getNumeroDeCuenta());
                    } else {
                        JOptionPane.showMessageDialog(null, "Cuenta no encontrada.");
                    }
                    break;
                case 3:
                    // Eliminar Cuenta
                    String cedulaClienteParaEliminar = pedirCedula();
                    Cliente clienteParaEliminarCuenta = banco.buscarClientePorCedula(cedulaClienteParaEliminar);
                    if (clienteParaEliminarCuenta != null) {
                        EliminarCuenta.eliminarCuenta(clienteParaEliminarCuenta);
                    } else {
                        JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
                    }
                    break;
                case 4:
                    // Mostrar Cuentas Eliminadas
                    MostrarCuentasEliminadas.mostrarCuentasEliminadas();
                    break;
                case 5:
                    // Salir del submenú
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no válida");
            }
        } while (opcion != 5);
    }


    private void submenuCliente() {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Menu Cliente\n" +
                            "1. Crear Cliente\n" +
                            "2. Actualizar Cliente\n" +
                            "3. Eliminar Cliente\n" +
                            "4. Consultar Clientes Eliminados\n" +
                            "5. Consultar Cliente\n" +
                            "6. Consultar Todos los Clientes\n" +
                            "7. Salir\n" +
                            "Seleccione una opcion:"));

            switch (opcion) {
                case 1:
                    Cliente nuevoCliente = pedirDatosCliente();
                    agregaCliente.agregar(banco.getClientes(), nuevoCliente);
                    break;
                case 2:
                    String cedulaActualizar = pedirCedula();
                    String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre:");
                    String nuevoApellido = JOptionPane.showInputDialog("Ingrese el nuevo apellido:");
                    actualizarCliente.actualizar(banco.getClientes(), cedulaActualizar, nuevoNombre, nuevoApellido);
                    break;
                case 3:
                    String cedulaEliminar = pedirCedula();
                    eliminarCliente.eliminar(banco.getClientes(), cedulaEliminar);
                    break;
                case 4:
                    consultaClientesEliminados.mostrarClientesEliminados(banco.getClientesEliminados());
                    break;
                case 5:
                    // Opción para consultar un cliente
                    String cedulaConsultar = pedirCedula();
                    Cliente clienteConsultado = banco.buscarClientePorCedula(cedulaConsultar);
                    if (clienteConsultado != null) {
                        JOptionPane.showMessageDialog(null, "Cliente encontrado: " + clienteConsultado.getNombre() + " " + clienteConsultado.getApellido());
                    } else {
                        JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
                    }
                    break;
                case 6:
                    mostrarTodosLosClientes();
                    break;

                case 7:
                    break; // Salir del menú

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (opcion != 7);
    }
    private void submenuOperacionesCuenta() {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Menu Operaciones de Cuenta\n" +
                            "1. Consultar Saldo\n" +
                            "2. Depositar\n" +
                            "3. Retirar\n" +
                            "4. Transferir\n" +
                            "5. Salir\n" +
                            "Seleccione una opcion:"));

            switch (opcion) {
                case 1:
                    Cuenta cuentaConsulta = banco.buscarCuentaPorNumero(pedirNumeroCuenta());
                    if (cuentaConsulta != null) {
                        operaCuenta.consultarSaldo(cuentaConsulta);
                    } else {
                        JOptionPane.showMessageDialog(null, "Cuenta no encontrada.");
                    }
                    break;
                case 2:
                    Cuenta cuentaDeposito = banco.buscarCuentaPorNumero(pedirNumeroCuenta());
                    if (cuentaDeposito != null) {
                        operaCuenta.depositar(cuentaDeposito, pedirMonto());
                    } else {
                        JOptionPane.showMessageDialog(null, "Cuenta no encontrada.");
                    }
                    break;
                case 3:
                    Cuenta cuentaRetiro = banco.buscarCuentaPorNumero(pedirNumeroCuenta());
                    if (cuentaRetiro != null) {
                        operaCuenta.retirar(cuentaRetiro, pedirMonto());
                    } else {
                        JOptionPane.showMessageDialog(null, "Cuenta no encontrada.");
                    }
                    break;
                case 4:
                    Cuenta cuentaOrigen = banco.buscarCuentaPorNumero(pedirNumeroCuentaOrigen());
                    Cuenta cuentaDestino = banco.buscarCuentaPorNumero(pedirNumeroCuentaDestino());
                    if (cuentaOrigen != null && cuentaDestino != null) {
                        operaCuenta.transferir(cuentaOrigen, cuentaDestino, pedirMonto());
                    } else {
                        JOptionPane.showMessageDialog(null, "Una o ambas cuentas no fueron encontradas.");
                    }
                    break;
                case 5:
                    break; // Salir del menú
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (opcion != 5);
    }

    private String pedirNumeroCuenta() {
        return JOptionPane.showInputDialog(null, "Ingrese el numero de cuenta:");
    }

    private String pedirNumeroCuentaOrigen() {
        return JOptionPane.showInputDialog(null, "Ingrese el numero de cuenta de origen:");
    }

    private String pedirNumeroCuentaDestino() {
        return JOptionPane.showInputDialog(null, "Ingrese el numero de cuenta destino:");
    }

    private double pedirMonto() {
        double monto = 0;
        do {
            try {
                String montoStr = JOptionPane.showInputDialog(null, "Ingrese el monto (monto mínimo $50,000):");
                monto = Double.parseDouble(montoStr);
                if (monto < 50000) {
                    JOptionPane.showMessageDialog(null, "El monto debe ser al menos de $50,000.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un numero válido.");
            }
        } while (monto < 50000);

        return monto;
    }


    private void mostrarTodosLosClientes() {
        List<Cliente> listaClientes = banco.getClientes();
        if (listaClientes == null || listaClientes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay clientes para mostrar.", "Información de Clientes", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        String[] infoClientes = new String[listaClientes.size()];

        int index = 0;
        for (Cliente cliente : listaClientes) {
            if (cliente == null) continue;

            StringBuilder infoCliente = new StringBuilder();
            infoCliente.append("Nombre Cliente: ").append(cliente.getNombre()).append("\n");
            infoCliente.append("Apellido Cliente: ").append(cliente.getApellido()).append("\n");
            infoCliente.append("Cedula Cliente: ").append(cliente.getCedulaUsuario()).append("\n");

            List<Cuenta> cuentas = cliente.getCuentas();
            if (cuentas != null && !cuentas.isEmpty()) {
                for (Cuenta cuenta : cuentas) {
                    if (cuenta == null) continue;
                    infoCliente.append("Tipo de Cuenta: ").append(cuenta.getTipoDeCuenta()).append("\n");
                    infoCliente.append("Numero de Cuenta: ").append(cuenta.getNumeroDeCuenta()).append("\n");
                    infoCliente.append("Saldo de Cuenta: ").append(cuenta.getSaldo()).append("\n");
                }
            } else {
                infoCliente.append("No hay cuentas asociadas a este cliente.\n");
            }

            infoClientes[index++] = infoCliente.toString();
        }

        for (String infoCliente : infoClientes) {
            JOptionPane.showMessageDialog(null, infoCliente, "Información del Cliente", JOptionPane.INFORMATION_MESSAGE);
        }
    }




    private Cliente pedirDatosCliente() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido del cliente:");
        String cedula = pedirCedula();

        // Preguntar si el cliente es nuevo o antiguo
        int esNuevoRespuesta = JOptionPane.showConfirmDialog(null, "¿Es un cliente nuevo?", "Nuevo Cliente", JOptionPane.YES_NO_OPTION);
        boolean esNuevo = (esNuevoRespuesta == JOptionPane.YES_OPTION);

        // Determinar si es antiguo basado en si es nuevo o no
        boolean esAntiguo = !esNuevo;

        // Aquí puedes agregar más campos si es necesario
        return new Cliente(nombre, apellido, cedula, esNuevo, esAntiguo);
    }


    private String pedirCedula() {
        return JOptionPane.showInputDialog("Ingrese la cedula del cliente:");
    }



}
