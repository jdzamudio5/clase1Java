package co.juandavid.logueoJDZ;

import java.util.ArrayList;

public class Registro {
    private static String user,pass;

    public static void guardarUsuario(String usuario, String clave){
        user=usuario;
        pass=clave;
    }

    public Registro(String user, String pass){
        this.user=user;
        this.pass=pass;
    }
    public static String getUser() {
        return user;
    }

    public static String getPass() {
        return pass;
    }
}
