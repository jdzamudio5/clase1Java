package co.juandavid.ExamenBocc;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Cliente> clientes;
    public Banco(){
        this.clientes=new ArrayList<>();

    }
    public static void addData(){
       }
    public void menu_ingreso(){
        Banco banco=new Banco();
        while (true) {
            int opcion=0;
            try {
                String mensaje = "\nBienvenido al banco de occidente\n¿Qué desea hacer?\n1. Ya eres cliente\n2. Quiero ser cliente\n3. Salir\n\nSeleccione una opción:";
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Ingrese un número entero");
            }


            switch (opcion) {
                case 1:
                    //double deposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad a depositar: "));

                    //banco.ingreso();
                    //cuenta.depositar(deposito);
                    break;
                case 2:
                    //cuenta.verSaldo();
                    banco.registro();
                    break;
                case 3:
                    System.exit(0);
                    //cuenta.retirar(retiro);
                    break;
                default:
                    //JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, seleccione una opción válida.");
                    //break;
            }
        }
    }
    /*public void menu_ingreso2(){
        int opcion=0;
        while (true){
            Cuenta cuenta=new Cuenta();
            try {
                String mensaje = "\nBienvenido al banco de occidente\n¿Qué desea hacer?\n1. Depositar dinero\n2. Consultar saldo\n3. Retirar Dinero\n4. Salir\n\nSeleccione una opción:";
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Ingrese un número entero");
            }
            switch (opcion){
                case 1:
                    double deposito=0;
                    try {
                        deposito=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el valor a depositar"));
                    }catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(null,"Ingrese el valor a depositar");
                    }

                    cuenta.depositar(deposito);
                    break;
                case 2:
                    cuenta.consultarSaldo();
                    break;
                case 3:
                    double retiro=0;
                    try {
                        retiro=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el valor a retirar"));
                    }catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(null,"Ingrese el valor a retirar");
                    }
                    cuenta.retirar(retiro);
            }


        }

    }*/
    /*public void ingreso(){
        String email=JOptionPane.showInputDialog(null,"Ingrese su Email");
        String pass=JOptionPane.showInputDialog(null,"Ingrese su Password");
        boolean credencialesCorrectas = false;
        for (Cliente cliente: clientes
             ) {
            System.out.println(cliente);
            if (cliente.getEmail().equals(email) && cliente.getPass1().equals(pass)) {
                JOptionPane.showMessageDialog(null,"Bienvenido "+cliente.getNombre()+" "+cliente.getApellido());
                credencialesCorrectas = true;
                break;


            }
            
        }if (!credencialesCorrectas) {
            JOptionPane.showMessageDialog(null, "Cuenta o contraseña incorrectos");
            menu_ingreso();
        } else {
            menu_ingreso2();
        }

    }*/
    public void registro(){
        String nombre= JOptionPane.showInputDialog(null,"Digite su nombre");
        String apellido= JOptionPane.showInputDialog(null,"Digite su apellido");
        String cedula = JOptionPane.showInputDialog(null,"Digite su cédula");
        String correo= JOptionPane.showInputDialog(null,"Digite su correo");
        String password1= JOptionPane.showInputDialog(null,"Digite su clave");
        String password2= JOptionPane.showInputDialog(null,"repita su clave");


        menu_ingreso();

    }
}
