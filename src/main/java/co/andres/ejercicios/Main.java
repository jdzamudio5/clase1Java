package co.andres.ejercicios;

import javax.swing.*;

import static co.andres.ejercicios.Registros.*;

public class Main {
    public static void main(String[] args) {

        guardarUsuario("afrodriguezu" , "Occidente2023");

        Login login=new Login();
        String user = JOptionPane.showInputDialog("Ingrese el Usuario");
        String clave = JOptionPane.showInputDialog("Ingrese la clave");
        login.validacionCredenciales(user,clave);

    }
}
