package co.Alejandra.EjercicioLogin;

import javax.swing.*;
import java.util.ArrayList;

import static co.Alejandra.EjercicioLogin.Registro.*;

public class Main {

    public static void main(String[] args) {
        saveUser("jafranco","bdo");
        //String usuario = getUser();

        Login login=new Login();
        String user= JOptionPane.showInputDialog("Ingrese el usuario");
        String clave=JOptionPane.showInputDialog("Ingrese la clave");
        login.validacionCredenciales(user,clave);
    }
}
