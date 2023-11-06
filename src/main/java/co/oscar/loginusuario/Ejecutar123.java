package co.oscar.loginusuario;

import javax.swing.*;

import static co.oscar.loginusuario.Registro123.guardarusuario;

public class Ejecutar123 {

    public static void main(String[] args) {

        guardarusuario("Oscar","Occidente");

        Login123 login=new Login123();
        String user= JOptionPane.showInputDialog("Ingrese el usuario");
        String clave=JOptionPane.showInputDialog("Ingrese la clave");
        login.validacionCredenciales(user,clave);

    }
}
