<<<<<<<< HEAD:src/main/java/co/Alejandra/condicionales2/Main.java
package co.Alejandra.condicionales2;
========
package co.Javier_Diaz.orgJavierDiaz.condicionales2;
>>>>>>>> f480100fe0edb5075d1b7a2286e90bbbc21ff376:src/main/java/co/Javier_Diaz/orgJavierDiaz/condicionales2/Main.java
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String user; //Occidente
        String password; //Occidente*2023

        user= JOptionPane.showInputDialog("Ingrese el usuario");
        password= JOptionPane.showInputDialog("Ingrese su clave");

        if (user.equals("Occidente") && password.equals("Occidente*2023")){
            JOptionPane.showMessageDialog(null, "Usuario logueado");
        } else if ((user != "Occidente" && password.equals("Occidente*2023"))
                || (user.equals("Occidente") &&  password != "Occidente*2023")
                || (user != "Occidente" && password != "Occidente*2023")) {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecto");
        }

    }
}
