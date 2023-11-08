package co.Lina.Ejercicios;




import static co.Lina.Ejercicios.UsuariosDatos.buscarUsuario;

public class Actualizacion {


    public static void actualizarUsuario(String usuario){
        Registro registro= buscarUsuario(usuario);

        if(registro != null){
            registro.setUser(usuario);
            System.out.println("Contraseña cambiada");
        }else{
            System.out.println("Ese usuario no exite");
        }

    }

    public static void actualizarPassword(String usuario, String pssNuevo){
        Registro registro= buscarUsuario(usuario);

        if(registro != null){
            registro.setUser(usuario);
            System.out.println("Usuario cambiado");
        }else{
            System.out.println("Ese usuario no exite");
        }

    }
}
