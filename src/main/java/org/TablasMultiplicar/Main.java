package org.TablasMultiplicar;
public class Main {
    public static void main(String[] args) {
        int i=0;
        int [] numeros = {1,2,3,4,5,6,7,8,9};
        System.out.println("Estas son las tablas de multiplicar");
        for(i=0; i<numeros.length; i++){
            System.out.println("Tabla del:" + i);
            for(int j=0; j<=10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }
}
