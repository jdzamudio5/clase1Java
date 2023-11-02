package co.Javier_Diaz.Usuarios;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean salir = false;

        while (!salir) {
            System.out.println("1. Registro");
            System.out.println("2. Login");
            System.out.println("3. Actulizar");
            System.out.println("4. Borrar");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea después de nextInt

            switch (opcion) {
                case 1:
                    registrarUsuario();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    actualizarUsuario();
                    break;
                case 4:
                    borrarUsuario();
                    break;
                case 5:
                    salir = true;
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }

    private static void registrarUsuario() {
        System.out.print("Ingrese un nombre de usuario: ");
        String nombre = scanner.nextLine();

        if (existeUsuario(nombre)) {
            System.out.println("El nombre de usuario ya existe. Inténtelo con otro.");
            return;
        }

        System.out.print("Ingrese una contrasena: ");
        String contrasena = scanner.nextLine();

        Usuario nuevoUsuario = new Usuario(nombre, contrasena);
        usuarios.add(nuevoUsuario);

        System.out.println("Usuario registrado exitosamente.");
    }

    private static void login() {
        System.out.print("Ingrese su nombre de usuario: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su contrasena: ");
        String contrasena = scanner.nextLine();

        if (validarCredenciales(nombre, contrasena)) {
            System.out.println("Inicio de sesión exitoso. ¡Bienvenido!");
        } else {
            System.out.println("Nombre de usuario o contrasena incorrectos. Inténtelo de nuevo.");
        }
    }

    private static boolean existeUsuario(String nombre) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    private static boolean validarCredenciales(String nombre, String contrasena) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombre) && usuario.getContrasena().equals(contrasena)) {
                return true;
            }
        }
        return false;
    }
    private static void actualizarUsuario() {
        System.out.print("Ingrese su nombre de usuario: ");
        String nombre = scanner.nextLine();

        if (!existeUsuario(nombre)) {
            System.out.println("El nombre de usuario no existe. No se puede actualizar.");
            return;
        }

        // Encuentra el usuario en la lista
        Usuario usuario = obtenerUsuarioPorNombre(nombre);

        System.out.println("Seleccione el campo que desea actualizar:");
        System.out.println("1. Contrasena");
        System.out.print("Ingrese su opción: ");

        int opcion = scanner.nextInt();
        scanner.nextLine();  // Consumir el salto de línea después de nextInt

        switch (opcion) {
            case 1:
                System.out.print("Ingrese la nueva contrasena: ");
                String nuevaContrasena = scanner.nextLine();
                usuario.setContrasena(nuevaContrasena);
                System.out.println("Contrasena actualizada correctamente.");
                break;
            default:
                System.out.println("Opción no válida. No se realizó ninguna actualización.");
        }
    }

    // Método adicional para obtener un usuario por nombre
    private static Usuario obtenerUsuarioPorNombre(String nombre) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombre)) {
                return usuario;
            }
        }
        return null; // Devuelve null si no se encuentra el usuario
    }
    private static void borrarUsuario() {
        System.out.print("Ingrese el nombre de usuario que desea eliminar: ");
        String nombre = scanner.nextLine();
        BorrarUsuario.eliminarUsuario(nombre);
    }
}