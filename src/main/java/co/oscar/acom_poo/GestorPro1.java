package co.oscar.acom_poo;

import javax.swing.*;
import java.util.ArrayList;
import static co.oscar.acom_poo.Stoc1.getstockProductos;
import static co.oscar.acom_poo.Stoc1.stockProductos;
public class GestorPro1 {
        public void GuardarProducto(){
        String nombreProducto= JOptionPane
                .showInputDialog(null,"Ingrese el nombre del producto");
        String descProducto= JOptionPane
                .showInputDialog(null,"Ingrese la desc. del producto");
        int canProducto= Integer.parseInt(JOptionPane
                .showInputDialog(null,"Ingrese la cantidad del producto"));
         //instancia de producto haciendolo manualmente
        //Producto1 producto= new Producto1("Azucar","Endulzante natural",50);
        // instancia con las variables ya definidas

        Producto1 producto= new Producto1(nombreProducto,descProducto,canProducto);

       stockProductos.add(0, producto);

        System.out.println("arry productos : "+getstockProductos().get(0).getNombreProduto()
                +" "+getstockProductos().get(0).getDescProducto());


    }

}
