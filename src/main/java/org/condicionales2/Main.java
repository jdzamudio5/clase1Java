package org.condicionales2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String user="";//Occidente
        String password="";//Occidente*2023
        
        user=JOptionPane.showInputDialog("Ingresa tu usuario");
        password=JOptionPane.showInputDialog("Ingresa tu contraseña");
        
        if (user.equals("Occidente")&& password.equals("Occidente*2023")){
            JOptionPane.showMessageDialog(null, "Bienvenido, te has logueado.");
            } else if (user != "Occidente" || password != "Occidente*2023") {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña errada");
        } else {
            System.out.println("Error");
        }


    }
}
