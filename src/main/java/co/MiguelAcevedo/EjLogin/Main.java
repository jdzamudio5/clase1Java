package co.MiguelAcevedo.EjLogin;

import javax.swing.*;

import static co.MiguelAcevedo.EjLogin.Registro.getUser;
import static co.MiguelAcevedo.EjLogin.Registro.guardarUsuario;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        guardarUsuario("macevedo","12345");
        String usuario = getUser();

        Login login=new Login(); //ESTANCIA DE LA CLASE
        String user= JOptionPane.showInputDialog("Ingrese el usuario");
        String clave= JOptionPane.showInputDialog("Ingrese la clave");
        login.validacionCredenciales(user,clave);
    }
}