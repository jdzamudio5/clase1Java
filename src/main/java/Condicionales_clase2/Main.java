package Condicionales_clase2;
import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {
        String Usuario = "Occidente";
        String Clave = "Occidente*2023";


        String UsuarioFront=JOptionPane.showInputDialog("Ingresa el Usuario: ");

        if (UsuarioFront.equals(Usuario)){
            String ClaveFront=JOptionPane.showInputDialog("Ingresa la contraseña: ");
            if (ClaveFront.equals(Clave)){
                JOptionPane.showMessageDialog(null, "Bienvenido Al Sistema");
            }else {
                JOptionPane.showMessageDialog(null, "La contraseña no Coincide");
            }
        }else {
            JOptionPane.showMessageDialog(null, "El Usuario No Existe en el Sistema");
        }
    }
}
