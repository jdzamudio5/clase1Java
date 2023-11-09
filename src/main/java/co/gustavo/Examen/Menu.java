package co.gustavo.Examen;

import co.gustavo.Examen.Cliente;
import javax.swing.*;
import java.util.ArrayList;

public class Menu {


    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<Banco> banco = new ArrayList<>();

   //private static Banco banco1 = new Banco("Occidente");

    public void mostrarMenu() {

      try {
          int opcion;

          do {
              String input = JOptionPane.showInputDialog(
                      "1. Crear cliente\n" +
                      "2. Consultar clientes\n" +
                      "3. Modificar clientes\n" +
                      "4. Crear cuenta\n" +
                      "5. Depositar Dinero\n" +
                      "6. retirar Dinero\n" +
                      "7. Salir\n" +
                      " Por favor digite una opcion:"
              );

              opcion = Integer.parseInt(input);

              switch (opcion) {
                  case 1:


                      String nombre = JOptionPane.showInputDialog("Digite el nombre del cliente:");
                      String tipoDoc = JOptionPane.showInputDialog("Digite el tipo de Documento:");
                      int numDoc = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de Documento:"));
                      int edad = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad:"));
                      int idCliente = Integer.parseInt(JOptionPane.showInputDialog("Digite el id del Cliente:"));
                      int numCuenta = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de cuenta:"));


                      Cliente nuevoCliente = new Cliente(nombre, tipoDoc, numDoc, edad, idCliente, numCuenta);
                      clientes.add(nuevoCliente);
                      JOptionPane.showMessageDialog(null, "El cliente ha sido creado.");
                      break;

                  case 2:

                      consultarCliente();// Busqueda de cliente


                      break;

                  case 3:

                      actualizarCliente();// Busqueda de cliente

                      break;

                  case 4:

                        crearCuenta();

                      break;

                  case 5:

                  Banco.deposito(100, clientes.get(0));

                      break;

                  case 6:

                  Banco.retiro(100,clientes.get(0));

                      break;


                  case 7:
                      JOptionPane.showMessageDialog(null, "Muchas Gracias por usar nuestro sistema");
                      break;

                  default:
                      JOptionPane.showMessageDialog(null, "Por favor, elija una opcion valida.");
                      break;
              }

          } while (opcion != 7);
      }catch (NumberFormatException e) {
          JOptionPane.showMessageDialog(null, "la opcion seleccionada no es valida intentelo mas tarde");
      }

    }// fin mostrar menu



    private void consultarCliente() {

        int numDoc = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de Documento del cliente:"));

        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);
            if (cliente.getNumDoc() == numDoc) {

                JOptionPane.showMessageDialog(null,"Cliente: "+cliente.getNombre()+
                "ID: "+cliente.getTipoDoc()+" "+cliente.getNumDoc()+
                " Numero de Cuenta: "+cliente.getNumCuenta());

            } else {

                JOptionPane.showMessageDialog(null,"Cliente no encontrado.");

            }
        }

    }


    public static void actualizarCliente() {


        int numDoc = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de Documento del cliente:"));


        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);
            if (cliente.getNumDoc() == numDoc) {

                cliente.setNombre(JOptionPane.showInputDialog("Digite el nombre a actualizar:"));
                cliente.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Digite la edad a actualizar:")));
                cliente.setCuenta(JOptionPane.showInputDialog("Digite el numero de cuenta a actualizar:"));

            } else {

                JOptionPane.showMessageDialog(null, "Cliente no encontrado.");

            }
        }
    }



        public static void crearCuenta() {


            int numDoc = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de Documento del cliente para crear cuenta:"));


            for (int i = 0; i < clientes.size(); i++) {
                Cliente cliente = clientes.get(i);
                if (cliente.getNumDoc() == numDoc) {

                    int saldo = Integer.parseInt(JOptionPane.showInputDialog("Digite el saldo a crear la cuenta :"));
                    Cuenta cuenta = new Cuenta("001",saldo,cliente);
                    Banco.abrirCuenta(cuenta);



                } else {

                    JOptionPane.showMessageDialog(null,"Debe Crear el Cliente para poder crear la cuenta.");

                }
            }


    }





} // fin de la clase






// Codigo para agregar a un panel

 /*StringBuilder clientesInfo = new StringBuilder("Clientes almacenados:\n");
                    if (clientes.isEmpty()) {
                        clientesInfo.append("No hay clientes almacenados.");
                    } else {
                        for (Cliente cliente : clientes) {
                            clientesInfo.append("Nombre: ").append(cliente.getNombre()).append(" - Edad: ").append(cliente.getEdad()).append("\n");
                        }
                    }
                    JOptionPane.showMessageDialog(null, clientesInfo.toString());
                    break;*/



/*

// Lista de Clientes (Control)
                      if (clientes.isEmpty()) {
                          System.out.println("No hay clientes almacenados.");
                      } else {
                          System.out.println("Clientes creados:");
                          for (int i = 0; i < clientes.size(); i++) {
                              Cliente cliente = clientes.get(i);
                              System.out.println("Nombre: " + cliente.getNombre() + "  Documento: " + cliente.getTipoDoc() + cliente.getNumDoc() + " - Edad: " + cliente.getEdad());
                          }
                      }
 */