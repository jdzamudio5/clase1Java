package co.Miguel_Ochoa.EXAMEN_8_NOV;
/*
Este código fue realizado por: Miguel Esteban Ochoa
Inicio de creación código: 08 de Noviembre 2023
Finalización de creación código: 12 de Noviembre 2023
 */
import java.util.List;
import javax.swing.JOptionPane;

public class ConsultarClientesEliminados {


    public static void mostrarClientesEliminados(List<Cliente> clientesEliminados) {
        if (clientesEliminados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay clientes eliminados.");
            return;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Clientes Eliminados:\n");
        for (Cliente cliente : clientesEliminados) {
            sb.append("Nombre: ").append(cliente.getNombre())
                    .append(", Apellido: ").append(cliente.getApellido())
                    .append(", Cédula: ").append(cliente.getCedulaUsuario())
                    .append("\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString());
    }
}

