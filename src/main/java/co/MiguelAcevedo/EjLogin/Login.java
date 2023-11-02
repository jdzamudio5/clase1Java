package co.MiguelAcevedo.EjLogin;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

import static co.MiguelAcevedo.EjLogin.Registro.getPassword;
import static co.MiguelAcevedo.EjLogin.Registro.getUser;

public class Login {

    public void validacionCredenciales(String usuario, String clave) {
        String usuarioRegistrado = getUser();
        String claveRegistrada= getPassword();

        if (Objects.equals(usuario,usuarioRegistrado) && Objects.equals(clave,claveRegistrada)){
            JOptionPane.showMessageDialog(null, "Usuario logueado");
        } else{
            JOptionPane.showMessageDialog(null, "Error en las credenciales");
        }
    }

}
