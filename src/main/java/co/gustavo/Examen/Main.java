package co.gustavo.Examen;

public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.mostrarMenu();


    }
}



/*
        Persona persona1 = new Persona("Juan","NIT", 80736817, 25);
        Usuario usuario = new Usuario("Juan", "NIT", 102522152, 32,7432545,"Juan@gmail.com");

// Creacion de Cliente
        Cliente cliente = new Cliente("María", "CC", 1001546546, 21,1,80755655);

 // Crear una cuenta bancaria
        Cuenta cuenta = new Cuenta("12345", 1000.0, cliente);


 // Mostrar información de la cuenta
        System.out.println("Información de la cuenta:");
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("Saldo actual: " + cuenta.getSaldo());
        System.out.println("Titular de la cuenta: " + cuenta.getTitular().getNombre());

// Realizar operaciones de depósito y retiro
        cuenta.depositar(500.0);
        cuenta.retirar(200.0);


// Crear un banco
       Banco banco = new Banco("Occidente");

        // Crear cuentas y agregar al banco
        Cliente cliente1 = new Cliente("María", "CC", 1001546546, 21,1,80755655);
       Usuario cliente2 = new Usuario("Juan", "NIT", 102522152, 32,7432545,"Juan@gmail.com");

        Cuenta cuenta1 = new Cuenta("001", 50001.0, cliente1);
        //Cuenta cuenta2 = new Cuenta("002", 2000.0, cliente2);

        Banco.abrirCuenta(cuenta1);
        //Banco.abrirCuenta(cuenta2);

        // Listar cuentas
        Banco.mostrarCuentas();

        // Buscar una cuenta
        Cuenta cuentaEncontrada = Banco.buscarCuenta("001");
        if (cuentaEncontrada != null) {
            System.out.println("Cuenta encontrada - Saldo: " + cuentaEncontrada.getSaldo());
        }


        Banco.deposito(10000, cliente1);
        //Banco.retiro(5000, titular);
*/
