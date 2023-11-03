package co.gustavo.LogIn;

import javax.swing.*;
import java.util.ArrayList;

import static co.gustavo.LogIn.LogIn.verificarCredenciales;

public class Registro {

    boolean continuar = true;
    private static String user;
    private static String pssw;
    static ArrayList<String[]> usuarios = new ArrayList<>();



    public static void capturarUsuario(){

        String[] usuario = new String[2];
        user= JOptionPane.showInputDialog("Ingrese el Nombre de Usuario: \n" );
        pssw= JOptionPane.showInputDialog("Ingrese la contrasena de Usuario: \n" );

        usuario[0]=user;
        usuario[1]=pssw;
        usuarios.add(usuario);
        JOptionPane.showMessageDialog(null, "El usuario ha sido registrado");

    }// Fin


    public static void listadoUsuarios(){

        for (int i = 0; i < usuarios.size(); i++) {
            String[] usuarioPassw = usuarios.get(i);
            String username = usuarioPassw[0];
            String password = usuarioPassw[1];
            System.out.println("Usuario: " + username + ", Contraseña: " + password);
        }


    }// Fin


    public static void consulta(){


        String user= JOptionPane.showInputDialog("Ingrese el usuario");
        String clave= JOptionPane.showInputDialog("Ingrese la Clave");

        if (verificarCredenciales(usuarios, user, clave)) {
            JOptionPane.showMessageDialog(null, "Inicio de sesion exitoso usuario " + user + ".");

        } else {
            JOptionPane.showMessageDialog(null, "Nombre de usuario o contrasena incorrectos.");

        }

    }// Fin




    public static void guardarUsuario(String usuario, String clave){

        user=usuario;
        pssw=clave;

    }// Fin guardarUsuario

    public Registro(String user, String pssw){

            this.user=user;
            this.pssw=pssw;

    }//fin constructor


    public static String getUser(){
        return user;
    }

    public static String getPssw(){
        return  pssw;
    }


}
