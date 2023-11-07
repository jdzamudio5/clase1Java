package loginGV;

import javax.swing.JOptionPane;

import java.util.ArrayList;

public class loginGV {
    public static void main(String[] args) {
        metodoLogin metodoLogin = new metodoLogin();

        while (true) {
            String[] options = { "Registrarse", "Iniciar Sesión", "Salir" };
            int choice = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Inicio de Sesión",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            if (choice == 0) { // Registrarse
                String username = JOptionPane.showInputDialog("Ingrese su nombre de usuario:");
                String password = JOptionPane.showInputDialog("Ingrese su contraseña:");
                metodoLogin.registerUser(username, password);
            } else if (choice == 1) { // Iniciar Sesión
                String username = JOptionPane.showInputDialog("Ingrese su nombre de usuario:");
                String password = JOptionPane.showInputDialog("Ingrese su contraseña:");
                if (metodoLogin.loginUser(username, password)) {
                    break; // Si el inicio de sesión es exitoso, salimos del bucle
                }
            } else if (choice == 2) { // Salir
                break;
            }
        }
    }

}
