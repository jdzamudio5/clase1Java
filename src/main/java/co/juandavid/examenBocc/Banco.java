package co.juandavid.examenBocc;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Cliente> clientes;
    public Banco(){
        this.clientes=new ArrayList<>();

    }
    public static void addData(){
       }

    public void registro(){
        String nombre= JOptionPane.showInputDialog(null,"Digite su nombre");
        String apellido= JOptionPane.showInputDialog(null,"Digite su apellido");
        String cedula = JOptionPane.showInputDialog(null,"Digite su cédula");
        String correo= JOptionPane.showInputDialog(null,"Digite su correo");
        String password1= JOptionPane.showInputDialog(null,"Digite su clave");



        //menu_ingreso();

    }
    public void soyCliente(){
        String cedula = JOptionPane.showInputDialog(null,"Digite su cédula");

    }
}
