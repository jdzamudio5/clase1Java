package co.jorge.Login;

import javax.swing.*;
import java.util.ArrayList;

public class Eliminar {
    public static void eliminarUsuario(ArrayList<String> usuarios){
        String user = JOptionPane.showInputDialog("Ingrese el usuario a borrar");
        String clave = JOptionPane.showInputDialog("Ingrese clave del usuario a borrar");
        int posicion = usuarios.indexOf(user+clave);
        System.out.println(posicion);

    }
}
