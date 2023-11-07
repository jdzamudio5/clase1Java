package co.Javier_Diaz.UsuariosV2;
import java.util.List;
public class ActualizarUsuario {
    public static void ejecutar(List<String> usuarios, List<String> contrasenas, String nombre, String nuevaContrasena) {
        int indice = usuarios.indexOf(nombre);
        if (indice != -1) {
            contrasenas.set(indice, nuevaContrasena);
            System.out.println("Contrasena actualizada con éxito.");
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }
}