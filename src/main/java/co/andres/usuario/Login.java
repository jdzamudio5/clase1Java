package co.andres.usuario;

import javax.swing.*;
import java.util.Objects;
import static co.andres.usuario.Registros.*;

public class Login {

    public void validacionCredenciales(String user, String clave) {
        String usuarioRegistrado = getUser();
        String claveRegistrada= getPassword();

        if(Objects.equals(user,usuarioRegistrado) && Objects.equals(clave,claveRegistrada)){
            JOptionPane.showMessageDialog(null,"Usuario logueado");
        }else {
            JOptionPane.showMessageDialog(null,"Error en las credenciales");
        }
    }
}
