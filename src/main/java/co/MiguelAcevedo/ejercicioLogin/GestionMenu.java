package co.MiguelAcevedo.ejercicioLogin;

import javax.swing.*;

public class GestionMenu {
    public void menu(){
   //     String opcion= JOptionPane.showInputDialog(null,"Ingrese la opción.");
   //     while (opcion=="guardar"){
   //         GestorUsuario gestorUsuario=new GestorUsuario();
   //         gestorUsuario.registrarUsuario();
   //        opcion=JOptionPane.showInputDialog(null, "Ingrese la opción.");
        int opcion = 1;
        GestorUsuario gestorUsuario= new GestorUsuario();

        do {
            JOptionPane.showMessageDialog(null, "Seleccione la opción: \n1. Iniciar Sesión \n2. Registrar Usuario \n3. Actualizar Usuario \n4. Salir");

            if (opcion == 1) {
                System.out.println("Bienvenido al inicio de sesión.");
            } else if (opcion == 2) {
                gestorUsuario.registrarUsuario();
            } else if (opcion == 3) {
                System.out.println("Bienvenido a la actualización de usuarios.");
            } else if (opcion == 4) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción incorrecta.");
            }
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la opción: "));
        } while (opcion!=4);


        }
    }

