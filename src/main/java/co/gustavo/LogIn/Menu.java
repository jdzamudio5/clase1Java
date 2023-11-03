package co.gustavo.LogIn;
import javax.swing.JOptionPane;

import java.util.ArrayList;

import static co.gustavo.LogIn.LogIn.verificarCredenciales;
import static co.gustavo.LogIn.Registro.*;

public class Menu {


    static boolean esInt = false;


    public static int seleccionarOpcion(){

        int opcion =0;

            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion: \n" +
                                                                      "1. Crear usuario\n" +
                                                                      "2. Ingresar al sistema\n" +
                                                                      "3. Salir"));
                if (opcion < 1 || opcion > 3) {
                    JOptionPane.showMessageDialog(null, "Ingrese una opcion valida ");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese una opcion valida.");
            }

        return opcion;
    }// Fin seleccionarOpcion


    public static void proceso(int opcion){

        switch (opcion) {
            case 1:
                capturarUsuario();

                break;
            case 2:

                consulta();

                break;
            case 3:
                // System.exit(0); // Sale del programa
                break;

        }
    }// Fin





}
