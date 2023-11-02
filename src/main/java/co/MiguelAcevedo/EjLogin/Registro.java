package co.MiguelAcevedo.EjLogin;

public class Registro {
    public static void main(String[] args) {

    }
    private static String user;
    private static String password;

    public static void guardarUsuario (String usuario, String clave){
        user=usuario;
        password=clave;
    }

    public Registro(String user, String password) {
        this.user=user;
        this.password=password;
    }

    public static String getUser() {
        return user;
    }

    public static String getPassword() {
        return password;
    }
}
