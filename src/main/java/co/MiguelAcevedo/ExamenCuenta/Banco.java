package co.MiguelAcevedo.ExamenCuenta;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Cliente> clientes;
    private ArrayList<Cuenta> cuentas;

    public Banco(){
        clientes = new ArrayList<>();
        cuentas = new ArrayList<>();
    }
    public void crearCliente(Cliente cliente){
        clientes.add(cliente);
    }
    public void crearCuenta(Cliente cliente){
        Cuenta cuenta = new Cuenta(cliente);
        cuentas.add(cuenta);
    }
    public Cliente buscarCliente(int identificacionUsuario){
        for (Cliente cliente : clientes){
            if (cliente.getIdentificacionUsuario()==identificacionUsuario){
                return cliente;
            }
        }return null;
    }
    public Cuenta buscarCuentas(int numCuenta){
        for (Cuenta cuenta : cuentas){
            if (cuenta.getNumCuenta()==numCuenta){
                return cuenta;
            }
        }return null;
    }
}
