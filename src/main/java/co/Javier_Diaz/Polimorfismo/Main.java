package co.Javier_Diaz.Polimorfismo;

public class Main {
    // Método que acepta objetos de tipo Transporte y llama al método viajar()
    public static void realizarViaje(Transporte medioTransporte) {
        medioTransporte.viajar();
    }

    public static void main(String[] args) {
        // Crear instancias de Automovil y Motocicleta
        Automovil auto = new Automovil("Toyota");
        Motocicleta moto = new Motocicleta("Honda");

        // Llamar al método viajar() a través del polimorfismo
        realizarViaje(auto);
        realizarViaje(moto);
    }
}
