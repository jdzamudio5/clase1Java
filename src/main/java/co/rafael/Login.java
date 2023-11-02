package co.rafael;
/*
 * @(#) Login.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import javax.swing.*;
import java.util.Objects;

import static co.rafael.Registro.*;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class Login {


    public void validacionCredenciales(String usuario, String clave){
        String usuarioRegistrado = getUser();
        String claveRegistrada= getPssw();

        if(Objects.equals(usuario,usuarioRegistrado) && Objects.equals(clave,claveRegistrada)){
            JOptionPane.showMessageDialog(null,"Usuario logueado");
        }else {
            JOptionPane.showMessageDialog(null,"Error en las credenciales");
        }
    }
}
