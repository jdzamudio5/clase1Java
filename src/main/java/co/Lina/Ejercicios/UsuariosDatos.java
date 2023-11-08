package co.Lina.Ejercicios;


import java.util.ArrayList;
import java.util.Scanner;


public class UsuariosDatos {

    static Scanner scanner = new Scanner(System.in);
    static String usuario;
    static String password;
    static ArrayList<Registro> usuarios1 = new ArrayList<>();// guardar varios usuarios
    static Login login = new Login();

    public static void main(String[] args) {
        boolean menu = true;
        while (menu) {
            System.out.println("Menu");
            System.out.println("1. Crear Usuario");
            System.out.println("2. Validar Credenciales");
            System.out.println("3. Consultar usuario");
            System.out.println("4. Actualizar Datos");
            System.out.println("5. Salir");
            System.out.println("Selecciona una opcion ");
            int opc = scanner.nextInt();
            scanner.nextLine();

            switch (opc) {
                case 1:
                    guardarUsuario();
                    break;
                case 2:
                    System.out.println("Validar Credenciales");
                    System.out.println("Ingresar usuario");
                    usuario = scanner.nextLine();
                    System.out.println("Ingresar contraseña");
                    password = scanner.nextLine();
                    login.validacionCredenciales(usuario, password);
                    break;
                case 3:
                    System.out.println("Consultar datos de un usuario");
                    System.out.println("Ingresar usuario");
                    usuario = scanner.nextLine();
                    consultar(usuario);
                    break;
                case 4:
                    boolean menu1 = true;
                    System.out.println("Selecione lo que desea actualizar");
                    System.out.println("1. Nombre del usuario");
                    System.out.println("2. Contraseña del usuario");
                    int opc1 = scanner.nextInt();
                    Registro user=buscarUsuario(usuario);
                    scanner.nextLine();
                    while(menu1) {
                        switch (opc1) {
                            case 1:
                                System.out.println("Ingresar usuario a buscar");
                                usuario = scanner.nextLine();
                                if(user!=null){
                                    System.out.println("Ingresar nuevo nombre");
                                    usuario = scanner.nextLine();
                                    Actualizacion.actualizarUsuario(usuario);
                                    System.exit(0);
                               }else{
                                    System.out.println("Ese usuario no existe");
                               }
                                break;
                            case 2:
                                System.out.println("Ingresar usuario a buscar");
                                usuario = scanner.nextLine();
                                if(user!=null){
                                    System.out.println("Ingresar  Nueva contraseña");
                                    password = scanner.nextLine();
                                    Actualizacion.actualizarPassword(usuario, password);
                                    System.exit(0);
                                }else{
                                    System.out.println("Ese usuario no existe");
                                }
                                break;
                            default:
                                System.out.println("Opcion invalida");
                                break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Cerrar programa");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }

    }


    public static void  consultar(String user2){
        Registro user=buscarUsuario(user2);
        if(user!=null){
            System.out.println("El usuario" +user2+" su contraseña es "+user.getPssw());
        }else{
            System.out.println("Ese usuario no existe");
        }
    }
    public static Registro buscarUsuario(String user1){
        for(Registro user:usuarios1){
            if(user.getUser().equals(user1)){
                return user;
            }
        }
        return null;
    }
    public static void guardarUsuario(){

        System.out.println("Ingresar usuario");
        usuario = scanner.nextLine();
        System.out.println("Ingresar contraseña");
        password = scanner.nextLine();
        Registro usuar=new Registro(usuario,password);
        usuarios1.add(usuar);

        //JOptionPane.showMessageDialog(null,"Usuario "+nombre+" registrado");
        System.out.println("Usuario "+usuario+" fue registrado");
    }


}

/*
NOta: validar los modificadores de acceso
temas de encapsulamiento
Principios solens


    public static void ingresarDatos(){


String use= JOptionPane.showInputDialog("Ingresar usuario");
String pss= JOptionPane.showInputDialog("Ingresar contraseña");

        System.out.println("Ingresar usuario");
        usuario=scanner.nextLine();

        System.out.println("Ingresar contraseña");
        password=scanner.nextLine();

        System.out.println(usuario+ " "+password);
    }


    main



        //guardarUsuario("LINA","12345");

        //Login login=new Login(); // de esta manera se realiza instancia de una clase
       // String use= JOptionPane.showInputDialog("Ingresar usuario");
        //String pss= JOptionPane.showInputDialog("Ingresar contraseña");
        //usuarios1.add(new Registro(use,pss));
        //usuarios1.add(new Registro("LINA","12345"));
 */

