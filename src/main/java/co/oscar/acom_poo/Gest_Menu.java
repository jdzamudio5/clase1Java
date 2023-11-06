package co.oscar.acom_poo;

import javax.swing.*;
import java.util.Objects;

public class Gest_Menu {

    public static void menu(){
        String opcion= JOptionPane.showInputDialog(null,"Ingrese la opcion");
        while(Objects.equals(opcion, "guardar")){
            GestorPro1 gestorPro1=new GestorPro1();
            gestorPro1.GuardarProducto();
            opcion= JOptionPane.showInputDialog(null,"Ingrese la opcion");

        }
    }


}
