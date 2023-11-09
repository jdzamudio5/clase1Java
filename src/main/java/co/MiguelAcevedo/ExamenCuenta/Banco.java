package co.MiguelAcevedo.ExamenCuenta;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Banco {

    private ArrayList<Cliente> clientes;
    private ArrayList<Cuenta> cuentas;
    //Cliente cliente = new Cliente();

    public Banco(){
        clientes = new ArrayList<>();
        cuentas = new ArrayList<>();
    }
    public void crearCliente(Cliente cliente){
        clientes.add(cliente);
        //JOptionPane.showMessageDialog(null, "El usuario "+cliente.getNombre()+" ha sido registrado.");
    }

    public Cliente buscarCliente(int identificacionUsuario){
        for (Cliente cliente : clientes){
            if (cliente.getIdentificacionUsuario()==identificacionUsuario){
                return cliente;
            }
        }return null;
    }
    public void crearCuenta(Cliente cliente){
        Cuenta cuenta = new Cuenta(cliente);
        cuentas.add(cuenta);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
}
