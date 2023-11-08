package co.Alejandra.EjercicioLogin;

import javax.swing.*;
import java.util.ArrayList;

import static co.Alejandra.EjercicioLogin.Registro.*;

public class Main {

    static ArrayList<String> Usuarios= new ArrayList<>();

    public static void main(String[] args) {

        int Menu =0;
        do {
            switch (Menu){
                case 0:
                    System.out.println("Bienvenido");
                    break;
                case 1:
                    System.out.println("Sign In");

                    break;
                case 2:
                    System.out.println("Log In");
                    saveUser("jafranco","bdo");
                    //String usuario = getUser();
                    //Login login=new Login();

                    //login.solicitarUser();
                    //login.validacionCredenciales();
                    break;
                case 3:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
            Menu = Integer.parseInt(JOptionPane.showInputDialog("Menu: \n1: Sign In \n2: Log In \n3: Salir \nIngresa la opcion"));

        }while (Menu!=3);

    }
}
