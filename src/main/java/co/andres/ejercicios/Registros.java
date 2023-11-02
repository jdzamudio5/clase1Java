package co.andres.ejercicios;

public class Registros {

    private static String user;
    private static String password;

    public static void guardarUsuario(String usuario, String clave){
        user = usuario;
        password = clave;
    }

    public Registros(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public static String getUser() {
        return user;
    }

    public static String getPassword() {
        return password;
    }
}
