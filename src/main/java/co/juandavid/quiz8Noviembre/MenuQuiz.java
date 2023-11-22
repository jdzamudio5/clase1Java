package co.juandavid.quiz8Noviembre;


import javax.swing.*;

public class MenuQuiz {
    public MenuQuiz() {
    }

    public void menu_ingreso(){
        while (true){
            int opcion=0;
            try {
                String menuVariable="Bienvenido al banco de occidente\n" +
                        "1. Crear Usuario\n"+
                        "2. Depositar\n"+
                        "3. Retirar\n"+
                        "4. Ver el saldo\n"+
                        "5. Crear cuenta\n"+
                        "6. Validar si existe usuario\n"+
                        "7. Consultar Cuenta\n"+
                        "8. Salir\n"+
                        "Selecciona una opcion: ";
                /*String mensaje = "\n¿Qué desea hacer?\n" +
                        "1. Depositar dinero\n2. Ver saldo\n3. Retirar dinero\n4. Salir\n\nSeleccione una opción:";
                */
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,menuVariable));

            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Ingrese un número entero");

            }
            BancoQuiz bancoQuiz=new BancoQuiz();
            switch (opcion){
                case 1:
                    bancoQuiz.crearCliente();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    bancoQuiz.crearCuenta();
                    break;
                case 6:
                    bancoQuiz.buscarClientes();
                    break;
                case 7:

                    break;
                case 8:
                    break;
            }



        }



    }

}
