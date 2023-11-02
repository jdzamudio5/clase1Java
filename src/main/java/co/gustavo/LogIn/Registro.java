package co.gustavo.LogIn;

import java.util.ArrayList;

public class Registro {


    private static String user;
    private static String pssw;

    static int opcion=0;
    static String usuario;
    static ArrayList<String> usuarios = new ArrayList<>();
   /* public static void registro() {


        JOptionPane.showMessageDialog(null,"Por favor elija una opcion "+"\n"+"1. Crear usuario"+"\n"+"2. Ingresar al sistema");
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la Opcion: "));


        if (opcion==1) {

            usuarios.add();
        } else if (opcion==2) {

            System.out.println("Bienvenido a soporte");
        } else if (opcion==3) {

            System.out.println("Bienvenido a Cancelacion");
        }

    } // fin registro
*/

    public static void guardarUsuario(String usuario, String clave){

        user=usuario;
        pssw=clave;

    }// Fin guardarUsuario

    public Registro(String user, String pssw){

            this.user=user;
            this.pssw=pssw;

    }//fin constructor


    public static String getUser(){
        return user;
    }

    public static String getPssw(){
        return  pssw;
    }


}
