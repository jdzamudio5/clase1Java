package org.Login;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        // Datos de usuario y contraseña
        String nombreUsuario = "Occidente*2023";
        String contrasena = "Occidente";

        // Entrada de usuario y contraseña mediante diálogos de JOptionPane
        String usuarioIngresado = JOptionPane.showInputDialog("Nombre de usuario:");
        String contrasenaIngresada = JOptionPane.showInputDialog("Contrasena:");

        // Verificar si los datos coinciden
        if (usuarioIngresado != null && contrasenaIngresada != null &&
                usuarioIngresado.equals(nombreUsuario) && contrasenaIngresada.equals(contrasena)) {
            JOptionPane.showMessageDialog(null, "Bienvenido, te has logueado.");
        } else {
            JOptionPane.showMessageDialog(null, "Usuario y/o contrasena incorrecta.");
        }
    }
}
