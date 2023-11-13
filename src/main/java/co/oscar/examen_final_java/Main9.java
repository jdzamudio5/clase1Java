package co.oscar.examen_final_java;

import javax.swing.*;

public class Main9 {
    public static void main(String[] args) {
        Banco9.Banco banco = new Banco9.Banco();

        int opcion;
        do {
            String[] opciones = {"Salir", "Consultar Cliente", "Asociar cliente", "Actualizar cliente", "Ver todos los clientes"};
            opcion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione la opcion:",
                    "Banco de Occidente",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);

            switch (opcion) {
                case 1:
                    Banco9.Banco.consultarCliente();
                    break;
                case 2:
                    Banco9.Banco.asociarCliente();
                    break;
                case 3:
                    Banco9.Banco.actualizarInformacionCliente();
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        } while (opcion != 0); // La opción 0 es Salir
    }
}


