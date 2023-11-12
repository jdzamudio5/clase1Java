package co.Miguel_Ochoa.EXAMEN_8_NOV;

import java.util.List;

public class EliminarCliente {
    public static void eliminar(List<Cliente> clientes, String cedulaUsuario) {
        clientes.removeIf(cliente -> cliente.getCedulaUsuario().equals(cedulaUsuario));
    }
}
