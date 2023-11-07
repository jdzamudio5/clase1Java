package co.jorge.Login;

import javax.swing.*;

import java.util.ArrayList;

import static co.jorge.Login.Agregar.nuevoUsuario;
import static co.jorge.Login.Imprimir.imprimirUsuarios;
import static co.jorge.Login.Eliminar.eliminarUsuario;
import static co.jorge.Login.Menu.mostrarMenu;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> usuarios = new ArrayList<String>();
        usuarios.add("admin"+"admin");
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
        if(i==1){
            do {
                mostrarMenu(usuarios, salir);
                System.out.println("resultado:"+usuarios+salir+i);
            }while(salir=false);
        }
    }
}


