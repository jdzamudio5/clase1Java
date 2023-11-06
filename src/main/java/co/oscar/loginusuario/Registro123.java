package co.oscar.loginusuario;

public class Registro123 {
    private static String user;
    private static String pssw;

    public static void guardarusuario(String usuario, String clave) {
        user=usuario;
        pssw=clave;

    }
    //constructor
    public Registro123(String user, String pssw) {
        this.user=user; //this solo se usa en el contructores
        this.pssw=pssw;

    }

    //metodo encapsulamiento

    public static String getUser() {
        return user;
    }

    public static String getPssw() {
        return pssw;
    }
}
