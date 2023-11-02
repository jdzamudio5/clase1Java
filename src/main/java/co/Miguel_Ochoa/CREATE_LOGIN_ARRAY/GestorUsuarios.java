package co.Miguel_Ochoa.CREATE_LOGIN_ARRAY;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
public class GestorUsuarios {
    private List<Usuario> usuarios;

    public GestorUsuarios() {
        this.usuarios = new ArrayList<>();
    }

    public void registrarUsuario() {
        String nombreCompleto = JOptionPane.showInputDialog("Ingrese su nombre completo:");
        String cedula = JOptionPane.showInputDialog("Ingrese su cedula:");
        String correo = JOptionPane.showInputDialog("Ingrese su correo electrónico:");
        String nombreUsuario = JOptionPane.showInputDialog("Ingrese su nombre de usuario:");
        String contrasena = JOptionPane.showInputDialog("Ingrese su contrasena:");

        Usuario usuario = new Usuario(nombreCompleto, cedula, correo, nombreUsuario, contrasena);
        usuarios.add(usuario);
        JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente!");
        mostrarMenu();
    }

    public void iniciarSesion() {
        String nombreUsuario = JOptionPane.showInputDialog("Ingrese su nombre de usuario:");
        String contrasena = JOptionPane.showInputDialog("Ingrese su contrasena:");

        for (Usuario usuario : usuarios) {
            if (usuario.getNombreUsuario().equals(nombreUsuario) && usuario.getcontrasena().equals(contrasena)) {
                JOptionPane.showMessageDialog(null, "Bienvenido, " + nombreUsuario + "!");
                mostrarMenu();
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Nombre de usuario o contrasena incorrectos.");
        mostrarMenu();
    }

    public void actualizarInformacionUsuario() {
        String nombreUsuario = JOptionPane.showInputDialog("Ingrese su nombre de usuario para actualizar:");

        for (Usuario usuario : usuarios) {
            if (usuario.getNombreUsuario().equals(nombreUsuario)) {
                String nuevoCorreo = JOptionPane.showInputDialog("Ingrese el nuevo correo electrónico:", usuario.getCorreo());
                usuario.setCorreo(nuevoCorreo);

                String nuevacontrasena = JOptionPane.showInputDialog("Ingrese la nueva contrasena:", usuario.getcontrasena());
                usuario.setcontrasena(nuevacontrasena);

                JOptionPane.showMessageDialog(null, "Información actualizada con éxito.");
                mostrarMenu();
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
        mostrarMenu();
    }

    public void eliminarUsuario() {
        if (usuarios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay usuarios registrados.");
        } else {
            String nombreUsuario = JOptionPane.showInputDialog("Ingrese el nombre de usuario para eliminar:");

            usuarios.removeIf(usuario -> usuario.getNombreUsuario().equals(nombreUsuario));
            JOptionPane.showMessageDialog(null, "Usuario eliminado exitosamente.");
        }
        mostrarMenu();
    }

    public void mostrarMenu() {
        String[] opciones = {"Registrar", "Iniciar Sesion", "Actualizar informacion de usuario", "Eliminar datos de usuario", "Salir"};
        int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opcion", "Menu Registro de usuarios",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

        switch (seleccion) {
            case 0:
                registrarUsuario();
                break;
            case 1:
                iniciarSesion();
                break;
            case 2:
                actualizarInformacionUsuario();
                break;
            case 3:
                eliminarUsuario();
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Saliendo...");
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida.");
                mostrarMenu();
        }
    }
}
