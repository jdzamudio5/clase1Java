package co.Javier_Diaz.UsuariosV2;
import java.util.List;
public class ListarUsuarios {
    public static void ejecutar(List<String> usuarios) {
        System.out.println("Lista de usuarios:");
        for (String usuario : usuarios) {
            System.out.println(usuario);
        }
    }
}
