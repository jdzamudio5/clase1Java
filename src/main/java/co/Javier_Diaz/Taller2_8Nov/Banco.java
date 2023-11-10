package co.Javier_Diaz.Taller2_8Nov;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Banco{
    private ArrayList<Cliente> Datos = new ArrayList<>();

    public Banco() {
    }
    public Banco(ArrayList<Cliente> datos) {
        Datos = datos;
    }

    public void requerirDatosNuevacuenta(){
        int tempCuenta= (int) Math.random()+999;
        double tempsaldo=50000;
        String Nombres=(JOptionPane.showInputDialog("Nombres:"));
        String Apellidos=(JOptionPane.showInputDialog("Apellidos:"));
        String Numero_documento=(JOptionPane.showInputDialog("Identificacion:"));
        String Usuarios=(JOptionPane.showInputDialog("Usuario:"));
        String Contrasenas=(JOptionPane.showInputDialog("contraseña:"));

        Cuenta cuenta = new Cuenta(tempCuenta,tempsaldo);
        Cliente cliente = new Cliente(Nombres,Apellidos,Numero_documento,cuenta,Usuarios,Contrasenas);
        Datos.add(cliente);
    }

    public void verClientes(){
        for (int i=0;i<Datos.size();i++){
            System.out.println(Datos.get(i).getCuenta().getNumero_Cuenta());
        }
    }
}

