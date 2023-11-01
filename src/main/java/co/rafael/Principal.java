package co.rafael;
/*
 * @(#) Principal.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import static co.rafael.ArrayListExample.addData;
import static co.rafael.ArrayListExample.updateDate;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class Principal {

    public static void main(String[] args) {
        addData();
        updateDate();

        ArrayListExample metodos= new ArrayListExample();
        metodos.getData1();

    }
}
