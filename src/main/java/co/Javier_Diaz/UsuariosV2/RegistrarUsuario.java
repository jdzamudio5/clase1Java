package co.Javier_Diaz.UsuariosV2;
import java.util.List;
public class RegistrarUsuario {
    public static void ejecutar(List<String> usuarios, List<String> contrasenas, String nombre, String contrasena) {
        usuarios.add(nombre);
        contrasenas.add(contrasena);
        System.out.println("Usuario registrado con éxito.");
    }
}
