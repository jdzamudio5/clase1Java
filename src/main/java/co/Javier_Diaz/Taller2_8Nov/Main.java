package co.Javier_Diaz.Taller2_8Nov;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        int opcion;
        do {
            String[] opciones = {"Salir", "Cliente", "Depositar", "Retirar", "Ver todos los clientes"};
            opcion = JOptionPane.showOptionDialog(
                    null,
                    "Selecciona una opcion:",
                    "Menu Banco de Occidente",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);

            switch (opcion) {
                case 1:
                    String[] opciones_Cliente = {"Crear","Actulizar","Eliminar Cliente","Eliminar Cuenta","Ver"};
                    int opcion_Cliente = JOptionPane.showOptionDialog(
                            null,
                            "Selecciona una opcion:",
                            "Menu Banco de Occidente",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            opciones_Cliente,
                            opciones_Cliente[0]);

                    switch (opcion_Cliente){
                        case 0:
                            banco.requerirDatosNuevacuenta();
                            break;
                        case 1:
                            banco.ActulizarCliente();
                            break;
                        case 2:
                            banco.ElimiarCliente();
                            break;
                        case 3:
                            banco.ElimiarCuenta();
                            break;
                        case 4:
                            banco.verClientes();
                            break;
                    }
                    break;
                case 2:
                    banco.Deposito();
                    break;
                case 3:
                    banco.Retiro();
                    break;
                case 4:
                    banco.verClientes();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        } while (opcion != 0); // La opción 0 es Salir
        }
}