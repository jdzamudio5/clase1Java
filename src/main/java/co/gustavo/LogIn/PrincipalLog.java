package co.gustavo.LogIn;

import javax.swing.*;

import static co.gustavo.LogIn.Registro.*;

/*import static co.gustavo.LogIn.LogIn.registro;*/

public class PrincipalLog {

    public static void main(String[] args) {

        //registro();
        guardarUsuario("gjimenez","Occidente2023*");
        String usuario=getUser();

        LogIn login=new LogIn();
        String user= JOptionPane.showInputDialog("Ingrese el usuario");
        String clave= JOptionPane.showInputDialog("Ingrese la Clave");
        login.validacionCredenciales(user,clave);


    }

}
