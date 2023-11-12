package co.Miguel_Ochoa.EXAMEN_8_NOV;
/*
Este código fue realizado por: Miguel Esteban Ochoa
Inicio de creación código: 08 de Noviembre 2023
Finalización de creación código: 12 de Noviembre 2023
 */
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class GeneradorNumerosDeCuenta {
    private static GeneradorNumerosDeCuenta instance = new GeneradorNumerosDeCuenta();
    private Set<String> numerosGenerados;
    private Random random;

    private GeneradorNumerosDeCuenta() {
        numerosGenerados = new HashSet<>();
        random = new Random();
    }

    public static GeneradorNumerosDeCuenta getInstance() {
        return instance;
    }

    public String generarNumeroDeCuentaUnico() {
        String numero;
        do {
            numero = generarNumeroAleatorio();
        } while (numerosGenerados.contains(numero)); // Verifica si el número ya ha sido generado

        numerosGenerados.add(numero); // Añade el número nuevo al conjunto de números generados
        return numero;
    }


    private String generarNumeroAleatorio() {
        long numeroAleatorio = (long) (Math.random() * 100000000000L); // Genera un número largo aleatorio entre 0 y 99999999999, emulando un numero de cuenta de 11 digitos
        return Long.toString(numeroAleatorio);
    }


}

