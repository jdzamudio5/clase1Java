package co.Lina.Ejercicios;

import java.util.Objects;

import static co.Lina.Ejercicios.Registro.getPssw;
import static co.Lina.Ejercicios.Registro.getUser;

public class Login {

    public void validacionCredenciales(String usuario, String clave){
        String usuarioReg=getUser();
        String claveReg= getPssw();

        if (Objects.equals(usuario,usuarioReg) && Objects.equals(clave,claveReg)) {// comparar el usuario con el usuario registrado
            System.out.println("Usuario Logueado");
            //JOptionPane.showMessageDialog(null," Usuario Logueado");
        }else {
            System.out.println("Error en las credenciales");
            //JOptionPane.showMessageDialog(null,"Error en las credenciales");
        }
    }




}
