package co.Lina.CuentaBanco;

import co.Lina.Ejercicios.Registro;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario extends Persona{
    static ArrayList<Cliente> clientes = new ArrayList<>();

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, int numero_Identificacion) {
        super(nombre, apellido, numero_Identificacion);
    }

    public void crearCliente(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar usuario");
        String nombre = scanner.nextLine();
        System.out.println("Ingresar apellido");
        String apellido = scanner.nextLine();
        System.out.println("Ingresar # identificación");
        int identidicacion = scanner.nextInt();

        Cliente clin1= new Cliente(nombre,apellido,identidicacion,1,202301);
        clientes.add(clin1);


    }
}

