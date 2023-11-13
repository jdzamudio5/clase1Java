package Examen;

import javax.swing.*;

import static Examen.Banco.crearCuenta;

public class Ui {
    public static void mostrarMenu() {
        boolean salir = false;
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
                System.out.println("Ingreso al modulo Cliente");
                boolean salirCliente = false;
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
            if (seleccion == 1) {
                System.out.println("Ingreso al modulo Banco");
                boolean salirBanco = false;
                do {
                    String[] opcionesBanco = {"Abrir Cuenta", "Consultar Cliente", "Actualizar Cliente", "Volver"};
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
                            System.out.println("Abrir cuenta");
                            break;
                        case 1:
                            System.out.println("Consultar Cliente");
                            break;
                        case 2:
                            System.out.println("Actualizar Cliente");
                            break;
                        case 3:
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
