package co.rafael;
/*
 * @(#) Main.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import javax.swing.*;

import static co.rafael.Registro.*;


/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class Main {
    public static void main(String[] args) {

        guardarUsuario("rchica","Occidente2023");

        Login login=new Login();
        String user=JOptionPane.showInputDialog("Ingrese el usuario");
        String clave=JOptionPane.showInputDialog("Ingrese la clave");
        login.validacionCredenciales(user,clave);


    }
}
