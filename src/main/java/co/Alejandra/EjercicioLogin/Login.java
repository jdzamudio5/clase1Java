package co.Alejandra.EjercicioLogin;

import javax.swing.*;
import java.util.Objects;

import static co.Alejandra.EjercicioLogin.Registro.*;

public class Login {

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
