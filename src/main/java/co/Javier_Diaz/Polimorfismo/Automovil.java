package co.Javier_Diaz.Polimorfismo;

public class Automovil implements Transporte {
    String marca;

    public Automovil(String marca) {
        this.marca = marca;
    }

    @Override
    public void viajar() {
        System.out.println("Viajando en automóvil " + marca);
    }
}