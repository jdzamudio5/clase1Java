package co.MiguelAcevedo.ExamenCuenta;

import javax.swing.*;

public class Menu {
    public void mostrarMenu() {

        GestionCuenta gestionCuenta = new GestionCuenta();
        int opcion = 1;

        do {
            opcion=Integer.parseInt(JOptionPane.showInputDialog(
                    "MENU PRINCIPAL\n"
                            +"1. Crear Usuario\n"
                            +"2. Crear Cuenta\n"
                            +"3. Actualizar cliente\n"
                            +"4. Buscar Cliente\n"
                            +"5. Depositar Dinero\n"
                            +"6. Salir\n"
                            +"ELIJA UNA OPCION"));
            switch (opcion){
                case 1:
                    gestionCuenta.crearCliente();
                    break;
                case 2:
                    gestionCuenta.crearCuentaAh();
                    break;
                case 3:
                    gestionCuenta.actualizarInfo();
                    break;
                case 4:
                    gestionCuenta.buscarCliente();
                    break;
                case 5:
                    gestionCuenta.depositarDinero();
                    break;
                case 6:
                    opcion=6;
                    break;
                default:
                    System.out.println("opción incorrecta");
            }
        }while (opcion!=6);
        System.exit(0);
    }
}
