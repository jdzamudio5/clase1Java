package Examen2BO;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Administrador admin = new Administrador("Admin", "123");
        banco.administradores.add(admin);

        while (true) {


            String opcion = JOptionPane.showInputDialog("Elija una opcion:\n1. Crear cuenta\n2. Iniciar sesion\n3. Inicio Administrador \n4. Salir");

            switch (opcion) {
                case "1":
                    String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
                    String identificacion = JOptionPane.showInputDialog("Ingrese su identificacion:");
                    double saldoInicial = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo inicial (minimo 50.000):"));


                    if (saldoInicial < 50000) {
                        JOptionPane.showMessageDialog(null, "El saldo inicial debe ser al menos 50.000 pesos.");
                        continue;
                    }
                    Cliente nuevoCliente = new Cliente(nombre, "", identificacion, saldoInicial, false);
                    banco.agregarCliente(nuevoCliente);
                    break;
                case "2":


                    String username = JOptionPane.showInputDialog("Ingrese su nombre:");


                    String id = JOptionPane.showInputDialog("Ingrese su identificacion:");


                    boolean usuarioEncontrado = false;

                    for (Cliente cliente : banco.clientes) {
                        if (cliente.nombre.equals(username) && cliente.identificacion.equals(id)) {
                            usuarioEncontrado = true;


                            String accion = JOptionPane.showInputDialog("Elija una accion:\n1. Depositar\n2. Ver saldo\n3. Retirar");

                            switch (accion) {
                                case "1":


                                    double montoDeposito = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a depositar:"));
                                    cliente.depositar(montoDeposito);


                                    break;


                                case "2":
                                    cliente.verSaldo();

                                    break;

                                case "3":


                                    double montoRetiro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a retirar:"));
                                    cliente.retirar(montoRetiro);


                                    break;


                                default:
                                    JOptionPane.showMessageDialog(null, "Opcion no valida.");
                            }
                            break;
                        }
                    }

                    if (!usuarioEncontrado) {
                        JOptionPane.showMessageDialog(null, "Usuario no encontrado. Por favor, verifique sus datos.");
                    }
                    break;



                case "3":
                    // Opción para Administrador
                    String adminUsername = JOptionPane.showInputDialog("Ingrese nombre de administrador:");
                    String adminPassword = JOptionPane.showInputDialog("Ingrese contraseña:");

                    if (adminUsername.equals("Admin") && adminPassword.equals("123")) {
                        // Iniciar sesión como Administrador
                        String adminOption = JOptionPane.showInputDialog("Elija una opción:\n1. Listar clientes\n2. Modificar saldo de un cliente");

                        // Reutilizar la variable existente si ya está definida
                        if (admin == null) {
                            admin = banco.administradores.get(0); // Suponiendo que solo hay un administrador
                        }

                        switch (adminOption) {
                            case "1":
                                admin.listarClientes(banco.clientes);
                                break;

                            case "2":
                                String clienteId = JOptionPane.showInputDialog("Ingrese la identificación del cliente:");
                                Cliente clienteAModificar = banco.buscarClientePorIdentificacion(clienteId);

                                if (clienteAModificar != null) {
                                    double nuevoSaldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo saldo:"));
                                    admin.modificarCliente(clienteAModificar, nuevoSaldo);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
                                }
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "Opción no válida.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Credenciales de administrador incorrectas.");
                    }
                    break;



                case "4":
                    JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestro sistema.");
                    System.exit(0);


                    break;






                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida.");


            }




        }
    }
}



