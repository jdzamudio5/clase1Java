package Examen2BO;
import javax.swing.JOptionPane;

import java.util.List;
public class Administrador extends Persona{
    public Administrador(String nombre, String identificacion) {
        super(nombre, "", identificacion);
    }



    public void listarClientes(List<Cliente> clientes) {

        StringBuilder listaClientes = new StringBuilder();


        for (Cliente cliente : clientes) {
            listaClientes.append("Nombre: " + cliente.nombre + ", Identificación: " + cliente.identificacion + "\n");
        }
        JOptionPane.showMessageDialog(null, "Clientes existentes:\n" + listaClientes.toString());
    }






public void modificarCliente(Cliente cliente, double nuevoSaldo) {
        cliente.saldo = nuevoSaldo;
        JOptionPane.showMessageDialog(null, "Información del cliente actualizada. Nuevo saldo: " + cliente.saldo);
        }
}
