package org.TABLAS_MULTIPLICAR;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        // Solicitar al usuario que seleccione una tabla de multiplicar
        String input = JOptionPane.showInputDialog("Ingrese un número para ver su tabla de multiplicar:");

        try {
            int numero = Integer.parseInt(input);

            // Validar que el número sea válido
            if (numero >= 1 && numero <= 10) {
                // Mostrar la tabla de multiplicar para el número seleccionado
                JOptionPane.showMessageDialog(null, generarTablaDeMultiplicar(numero));
            } else {
                JOptionPane.showMessageDialog(null, "Número fuera de rango. Debe estar entre 1 y 10.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada no válida. Debe ingresar un número.");
        }
    }

    public static String generarTablaDeMultiplicar(int numero) {
        StringBuilder tabla = new StringBuilder();
        tabla.append("Tabla de multiplicar del " + numero + ":\n");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            tabla.append(numero + " x " + i + " = " + resultado + "\n");
        }

        return tabla.toString();
    }
}
