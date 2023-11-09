package co.Lina.EjercicioBanco;

import co.Lina.Ejercicios.Registro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Banco banco= new Banco(10);
    static Scanner scanner = new Scanner(System.in);
    static String nombre, apellido;
    static int identificador,productos=1,numeroCuenta,cantidad;
    static double saldo;
    static Cliente cliente;
    static Cuenta[] cuentas;


    public static void main(String[] args) {

        //crearCuenta();
        //consultarDatos();
        //Persona usuario = new Persona("Lina","Garzon",1010);
        //usuario.mostrarDatos(1010);
        //consultarDatos();

        menu();
    }

    public static void menu(){

        boolean menu = true;
        while (menu) {
            System.out.println("Menu");
            System.out.println("1. Crear Usuario");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Ver el saldo");
            System.out.println("5. Consultar datos");
            System.out.println("6. Salir");
            System.out.println("Selecciona una opcion ");
            int opc = scanner.nextInt();
            scanner.nextLine();
            switch (opc) {
                case 1:
                    crearCuenta();
                    break;
                case 2:
                    realizarDeposito();
                    break;
                case 3:
                    realizarRetiro();
                    break;
                case 4:
                    consultarSaldo();
                    break;
                case 5:
                    System.out.println("Programa en mantenimiento");
                   // consultarDatos();
                    break;
                case 6:
                    System.out.println("Cerrar programa");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    }

    public static void crearCuenta(){

        System.out.println("DiGite su nombre:");
        nombre=scanner.nextLine();
        System.out.println("Digite su apellido: ");
        apellido=scanner.nextLine();
        System.out.println("Digite su nmero de identificacion: ");
        identificador=scanner.nextInt();
        System.out.println("Saldo Inicial: ");
        saldo=scanner.nextInt();

        Persona usuario=new Persona(nombre,apellido,identificador);

        if(banco.exiteCliente(usuario,identificador)){
            System.out.println("Este usuario ya existe");
            System.exit(0);
        }else{
            if(saldo>=50000){
                cliente= new Cliente(nombre,apellido,identificador);
                banco.crearCuenta(identificador,saldo);
            }else{
                System.out.println("Valor del saldo es menor a 50000, no se puede crear la cuenta");
                System.exit(0);
            }
        }
    }

    public static void realizarDeposito (){
        System.out.println("Numero de cuenta a depositar");
        numeroCuenta=scanner.nextInt();
        Cuenta cuentaDepo=banco.obtenerNumeroCuenta(numeroCuenta);

        if (cuentaDepo!=null) {
            System.out.println("Cantidad a depositar:");
            saldo=scanner.nextDouble();
            cuentaDepo.depositarenCuenta(saldo);
            System.out.println("Deposiro realizado");
        }else{
            System.out.println("Cuenta invalida");
        }
    }

    public static void realizarRetiro(){
        System.out.println("Numero de cuenta a realizar retito");
        numeroCuenta=scanner.nextInt();
        Cuenta cuentaRet=banco.obtenerNumeroCuenta(numeroCuenta);

        if (cuentaRet!=null) {
            System.out.println("Cantidad a Retirar:");
            saldo=scanner.nextDouble();
            cuentaRet.depositarenCuenta(saldo);
            System.out.println("Retiro realizado");
        }else{
            System.out.println("Cuenta invalida");
        }
    }

    public static void consultarSaldo(){
        System.out.println("Numero de cuenta a consultar saldo");
        numeroCuenta=scanner.nextInt();
        Cuenta saldoCuenta=banco.obtenerNumeroCuenta(numeroCuenta);
        if(saldoCuenta!=null){
            System.out.println("Saldo en cuenta :" +saldoCuenta.getSaldoCuenta());
        }else{
            System.out.println("Cuenta invalida");
        }
    }

    public static void consultarDatos(){
        System.out.println("Digite su nmero de identificacion: ");
        int ident=scanner.nextInt();

        Cuenta consultar=banco.buscarCliente(ident);
        if(consultar!=null){
            Persona usuario=consultar.getUsuario();
            System.out.println("Nombre "+usuario.getNombre());
        }else {
            System.out.println("Cliente no exite");
        }

        //Persona usuario = new Persona();
        //usuario.mostrarDatos(identificador);
    }
}
