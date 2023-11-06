package co.oscar.loginusuario;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static co.oscar.loginusuario.Registro123.*;

public class Login123 {

    public void validacionCredenciales(String user, String pssw){

        String usuarioRegistrado = getUser();
        String claveRegistrada =getPssw();

        if (Objects.equals(user, usuarioRegistrado) && Objects.equals(pssw,claveRegistrada)){
            JOptionPane.showMessageDialog(null,"Usuario logueado");
        }else {
            JOptionPane.showMessageDialog(null,"Error en las credenciales");
        }
    }
}