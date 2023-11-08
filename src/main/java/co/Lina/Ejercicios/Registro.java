package co.Lina.Ejercicios;

public class Registro {

    static String user;
    static String pssw;


    public Registro(String user, String ppsw){
        this.user=user;
        this.pssw=ppsw;
    }


    public static String getUser(){
        return user;
    }
     public static String getPssw(){
        return pssw;
     }
    public static void setPssw(String nuevaPssw) {
        pssw = nuevaPssw;
    }

    public static void setUser(String nuevaUser) {
        user = nuevaUser;
    }


}


