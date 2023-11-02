package co.rafael;
/*
 * @(#) Registro.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
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
