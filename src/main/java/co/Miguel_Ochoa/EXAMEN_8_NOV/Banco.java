package co.Miguel_Ochoa.EXAMEN_8_NOV;
/*
Este código fue realizado por: Miguel Esteban Ochoa
Inicio de creación código: 08 de Noviembre 2023
Finalización de creación código: 12 de Noviembre 2023
 */
import java.util.ArrayList;


import java.util.List;



public class Banco {
    private List<Cliente> clientes;
    private List<Cliente> clientesEliminados; // Lista para almacenar clientes eliminados

    public Banco() {
        this.clientes = new ArrayList<>();
        this.clientesEliminados = new ArrayList<>(); // Inicializar la lista de clientes eliminados
    }

    // Método para agregar un cliente
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    // Método para buscar un cliente por cédula
    public Cliente buscarClientePorCedula(String cedulaUsuario) {
        for (Cliente cliente : clientes) {
            if (cliente.getCedulaUsuario().equals(cedulaUsuario)) {
                return cliente;
            }
        }
        return null;
    }

    // Método para actualizar la información de un cliente
    public void actualizarCliente(Cliente cliente, String nombre, String apellido) {
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
    }

    // Método para eliminar un cliente
    public void eliminarCliente(String cedulaUsuario) {
        Cliente clienteAEliminar = buscarClientePorCedula(cedulaUsuario);
        if (clienteAEliminar != null) {
            clientesEliminados.add(clienteAEliminar); // Agregar el cliente a la lista de eliminados
            clientes.remove(clienteAEliminar); // Eliminar el cliente de la lista principal
        }
    }

    // Método para buscar una cuenta específica
    public Cuenta buscarCuentaPorNumero(String numeroCuenta) {
        for (Cliente cliente : clientes) {
            for (Cuenta cuenta : cliente.getCuentas()) {
                if (cuenta.getNumeroDeCuenta().equals(numeroCuenta)) {
                    return cuenta;
                }
            }
        }
        return null;
    }

    // Getters y setters
    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Cliente> getClientesEliminados() {
        return clientesEliminados;
    }
}





