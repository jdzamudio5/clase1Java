package co.juandavid.quiz8Noviembre;

import co.juandavid.pooJdz.Producto;

import java.util.ArrayList;

public class ClienteQuiz extends UsuariosQuiz{
    private static ArrayList<ClienteQuiz> stockClientes =new ArrayList<ClienteQuiz>();
    private boolean existeCliente;


    public ClienteQuiz(String nombre, String apellido, String identificacion, String email, String telefono, boolean existeCliente) {
        super(nombre, apellido, identificacion, email, telefono);
        this.existeCliente = existeCliente;
    }

    public boolean isExisteCliente() {
        return existeCliente;
    }

    public void setExisteCliente(boolean existeCliente) {
        this.existeCliente = existeCliente;
    }

    public static ArrayList<ClienteQuiz> getStockClientes() {
        return stockClientes;
    }


}
