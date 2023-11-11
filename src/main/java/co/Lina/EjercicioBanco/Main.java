package co.Lina.EjercicioBanco;

import java.util.Scanner;

public class Main {
    static Banco banco= new Banco(10);
    static Scanner scanner = new Scanner(System.in);
    static String nombre, apellido;
    static int identificador,numeroCuenta;
    static double saldo;
    static Cliente cliente;
    static Persona usuario;

    public static void main(String[] args) {
        menu();
    }

    public static void menu(){

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Crear Usuario");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Ver el saldo");
            System.out.println("5. Consultar datos");
            System.out.println("6. Validar si existe usuario");
            System.out.println("7. Consultar Cuenta");
            System.out.println("8. Salir");
            System.out.println("Selecciona una opcion: ");
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
                   consultarDatos();
                    break;
                case 6:
                    validarsiExiste();
                    break;
                case 7:
                    System.out.print("Digite su nmero de identificacion: ");
                    identificador= scanner.nextInt();
                    conocerCuenta(identificador);
                    break;
                case 8:
                    System.out.print("Cerrar programa");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    }

    public static void crearCuenta() {

        System.out.print("Digite su nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Digite su apellido: ");
        apellido = scanner.nextLine();
        System.out.print("Digite su nmero de identificacion: ");
        identificador = scanner.nextInt();
        System.out.print("Saldo Inicial: ");
        saldo = scanner.nextInt();

        usuario = new Persona(nombre, apellido, identificador);

            if (saldo>=50000) {
                cliente=new Cliente(nombre, apellido, identificador);
                banco.crearCuenta(cliente, saldo);
           } else {
                System.out.println("Valor del saldo es menor a 50000, no se puede crear la cuenta");
                System.exit(0);
            }

    }

    public static void validarsiExiste(){
        System.out.print("Digite su nmero de identificacion: ");
        int ident=scanner.nextInt();

        if(usuario.exitePersona(ident)){
            System.out.println("Existe Usuario");
        }else{
            System.out.println("No existe usuario");
        }

    }

    public static void realizarDeposito (){
        System.out.print("Numero de cuenta a depositar: ");
        numeroCuenta=scanner.nextInt();
        Cuenta cuentaDepo=banco.saldoCuenta(numeroCuenta);

        if (cuentaDepo!=null) {
            System.out.print("Cantidad a depositar: ");
            saldo=scanner.nextDouble();
            cuentaDepo.depositarenCuenta(saldo);
            System.out.println("Deposiro realizado");
        }else{
            System.out.println("Cuenta invalida");
        }
    }

    public static void realizarRetiro(){
        System.out.print("Numero de cuenta a realizar retito: ");
        numeroCuenta=scanner.nextInt();
        Cuenta cuentaRet=banco.saldoCuenta(numeroCuenta);

        if (cuentaRet!=null) {
            System.out.print("Cantidad a Retirar: ");
            saldo=scanner.nextDouble();
            cuentaRet.retirarenCuenta(saldo);
            System.out.println("Retiro realizado");
        }else{
            System.out.println("Cuenta invalida");
        }
    }

    public static void consultarSaldo(){
        System.out.print("Numero de cuenta a consultar saldo: ");
        numeroCuenta=scanner.nextInt();
        Cuenta saldoCue=banco.saldoCuenta(numeroCuenta);
        if(saldoCue!=null){
            System.out.println("Saldo en cuenta :" +saldoCue.getSaldoCuenta());
        }else{
            System.out.println("Cuenta invalida");
        }
    }

    public static void consultarDatos(){
        System.out.print("Digite su nmero de identificacion: ");
        int ident=scanner.nextInt();

        usuario.mostrarDatos(ident);
        conocerCuenta(ident);
    }

    public static void conocerCuenta(int identificador){

        numeroCuenta = banco.conocernumCuenta(identificador);
        if (numeroCuenta != -1) {
            System.out.println("Numero de cuenta: " + numeroCuenta);
        } else {
            System.out.println("No existe usuario");
        }

    }
}
