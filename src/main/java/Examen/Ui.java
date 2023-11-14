package Examen;

import javax.swing.*;

import static Examen.Banco.*;
import static Examen.Cuenta.crearCuenta;
import static Examen.Persona.*;

public class Ui {
    public static void mostrarMenu() {
        boolean salir = false;
        boolean hayClientes=false;
        do {
            String[] opciones = {"Cliente", "Banco", "Salir"};
            int seleccion = JOptionPane.showOptionDialog(
                    null,
                    "Selecciona una opcion para ingresar",
                    "Opciones",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);
            if (seleccion == 0) {
                boolean salirCliente = false;
                if(hayClientes!=true){
                    System.out.println("Cree un Cliente primero, por la opcion Banco!!!");
                    salirCliente=true;
                } else if (hayClientes!=false) {
                    System.out.println("Ingreso al modulo Cliente");
                    do {
                        String[] opcionesCliente = {"Ver Saldo Cta", "Depositar dinero", "Retirar Dinero", "Volver"};
                        int seleccioncliente = JOptionPane.showOptionDialog(
                                null,
                                "Selecciona una opcion para ingresar",
                                "Opciones",
                                JOptionPane.DEFAULT_OPTION,
                                JOptionPane.PLAIN_MESSAGE,
                                null,
                                opcionesCliente,
                                opcionesCliente[0]);
                        switch (seleccioncliente) {
                            case 0:
                                System.out.println("Ver Saldo");
                                break;
                            case 1:
                                System.out.println("Depositar Dinero");
                                break;
                            case 2:
                                System.out.println("Retirar Dinero");
                                break;
                            case 3:
                                salirCliente = true;
                                System.out.println("Hasta luego!!!");
                                break;
                        }
                    } while (!salirCliente);
                }
            }
            if (seleccion == 1) {
                System.out.println("Ingreso al modulo Banco");
                boolean salirBanco = false;
                do {
                    String[] opcionesBanco = {"Crear Cliente","Abrir Cuenta", "Consultar Cliente", "Actualizar Cliente","Volver"};
                    int seleccionBanco = JOptionPane.showOptionDialog(
                            null,
                            "Selecciona una opcion para ingresar",
                            "Opciones",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            opcionesBanco,
                            opcionesBanco[0]
                    );
                    switch (seleccionBanco) {
                        case 0:
                            System.out.println("Crear Cliente");
                            crearPersona();
                            break;
                        case 1:
                            System.out.println("Abrir cuenta");
                            int cedula = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cedula del cliente:"));
                            crearCuenta(cedula);
                            break;
                        case 2:
                            System.out.println("Consultar Cliente");
                            double cedulaCliente=0;
                            try {
                                cedulaCliente = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cedula del cliente:"));
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido para la cedula del cliente.");
                            }
                            consultarPersona(cedulaCliente);
                            break;
                        case 3:
                            System.out.println("Actualizar Cliente");
                            break;
                        case 4:
                            System.out.println("Salir");
                            salirBanco = true;
                            break;
                    }
                } while (!salirBanco);
            }
            if (seleccion == 2) {
                System.out.println("Hasta luego!!!");
                salir = true;
            }
        } while (!salir);
    }
}
