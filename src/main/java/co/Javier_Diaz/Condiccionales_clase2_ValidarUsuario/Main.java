<<<<<<<< HEAD:src/main/java/co/Alejandra/Condicionales_clase2/Main.java
package co.Alejandra.Condicionales_clase2;
import javax.swing.JOptionPane;
import java.util.Objects;
public class Main {
========
package co.Javier_Diaz.Condiccionales_clase2_ValidarUsuario;
>>>>>>>> f480100fe0edb5075d1b7a2286e90bbbc21ff376:src/main/java/co/Javier_Diaz/Condiccionales_clase2_ValidarUsuario/Main.java

import javax.swing.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        String usuarioCorrecto = "Occidente";
        String claveCorrecta = "Occidente*2023";

        String usuarioFront = JOptionPane.showInputDialog("Ingresa el Usuario: ");

        if (Objects.equals(usuarioFront, usuarioCorrecto)) {
            String claveFront = JOptionPane.showInputDialog("Ingresa la contraseña: ");
            if (Objects.equals(claveFront, claveCorrecta)) {
                JOptionPane.showMessageDialog(null, "Bienvenido Al Sistema");
            } else {
                JOptionPane.showMessageDialog(null, "La contraseña no Coincide");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El Usuario No Existe en el Sistema");
        }
    }
}
