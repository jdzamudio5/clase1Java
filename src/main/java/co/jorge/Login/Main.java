package co.jorge.Login;

import javax.swing.*;

import java.util.ArrayList;

import static co.jorge.Login.Agregar.nuevoUsuario;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> usuarios = new ArrayList<String>();
        usuarios.add("admin"+"admin");
        int i=0;
        do {
            String user = JOptionPane.showInputDialog("Ingrese el usuario administrador");
            String clave = JOptionPane.showInputDialog("Ingrese la clave del administrador");
            if(usuarios.contains(user+clave)){
                i=1;
            }
            else {
                JOptionPane.showMessageDialog(null, "Error, intente de nuevo!!!");
            }
        }while(i==0);
        if(i==1){
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

            } else if (seleccion == 1) {
                // Opción Eliminar seleccionada
                System.out.println("Eliminar");
            } else if (seleccion == 2) {
                // Opción imprimir seleccionada
                System.out.println("Imprimir");
                //imprimirContenido(usuario);

            } else if (seleccion == 3) {
                // Opción Salir seleccionada
                System.out.println("Hasta Luego!!!");
            }
        }
    }
}


