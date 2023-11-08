package co.gustavo.Examen;

import java.util.ArrayList;

public class Banco {

    private static String nombre;
    private static ArrayList<Cuenta> cuentas;

    public Banco(String nombre) {
        this.nombre = nombre;
        this.cuentas = new ArrayList<>();
    }





    public static void abrirCuenta(Cuenta cuenta) {
        if (cuenta.getSaldo() >= 50000) {
            cuentas.add(cuenta);
            System.out.println("Se abrió una nueva cuenta en " + nombre + " con número: " + cuenta.getNumeroCuenta());
        } else {
            System.out.println("El saldo inicial minimo 50,000 para abrir la cuenta en " + nombre);
        }
    }

    public static void listarCuentas() {
        System.out.println("Cuentas en el banco " + nombre + ":");
        for (Cuenta cuenta : cuentas) {
            System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta() + " - Saldo: " + cuenta.getSaldo());
        }
    }

    public static Cuenta buscarCuenta(String numeroCuenta) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumeroCuenta().equals(numeroCuenta)) {
                return cuenta;
            }
        }
        System.out.println("Cuenta no encontrada.");
        return null;
    }


}
