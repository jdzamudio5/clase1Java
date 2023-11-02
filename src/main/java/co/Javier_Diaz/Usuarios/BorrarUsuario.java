package co.Javier_Diaz.Usuarios;

import java.util.ArrayList;

public class BorrarUsuario {
    private static ArrayList<Usuario> usuarios;

    public static void setUsuarios(ArrayList<Usuario> usuarios) {
        BorrarUsuario.usuarios = usuarios;
    }

    public static void eliminarUsuario(String nombre) {
        Usuario usuarioAEliminar = obtenerUsuarioPorNombre(nombre);

        if (usuarioAEliminar != null) {
            usuarios.remove(usuarioAEliminar);
            System.out.println("Usuario eliminado correctamente.");
        } else {
            System.out.println("El usuario no existe. No se puede eliminar.");
        }
    }

    private static Usuario obtenerUsuarioPorNombre(String nombre) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombre)) {
                return usuario;
            }
        }
        return null;
    }
}
