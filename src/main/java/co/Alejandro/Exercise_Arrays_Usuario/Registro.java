package co.Alejandro.Exercise_Arrays_Usuario;

public class Registro {

    private static String user;
    private static String pssw;

    public static void guardarUsuario(String usuario, String clave){
        user=usuario;
        pssw=clave;

    }

    public Registro(String user, String pssw) {
        this.user=user;
        this.pssw=pssw;
    }

    public static String getUser() {
        return user;
    }

    public static String getPssw() {
        return pssw;
    }


}
