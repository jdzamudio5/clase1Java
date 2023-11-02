package co.Alejandra.EjercicioLogin;

public class Registro {
    private static String user;
    private static String passw;

    //Metodo para guardar usuario
    public static void saveUser (String usuario, String clave){ //void se utiliza cuando no retorna nada
        user=usuario;
        passw=clave;
    }

    //En el Constructor se inicailizan las variables y se usa el this para inicializarlas
    //El Constructor se llama igual que la clase
    public Registro(String user, String passw) {
        this.user=user;
        this.passw=passw;
    }

    //Es un getter -> hace referencia a que va a obtener algo
    public static String getUser() {
        return user;
    }

    //Es un getter -> hace referencia a que va a obtener algo
    public static String getPassw() {
        return passw;
    }

    //Los setter hacen referencia a que van a  enviar algo
}
