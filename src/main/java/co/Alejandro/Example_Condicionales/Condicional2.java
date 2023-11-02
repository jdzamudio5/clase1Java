package co.Alejandro.Example_Condicionales;

import javax.swing.*;

public class Condicional2 {
    public static void main(String[] args) {
        String user;

        user=JOptionPane.showInputDialog("Introduce tu Usuario: ");
        String password;
        password =JOptionPane.showInputDialog("Introduce tu Contraseña: ");

        if (user.equals("occidente") && password.equals("occidente*2023")) {
            System.out.println("Usuario Logueado");
        } else if ((user != "occidente") && password.equals("occidente*2023")) {

        }
        System.out.println("Usuario o Contraseña Incorrecto");
    }
}
