package co.MiguelAcevedo.ejercicioLogin;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class GestorUsuario {
    private List<Usuario> usuarios; //ARRAY PARA GUARDAR LOS DATOS DE LOS USUARIOS

    public GestorUsuario(){
        this.usuarios=new ArrayList<>();
    }
    public void registrarUsuario() {
        //CAPTURAR VARIABLES
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del usuario.");
        int identificacionUsuario = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la identificación del usuario."));
        String correoUsuario = JOptionPane.showInputDialog(null, "Ingrese el correo del usuario.");
        String nombre_Usuario = JOptionPane.showInputDialog("Ingrese el nombre de usuario.");
        String contrasena = JOptionPane.showInputDialog(null, "Ingrese la contraseña del usuario.");

        //inicializar datos ej
        //Usuario usuario=new Usuario("miguel acevedo", 123456789, "miguel@mcv.com","miguel","miguel123");

        //ALMACENAR EN EL OBJETO
        Usuario usuario = new Usuario(nombre, identificacionUsuario, correoUsuario, nombre_Usuario, contrasena);


        //GUARDAR LOS DATOS DE LOS USUARIOS
        usuarios.add(usuario);
        JOptionPane.showMessageDialog(null, "El usuario "+usuario.getNombre()+" ha sido registrado.");
        //GestionMenu gestionMenu=new GestionMenu();
        menu();
    }
    public void menu(){
        //     String opcion= JOptionPane.showInputDialog(null,"Ingrese la opción.");
        //     while (opcion=="guardar"){
        //         GestorUsuario gestorUsuario=new GestorUsuario();
        //         gestorUsuario.registrarUsuario();
        //        opcion=JOptionPane.showInputDialog(null, "Ingrese la opción.");
        int opcion = 0;
        GestorUsuario gestorUsuario= new GestorUsuario();
        JOptionPane.showMessageDialog(null, "Seleccione la opción: \n1. Iniciar Sesión \n2. Registrar Usuario \n3. Actualizar Usuario \n4. Salir");

        do {
            JOptionPane.showMessageDialog(null, "Seleccione la opción: \n1. Iniciar Sesión \n2. Registrar Usuario \n3. Actualizar Usuario \n4. Salir");

            switch (opcion) {
                case 0:
                    System.out.println("Bienvenido al inicio de sesión.");
                    break;
                case 1:
                    gestorUsuario.registrarUsuario();
                    break;
                case 2:
                    System.out.println("Bienvenido a la actualización de usuarios.");
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                case 4:
                    System.out.println("Opción incorrecta.");
                default:
                    opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la opción: "));
            }
        } while (opcion != 4);
    }
}
