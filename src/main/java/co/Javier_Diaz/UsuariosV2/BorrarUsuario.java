package co.Javier_Diaz.UsuariosV2;
import java.util.List;
public class BorrarUsuario {
    public static void ejecutar(List<String> usuarios, List<String> contrasenas, String nombre) {
        int indice = usuarios.indexOf(nombre);
        if (indice != -1) {
            usuarios.remove(indice);
            contrasenas.remove(indice);
            System.out.println("Usuario eliminado con éxito.");
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }
}
