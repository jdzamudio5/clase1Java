package co.juandavid.pooJdz;

import javax.swing.*;

public class GestionMenu {


     public void menu(){
         String opcion= JOptionPane.showInputDialog(null,"Ingrese la opción");
         while (opcion.equals("guardar")){
             GestorProducto gestorProducto=new GestorProducto();
             gestorProducto.guardarProducto();
             opcion= JOptionPane.showInputDialog(null,"Ingrese la opción");
         }

     }
}
