package co.gustavo.LogIn;

import javax.swing.*;
import java.util.Objects;

import static co.gustavo.LogIn.Registro.*;
public class LogIn {

    public void validacionCredenciales(String usuario, String clave){

        String usuarioRegistrado = getUser();
        String claveRegistrada = getPssw();

        if(Objects.equals(usuario,usuarioRegistrado) && Objects.equals(clave,claveRegistrada)){
            JOptionPane.showMessageDialog(null,"Usuario logueado");
        }else {
            JOptionPane.showMessageDialog(null, "Error en las credenciales");
        }




    }

}
