package org.co.MiguelAcevedo.condicionalespt2;

import javax.swing.*;

public class IfAnidado {
    public static void main(String[] args) {
        float nota;

        nota= Float.parseFloat(JOptionPane.showInputDialog("Ingresar nota"));

        if(nota>=6){
            if (nota>=6 && nota<8)
            JOptionPane.showMessageDialog(null, "Gana el curso con promedio básico.");
        } else if (nota>=8 && nota <9) {
            JOptionPane.showMessageDialog(null, "Gana el curso con promedio alto.");
        } else if (nota>=9 && nota <=10) {
            JOptionPane.showMessageDialog(null, "Gana el curso con promedio sobresaliente.");
        }
        else {
            JOptionPane.showMessageDialog(null, "Pierde el curso.");
        }
    }
}
