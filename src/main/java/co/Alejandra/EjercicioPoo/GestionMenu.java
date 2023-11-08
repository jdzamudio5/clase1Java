package co.Alejandra.EjercicioPoo;

import javax.swing.*;
import java.util.Objects;

public class GestionMenu {


    public static void menu(){
        String opcion = JOptionPane.showInputDialog(null, "Ingrese la Opcion:");

        while (Objects.equals(opcion,"guardar")){
            GestorProducto gestorProducto= new GestorProducto();
            gestorProducto.guardarProducto();

            opcion = JOptionPane.showInputDialog(null, "Ingrese la Opcion:");

        }
    }
}
