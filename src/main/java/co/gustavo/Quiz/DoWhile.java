package co.gustavo.Quiz;

import javax.swing.*;

public class DoWhile {

    public static void main(String[] args) {

        int opcion=1;


        do {

            JOptionPane.showMessageDialog(null,"Seleccione la opcion: " + "\n" +"1. Facturacion " +"\n"+"2. soporte "+"\n"+"3. Cancelacion "+"\n"+"4. salir: ");


                if (opcion==1) {
                    System.out.println("Bienvenido a Facturacion");
                   } else if (opcion==2) {

                    System.out.println("Bienvenido a soporte");
                     } else if (opcion==3) {

                            System.out.println("Bienvenido a Cancelacion");
                        } else if (opcion==4){
                    System.out.println("Saliendo....");
                            } else {
                    System.out.println("Opcion Incorreta");
                                }


            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la Opcion: "));

        }while(opcion!=4);




















    }
}
