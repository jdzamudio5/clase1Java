package co.juandavid.logueoJDZ;

import javax.swing.*;
import java.util.Objects;

import static co.juandavid.logueoJDZ.Registro.*;

public class Login {
    public void validacionCredenciales(String usuario, String clave){
        String usuarioRegistrado=getUser();
        String claveRegistrada=getPass();
        if (Objects.equals(usuario,usuarioRegistrado) && Objects.equals(clave,claveRegistrada)){
            JOptionPane.showMessageDialog(null,"Usuario logueado");
        }else {
            JOptionPane.showMessageDialog(null,"Usuario o contraseña invalido");
        }
    }
}
