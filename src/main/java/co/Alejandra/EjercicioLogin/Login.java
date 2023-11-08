package co.Alejandra.EjercicioLogin;

import javax.swing.*;
import java.util.Objects;

import static co.Alejandra.EjercicioLogin.Registro.*;

public class Login {

    private static String user;
    private static String passw;

    //Constructor
    public Login (String user, String passw) {
        this.user=user;
        this.passw=passw;
    }

    public static String getUser() {
        return user;
    }
    public static String getPassw() {
        return passw;
    }

    public String solicitarUser(String user, String pass){

        String usuario= JOptionPane.showInputDialog("Ingrese el usuario");
        String clave=JOptionPane.showInputDialog("Ingrese la clave");

        return user;
    }

    public void validacionCredenciales(String usuario, String clave){

        String usuarioRegistrado = getUser();
        String claveRegistrado = getPassw();

        if (Objects.equals(usuario, usuarioRegistrado) && Objects.equals(clave,claveRegistrado)){
            JOptionPane.showMessageDialog(null, "Usuario logueado");
        } else {
            JOptionPane.showMessageDialog(null, "Error en las credenciales");
        }
    }






}
