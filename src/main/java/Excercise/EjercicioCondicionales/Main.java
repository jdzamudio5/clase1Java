package Excercise.EjercicioCondicionales;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String usuario,clave;

        usuario= JOptionPane.showInputDialog("Introduce el nombre de usuario");



        if(usuario.equals("Occidente")){
            clave= JOptionPane.showInputDialog("Introduce la clave");

            if(clave.equals("Occidente*2023")){
                JOptionPane.showMessageDialog(null, "Bienvenido, te has logueado.");

            }else{
                JOptionPane.showMessageDialog(null, "Clave Incorrecta");}

        } else {
            JOptionPane.showMessageDialog(null, "El nombre de usuario no existe");;}


for (int i=0; i <=10; i++){
     System.out.println(": "+(7*i));
}





    }



}
