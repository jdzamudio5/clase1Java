package co.Miguel_Ochoa.MENU;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int opcion;
        String menu = "Menu de opciones:\n" +
                "1. Facturacion\n" +
                "2. Soporte\n" +
                "3. Cancelacion\n" +
                "4. Salir";

        do {
            // Mostrar el menú y pedir al usuario que ingrese una opción
            String input = JOptionPane.showInputDialog(null, menu, "Menú Principal", JOptionPane.PLAIN_MESSAGE);
            // Asegurarse de que el usuario no ha presionado cancelar
            if (input == null) {
                break;
            }

            // Parsear la entrada del usuario a un entero
            opcion = Integer.parseInt(input);

            // Procesar la entrada del usuario
            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Bienvenido a facturacion");
                    // Lógica para la opción 1
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Bienvenido a soporte");
                    // Lógica para la opción 2
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Bienvenido a cancelacion");
                    // Lógica para la opción 3
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Por favor intente nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (opcion != 4);
    }
}
