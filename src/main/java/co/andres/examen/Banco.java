package co.andres.examen;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Cliente> clientes;
    private ArrayList<Cuenta> cuentas;

    public Banco(){
        this.clientes = new ArrayList<>();
        this.cuentas = new ArrayList<>();
    }

    public void agregarClientes(Cliente cliente){
        this.clientes.add(cliente);
    }

    public void agregarCuenta(Cuenta cuenta){
        this.cuentas.add(cuenta);
    }

    public Cliente buscarCliente(int identificacion) {
        for (Cliente cliente : this.clientes) {
            if (cliente.getIdentificacion() == identificacion) {
                return cliente;
            }
        }
        return null;
    }

    public Cuenta buscarCuenta(int numeroCuenta){
        for(Cuenta cuenta : this.cuentas){
            if(cuenta.getNumeroCuenta() == numeroCuenta){
                return cuenta;
            }
        }
        return null;
    }
    public void actualizarInformacionCliente(Cliente cliente, String nuevoNombre, String nuevoApellido) {
        cliente.setNombre(nuevoNombre);
        cliente.setApellido(nuevoApellido);
    }

    public void cerrarCuenta(int numeroCuenta) {
        Cuenta cuenta = buscarCuenta(numeroCuenta);
        if (cuenta != null) {
            this.cuentas.remove(cuenta);
        }
    }
}
