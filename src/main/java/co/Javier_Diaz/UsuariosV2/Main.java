package co.Javier_Diaz.UsuariosV2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> usuarios = new ArrayList<>();
        List<String> contrasenas = new ArrayList<>();

        int opcion;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Actualizar contraseña");
            System.out.println("4. Borrar usuario");
            System.out.println("5. Listar usuarios");
            System.out.println("0. Salir");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después de nextInt()

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre de usuario: ");
                    String nombreUsuario = scanner.nextLine();
                    System.out.print("Ingrese la contraseña: ");
                    String contrasena = scanner.nextLine();
                    RegistrarUsuario.ejecutar(usuarios, contrasenas, nombreUsuario, contrasena);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre de usuario para iniciar sesión: ");
                    nombreUsuario = scanner.nextLine();
                    System.out.print("Ingrese la contraseña: ");
                    contrasena = scanner.nextLine();
                    LoginUsuario.ejecutar(usuarios, contrasenas, nombreUsuario, contrasena);
                    break;
                case 3:
                    System.out.print("Ingrese el nombre de usuario para actualizar la contraseña: ");
                    nombreUsuario = scanner.nextLine();
                    System.out.print("Ingrese la nueva contraseña: ");
                    String nuevaContrasena = scanner.nextLine();
                    ActualizarUsuario.ejecutar(usuarios, contrasenas, nombreUsuario, nuevaContrasena);
                    break;
                case 4:
                    System.out.print("Ingrese el nombre de usuario para borrar: ");
                    nombreUsuario = scanner.nextLine();
                    BorrarUsuario.ejecutar(usuarios, contrasenas, nombreUsuario);
                    break;
                case 5:
                    ListarUsuarios.ejecutar(usuarios);
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 0);
    }
}
