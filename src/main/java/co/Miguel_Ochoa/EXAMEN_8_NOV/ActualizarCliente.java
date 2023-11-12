package co.Miguel_Ochoa.EXAMEN_8_NOV;
/*
Este código fue realizado por: Miguel Esteban Ochoa
Inicio de creación código: 08 de Noviembre 2023
Finalización de creación código: 12 de Noviembre 2023
 */
import java.util.List;

public class ActualizarCliente {
    public static void actualizar(List<Cliente> clientes, String cedulaUsuario, String nuevoNombre, String nuevoApellido) {
        Cliente cliente = BuscarCliente.buscar(clientes, cedulaUsuario);
        if (cliente != null) {
            cliente.setNombre(nuevoNombre);
            cliente.setApellido(nuevoApellido);
        }
    }
}
