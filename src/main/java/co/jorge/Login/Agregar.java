package co.jorge.Login;

import javax.swing.*;
import java.util.ArrayList;

public class Agregar {
    public static void nuevoUsuario(ArrayList<String> usuarios){
        String user = JOptionPane.showInputDialog("Ingrese el nuevo usuario");
        String clave = JOptionPane.showInputDialog("Ingrese la clave del nuevo usuario");
        usuarios.add(user+clave);
    }
}
