package Examen2BO;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
public class Banco {
    List<Cliente> clientes = new ArrayList<>();
    List<Administrador> administradores = new ArrayList<>();

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
        JOptionPane.showMessageDialog(null, "Cuenta creada con éxito");
    }



    public Cliente buscarClientePorIdentificacion(String identificacion) {
        for (Cliente cliente : clientes) {
            if (cliente.identificacion.equals(identificacion)) {


                return cliente;
            }
        }
        return null;
    }
}
