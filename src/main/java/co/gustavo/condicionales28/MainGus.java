package co.gustavo.condicionales28;
import javax.swing.*;

public class MainGus {
    public static void main(String[] args) {

        String user; //Occidente
        String password; //Occidente*2023

        user= JOptionPane.showInputDialog("Ingrese el usuario");
        password= JOptionPane.showInputDialog("Ingrese su clave");

        if (user.equals("Occidente") && password.equals("Occidente*2023")){
            System.out.println("Usuario logueado");
        } else if ((user != "Occidente" && password.equals("Occidente*2023"))
                || (user.equals("Occidente") &&  password != "Occidente*2023")
                || (user != "Occidente" && password != "Occidente*2023")) {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecto");
        }

    }
}
