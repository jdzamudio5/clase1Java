package co.Javier_Diaz.Taller2_8Nov;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Banco extends Cliente{
    private ArrayList Nombres = new ArrayList<>();
    private ArrayList Apellidos = new ArrayList<>();
    private ArrayList Numero_documento = new ArrayList<>();
    private ArrayList Usuarios = new ArrayList<>();
    private ArrayList Contrasenas = new ArrayList<>();
    private ArrayList Saldos = new ArrayList<>();
    private ArrayList Cuentas = new ArrayList<>();
    // Declarar la matriz como un ArrayList de ArrayList

    public Banco(String nombres, String apellidos, String numero_Documento, String Usuario, String Contrasena) {
        this.Nombres = new ArrayList<>();
        this.Nombres.add(nombres);

        this.Apellidos = new ArrayList<>();
        this.Apellidos.add(apellidos);

        this.Numero_documento = new ArrayList<>();
        this.Numero_documento.add(numero_Documento);

        this.Usuarios = new ArrayList<>();
        this.Usuarios.add(Usuario);

        this.Contrasenas = new ArrayList<>();
        this.Contrasenas.add(Contrasena);
    }

    public Banco() {
        super();
    }

    public void requerirDatosNuevacuenta(){
        /* Nombres.add(JOptionPane.showInputDialog("Nombres:"));
        Apellidos.add(JOptionPane.showInputDialog("Apellidos:"));
        Numero_documento.add(JOptionPane.showInputDialog("Identificacion:"));
        Usuarios.add(JOptionPane.showInputDialog("Usuario:"));
        Contrasenas.add(JOptionPane.showInputDialog("contraseña:")); */
    }

    public void mostrartodoslosdatos(){
        /* for(int i = 0; i < Nombres.size(); i++) {
            System.out.println(Nombres.get(i));
            System.out.println(Apellidos.get(i));
            System.out.println(Numero_documento.get(i));
            System.out.println(Usuarios.get(i));
            System.out.println(Contrasenas.get(i));
        }*/
    }
public void Mostrardatos(){
    for(int i = 0; i < Nombres.size(); i++) {
        System.out.println(Nombres.get(i));
    }


}


}

