package co.Lina.CuentaBanco;

import co.Lina.Ejercicios.Actualizacion;
import co.Lina.Ejercicios.Registro;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Registro> cuentas = new ArrayList<>();

    public static void main(String[] args) {

        Cliente clie1= new Cliente("Maria","Gomez",12345,01,202301);

        boolean menu = true;
        while (menu) {
            System.out.println("Menu");
            System.out.println("1. Crear Usuario");
            System.out.println("2. Salir");
            System.out.println("Selecciona una opcion ");
            int opc = scanner.nextInt();
            scanner.nextLine();
            switch (opc) {
                case 1:

                    break;
                case 2:
                    System.out.println("Cerrar programa");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }

    }
}
