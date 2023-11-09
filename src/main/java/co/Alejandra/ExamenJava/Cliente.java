package co.Alejandra.ExamenJava;

import javax.swing.*;
import java.util.ArrayList;

public class Cliente {

    public static ArrayList<Usuarios> Clientes=new ArrayList<>();

    public void solicitarDatos(){

        String nombreCliente = JOptionPane.
                    showInputDialog(null, "Ingrese el nombre del cliente:");
        String apellidoCliente = JOptionPane.
                    showInputDialog(null, "Ingrese el apellido del cliene:");
        int identificacionCliente = Integer.parseInt(JOptionPane.
                    showInputDialog(null, "Ingrese la identidicación del cliente:"));

        Usuarios cliente = new Usuarios(nombreCliente, apellidoCliente, identificacionCliente);


        if (Clientes.isEmpty()) {
                Clientes.add(0, cliente);
                JOptionPane.showMessageDialog(null, "Usuario guardado:" + getClientes().get(0).getNombreUsuario());
        } else {
            for (int i = 0; i < Clientes.size(); i++) {
                if (getClientes().get(i).getIdentificacionUsuario() == identificacionCliente) {
                    JOptionPane.showMessageDialog(null, "El cliente ya existe:");
                    break;
                } else {
                    Clientes.add(i, cliente);
                    JOptionPane.showMessageDialog(null, "Usuario guardado:" + getClientes().get(i).getNombreUsuario());
                    break;
                }
            }
        }
    }

    public static ArrayList<Usuarios> getClientes(){
        return Clientes;
    }

    public void actualizarDatos(){
        int identificacionCliente = Integer.parseInt(JOptionPane.
                showInputDialog(null, "Ingrese la identidicación del cliente:"));
        for (int i = 0; i < Clientes.size(); i++) {
            if (getClientes().get(i).getIdentificacionUsuario() == identificacionCliente) {
                String nuevoNombre = JOptionPane.
                        showInputDialog(null, "Ingrese el nombre del cliente:");
                String nuevoApellido = JOptionPane.
                        showInputDialog(null, "Ingrese el apellido del cliene:");

                Usuarios cliente = new Usuarios(nuevoNombre, nuevoApellido, identificacionCliente);

                Clientes.set(i,cliente);
                JOptionPane.showMessageDialog(null, "Cliente actualizado: \nId: " +
                        getClientes().get(i).getIdentificacionUsuario()+" \nNombre: "+
                        getClientes().get(i).getNombreUsuario()+" \nApellido: "+
                        getClientes().get(i).getApellidoUsuario());
                break;
            }
        }

    }
}
