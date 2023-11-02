package co.juandavid.logueoJDZ;

import javax.swing.*;
import java.awt.*;

import static co.juandavid.logueoJDZ.Registro.*;

public class Main {
    public static void main(String[] args) {
        guardarUsuario("jzamudio","Colombia6*");

        Login login=new Login();
        String user= JOptionPane.showInputDialog(null,"ingrese su usuario");
        String clave= JOptionPane.showInputDialog(null,"ingrese su contraseña");
        login.validacionCredenciales(user,clave);

    }
}
