package co.Miguel_Ochoa.Login;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Datos de usuario y contraseña
        String nombreUsuario = "Occidente*2023";
        String contrasena = "Occidente";

        // Entrada de usuario mediante diálogo de JOptionPane
        String usuarioIngresado = JOptionPane.showInputDialog("Nombre de usuario:");

        // Entrada de contraseña mediante cuadro de diálogo de JPasswordField
        JPasswordField contrasenaField = new JPasswordField();
        int option = JOptionPane.showConfirmDialog(null, contrasenaField, "Contraseña:", JOptionPane.OK_CANCEL_OPTION);

        // Verificar si los datos coinciden
        if (usuarioIngresado != null && option == JOptionPane.OK_OPTION &&
                usuarioIngresado.equals(nombreUsuario) && new String(contrasenaField.getPassword()).equals(contrasena)) {
            JOptionPane.showMessageDialog(null, "Bienvenido, te has logueado.");
        } else {
            JOptionPane.showMessageDialog(null, "Usuario y/o contraseña incorrecta.");
        }
    }
}
