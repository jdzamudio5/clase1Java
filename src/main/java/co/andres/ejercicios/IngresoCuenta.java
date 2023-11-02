package co.andres.ejercicios;

import javax.swing.JOptionPane;
public class IngresoCuenta {
    public static void main(String[] args) {
        boolean usuarioCreado = false;
        String correo = "";
        String contrasena = "";

        while (true) {
            String opcion = JOptionPane.showInputDialog("Elija una opción:\n1. Crear Usuario\n2. Ingresar a la Cuenta\n3. Salir");

            switch (opcion) {
                case "1":
                    correo = JOptionPane.showInputDialog("Ingrese su correo electronico");
                    contrasena = JOptionPane.showInputDialog("Ingrese su contraseña");
                    usuarioCreado = true;

            }
        }

    }
}
