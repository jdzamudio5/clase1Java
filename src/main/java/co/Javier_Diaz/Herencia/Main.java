package co.Javier_Diaz.Herencia;

public class Main {
    public static void main(String[] args) {
        Automovil auto = new Automovil("Toyota", 2020, 4);
        Motocicleta moto = new Motocicleta("Honda", 2022, true);

        System.out.println("Información del automóvil:");
        auto.mostrarInformacion();

        System.out.println("\nInformación de la motocicleta:");
        moto.mostrarInformacion();
    }
}
