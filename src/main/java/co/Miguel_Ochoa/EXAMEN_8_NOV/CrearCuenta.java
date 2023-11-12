package co.Miguel_Ochoa.EXAMEN_8_NOV;

/*
Este código fue realizado por: Miguel Esteban Ochoa
Inicio de creación código: 08 de Noviembre 2023
Finalización de creación código: 12 de Noviembre 2023
 */

import java.util.ArrayList;

public class CrearCuenta {

    // Método para crear una nueva cuenta
    public Cuenta crearCuenta(Cliente cliente, String tipoDeCuenta, double saldoInicial) {
        if (saldoInicial < 50000) {
            throw new IllegalArgumentException("El saldo inicial debe ser al menos de $50.000");
        }

        Cuenta nuevaCuenta;

        // Genera un número de cuenta único
        String numeroDeCuenta = GeneradorNumerosDeCuenta.getInstance().generarNumeroDeCuentaUnico();

        // Crea una cuenta de acuerdo al tipo especificado
        if (tipoDeCuenta.equalsIgnoreCase("Ahorro")) {
            nuevaCuenta = new CuentaAhorro(numeroDeCuenta, saldoInicial);
        } else if (tipoDeCuenta.equalsIgnoreCase("Corriente")) {
            nuevaCuenta = new CuentaCorriente(numeroDeCuenta, saldoInicial);
        } else {
            throw new IllegalArgumentException("Tipo de cuenta desconocido");
        }

        // Añade la cuenta al cliente
        if (cliente.getCuentas() == null) {
            cliente.setCuentas(new ArrayList<>());
        }
        cliente.getCuentas().add(nuevaCuenta);

        return nuevaCuenta;
    }
}

