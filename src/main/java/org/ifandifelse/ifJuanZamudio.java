package org.ifandifelse;

import javax.swing.*;

public class ifJuanZamudio {
    //Mayor o Menor: Compara dos números e imprime el mayor.
    public static void main(String[] args) {
        int num1, num2;

        while (true){
            try{
                num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese un número"));
                break;
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
            }
        }

        while (true){
            try{
                num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese un número"));
                break;
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
            }
        }

        if (num1 > num2) {
            JOptionPane.showMessageDialog(null,"El primer número ingresado "+num1+" es mayor que "+num2);
        } else if (num1 < num2) {
            JOptionPane.showMessageDialog(null, "El segundo número ingresado " + num2 + " es mayor que " + num1);
        }else {
            JOptionPane.showMessageDialog(null, "los números son iguales");
        };
    }
}
