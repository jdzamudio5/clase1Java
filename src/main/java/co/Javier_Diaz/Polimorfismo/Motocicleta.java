package co.Javier_Diaz.Polimorfismo;

// Otra clase que implementa la interfaz
public class Motocicleta implements Transporte {
    String marca;

    public Motocicleta(String marca) {
        this.marca = marca;
    }

    @Override
    public void viajar() {
        System.out.println("Viajando en motocicleta " + marca);
    }
}
