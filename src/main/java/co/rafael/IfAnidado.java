package co.rafael;
/*
 * @(#) IfAnidado.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import javax.swing.*;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class IfAnidado {
    public static void main(String[] args) {

        float nota;

        nota= Float.parseFloat(JOptionPane.showInputDialog("Ingresar nota"));


        if(nota>=6){

            if(nota>=6 && nota<8){
                JOptionPane.showMessageDialog(null,"Gana el curso con promedio basico");
            } else if (nota>=8 && nota<9) {
                JOptionPane.showMessageDialog(null,"Gana el curso con promedio alto");
            } else if (nota>=9 && nota<=10) {
                JOptionPane.showMessageDialog(null,"Gana el curso con promedio sobresaliente");
            }else {
                JOptionPane.showMessageDialog(null,"Nota no válida");
            }

        }else {
            JOptionPane.showMessageDialog(null,"Pierde el curso");
        }


    }
}
