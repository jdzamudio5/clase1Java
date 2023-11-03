package co.rafael.poo;
/*
 * @(#) GestionMenu.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import javax.swing.*;
import java.util.Objects;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class GestionMenu {




    public static void menu(){
        String opcion= JOptionPane.showInputDialog(null, "Ingrese la opción");
        while(Objects.equals(opcion,"guardar")){
            GestorProducto gestorProducto= new GestorProducto();
            gestorProducto.guardarProducto();
            opcion= JOptionPane.showInputDialog(null, "Ingrese la opción");



        }
    }
}
