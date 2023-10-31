package org.tablas;
import javax.swing.JOptionPane;
public class tablasMult {
    public static void main(String[] args) {
        /*
    int tablas[];
    tablas=new int[12];
    int resultado;

    for(int i = 1;i<=tablas.length;i++ ){
        System.out.println("Tabla del "+ i +":");
        for(int j =1;j<= tablas.length;j++){
            resultado = i*j;
            System.out.println(i + "X" + j + "=" + resultado );
        }

    }
    */
        mostrarTablasDeMultiplicar();

    }
    public static void mostrarTablasDeMultiplicar() {
        StringBuilder tablaMultiplicar = new StringBuilder();

        for (int i = 1; i <= 12; i++) {
            tablaMultiplicar.append("Tabla de multiplicar del ").append(i).append(":\n");
            for (int j = 1; j <= 10; j++) {
                tablaMultiplicar.append(i).append(" x ").append(j).append(" = ").append(i * j).append("\n");
            }

            JOptionPane.showMessageDialog(null, tablaMultiplicar.toString(), "Tabla de Multiplicar del " + i, JOptionPane.INFORMATION_MESSAGE);
            tablaMultiplicar.setLength(0); // Reiniciar el StringBuilder
        }
    }
}
