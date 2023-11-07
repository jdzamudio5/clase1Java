package co.jorge.Login;

import javax.swing.*;
import java.util.ArrayList;

import static co.jorge.Login.Agregar.nuevoUsuario;
import static co.jorge.Login.Eliminar.eliminarUsuario;
import static co.jorge.Login.Imprimir.imprimirUsuarios;

public class Menu {
    public static boolean mostrarMenu(ArrayList<String> usuarios, boolean salir){
        String[] opciones = {"Agregar", "Eliminar","Imprimir", "Salir"};
        int seleccion = JOptionPane.showOptionDialog(
                null,
                "Selecciona una opcion",
                "Opciones",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                opciones,
                opciones[0]
        );
        if (seleccion == 0) {
            // Opción Agregar seleccionada
            System.out.println("Agregar");
            nuevoUsuario(usuarios);
            mostrarMenu(usuarios,salir);

        } else if (seleccion == 1) {
            // Opción Eliminar seleccionada
            System.out.println("Eliminar");
            eliminarUsuario(usuarios);
            salir = false;
        } else if (seleccion == 2) {
            // Opción imprimir seleccionada
            imprimirUsuarios(usuarios,salir);
            mostrarMenu(usuarios,salir);

        } else if (seleccion == 3) {
            // Opción Salir seleccionada
            System.out.println("Hasta Luego!!!");
            salir=true;
            System.out.println(salir);
        }
        return true;
    }
}
