package co.jorge.Login;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        guardarUsuario("rchica","Occidente2023");

        Login login=new Login();
        String user= JOptionPane.showInputDialog("Ingrese el usuario");
        String clave=JOptionPane.showInputDialog("Ingrese la clave");
        login.validacionCredenciales(user,clave);


    }
}
