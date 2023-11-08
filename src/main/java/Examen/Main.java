package Examen;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        boolean salir=false;
        do{
            String[] opciones = {"Cliente", "Banco", "Salir"};
            int seleccion = JOptionPane.showOptionDialog(
                    null,
                    "Selecciona una opcion para ingresar",
                    "Opciones",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );
            if(seleccion==0){
                System.out.println("Ingreso al modulo Cliente");
                boolean salirCliente=false;
                do {
                    String[] opciones = {"Ingresar", "Salir"};
                    int seleccion = JOptionPane.showOptionDialog(
                            null,
                            "Selecciona una opcion para ingresar",
                            "Opciones",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            opciones,
                            opciones[0]
                    );
                }while(!salirCliente);
            }
            if(seleccion==1){
                System.out.println("Ingreso al modulo Banco");
                ArrayList<String> usuarioBanco = new ArrayList<String>();
                usuarioBanco.add("admin"+"admin");
                int i=0;
                boolean salir=false;
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

            }
            if(seleccion==2){
                System.out.println("Hasta luego!!!");
                salir=true;
            }
        }while(!salir);
    }
}
