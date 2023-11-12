package co.Miguel_Ochoa.EXAMEN_8_NOV;
/*
Este código fue realizado por: Miguel Esteban Ochoa
Inicio de creación código: 08 de Noviembre 2023
Finalización de creación código: 12 de Noviembre 2023
 */
import java.util.List;
public class BuscarCliente {
    public static Cliente buscar(List<Cliente> clientes, String cedulaUsuario) {
        for (Cliente cliente : clientes) {
            if (cliente.getCedulaUsuario().equals(cedulaUsuario)) {
                return cliente;
            }
        }
        return null;
    }
}
