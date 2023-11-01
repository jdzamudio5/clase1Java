package co.juandavid.whilejdz;

import javax.swing.*;

public class DoWhile {
    public static void main(String[] args) {
        int menu=1;

        do {
            menu=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion"));
            if (menu==1){
                System.out.println("Bienvenido a facturación");
            } else if (menu==2) {
                System.out.println("Bienvenido a cancelación");
            } else if (menu==3) {
                System.out.println("Bienvenido a soporte");
            }else {
                System.out.println("Hasta luego");
            }
        }
        while (menu!=4);
    }
}
