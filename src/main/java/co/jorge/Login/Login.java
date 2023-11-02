package co.jorge.Login;

import javax.swing.*;
import java.util.Objects;

public class Login {
    public void validacionCredenciales(String usuario, String clave){
        String usuarioRegistrado = getUser();
        String claveRegistrada= getPssw();

        if(Objects.equals(usuario,usuarioRegistrado) && Objects.equals(clave,claveRegistrada)){
            JOptionPane.showMessageDialog(null,"Usuario logueado");
        }else {
            JOptionPane.showMessageDialog(null,"Error en las credenciales");
        }
    }
}
