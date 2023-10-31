package org.MiguelAcevedo.condicionalespt2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String user="";
        String password="";

        user=JOptionPane.showInputDialog("Introduce tu usuario");
        password=JOptionPane.showInputDialog("Introduce tu contraseña");

        if (user.equals("Occidente") && password.equals("Occidente*2023")){
            //System.out.println("Usuario logueado con éxito.");
            JOptionPane.showMessageDialog(null, "Usuario logueado con éxito.");
        }else {
            JOptionPane.showMessageDialog(null, "Las credenciales son incorrectas, intente de nuevo.");
        }
       // else {
       //     JOptionPane.showMessageDialog(null, "Las credenciales son incorrectas, intente de nuevo.");
       // }
    }
}
