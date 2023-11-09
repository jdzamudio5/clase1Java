package co.juandavid.examen3;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class PedirNombre {
    private List<Prueba> usuarios;

    public PedirNombre(){
        this.usuarios=new ArrayList<>();
    }
    public void registarNombre(){


        String nombre= JOptionPane.showInputDialog(null,"Digite su nombre");
        String apellido= JOptionPane.showInputDialog(null,"Digite su apellido");
        String cedula = JOptionPane.showInputDialog(null,"Digite su cédula");
        String correo= JOptionPane.showInputDialog(null,"Digite su correo");
        String password1= JOptionPane.showInputDialog(null,"Digite su clave");
        String password2= JOptionPane.showInputDialog(null,"repita su clave");

        Prueba prueba=new Prueba(nombre, apellido,cedula,correo,password1,password2);
        usuarios.add(prueba);
        }
    public void imprimir() {
        for (Prueba prueba: usuarios
             ) {
            JOptionPane.showMessageDialog(null,"Nombre; "+prueba.getNombre());

            }

    }
        /*JOptionPane.showMessageDialog(null, "mi nombre es :"+prueba.getNombre()+
                "\nMi apellido es "+prueba.getApellido());*/


}
