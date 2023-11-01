package org.LOGIN_POO;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        // Credenciales fijas
        String username = "Occidente*2023";
        String password = "Occidente";

        // Crear el usuario con las credenciales
        Usuario usuario = new Usuario(username, password);
        SistemaDeLogin sistemaDeLogin = new SistemaDeLogin(usuario);

        // Pedir al usuario que inicie sesión
        String loginUsername = JOptionPane.showInputDialog(null, "Inicio de sesión\nIngrese su nombre de usuario:");
        String loginPassword = JOptionPane.showInputDialog(null, "Ingrese su contraseña:");

        // Validar las credenciales
        if (sistemaDeLogin.iniciarSesion(loginUsername, loginPassword)) {
            JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso.");
        } else {
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
