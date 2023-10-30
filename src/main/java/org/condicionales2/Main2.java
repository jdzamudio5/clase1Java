package org.condicionales2;

import javax.swing.*;

public class Main2 {
    public static void main(String[] args) {
        // IF Anidado!
        float nota;
        //Solicitar nota por medio de JOptionPane y como lo recibe tipo String se debe hacer el parseo a float
        nota= Float.parseFloat(JOptionPane.showInputDialog("Ingrese el usuario"));

        if (nota>=6){
            if (nota>=6 && nota<8){
                JOptionPane.showMessageDialog(null, "Gana el curso con promedio basico");
            } else if (nota>=8 && nota<9) {
                JOptionPane.showMessageDialog(null, "Gana el curso con promedio alto");
            } else if (nota>=9 && nota<=10) {
                JOptionPane.showMessageDialog(null, "Gana el curso con promedio superior");
            } else {
                JOptionPane.showMessageDialog(null, "Nota no valida");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Pierde el curso");
        }

    }
}
