package co.Javier_Diaz.UsuariosV2;
import java.util.List;
public class LoginUsuario {
    public static void ejecutar(List<String> usuarios, List<String> contrasenas, String nombre, String contrasena) {
        int indice = usuarios.indexOf(nombre);
        if (indice != -1 && contrasenas.get(indice).equals(contrasena)) {
            System.out.println("Inicio de sesión exitoso.");
        } else {
            System.out.println("Nombre de usuario o contrasena incorrectos.");
        }
    }
}