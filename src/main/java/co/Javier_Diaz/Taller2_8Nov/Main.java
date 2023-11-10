package co.Javier_Diaz.Taller2_8Nov;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco();

        int Menu=0;
           do {
               // Mostrar un cuadro de diálogo con opciones_Menu
               Object[] opciones_Menu = {"Salir","Registrar Cliente", "Deposito", "Retiro","Ver Clientes"};
               Menu = JOptionPane.showOptionDialog(null, "Menua el estado:", "Botonera con Switch",
                       JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones_Menu, opciones_Menu[0]);

               // Procesar la selección utilizando un switch
               switch (Menu) {
                   case 0:
                       JOptionPane.showMessageDialog(null, "Saliendo....");
                       break;
                   case 1:
                       registrarUsuario();
                       break;
                   case 2:
                       JOptionPane.showMessageDialog(null, "Deposito");
                       break;
                   case 3:
                       JOptionPane.showMessageDialog(null, "Retiro");
                       break;
                   case 4:
                      /* banco.mostrartodoslosdatos();*/
                       banco.Mostrardatos();
                       break;

                   default:
                       // Este caso se ejecuta si se cierra la ventana sin Menuar ninguna opción
                       JOptionPane.showMessageDialog(null, "Operación cancelada");
               }
           }while  (Menu!=0);
        }

    public static void registrarUsuario(){

        String nombreReg = JOptionPane.showInputDialog("Nombres:");
        String apellidosReg = JOptionPane.showInputDialog("Apellidos:");
        String identificacionReg = JOptionPane.showInputDialog("Identificación:");
        String usuarioReg = JOptionPane.showInputDialog("Usuario:");
        String contrasenaReg = JOptionPane.showInputDialog("Contraseña:");

        Banco registroPersona = new Banco(nombreReg, apellidosReg, identificacionReg, usuarioReg, contrasenaReg);
    }
}