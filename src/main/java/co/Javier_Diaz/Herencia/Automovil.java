package co.Javier_Diaz.Herencia;

public class Automovil extends Vehiculo {
    int puertas;

    public Automovil(String marca, int ano, int puertas) {
        super(marca, ano);
        this.puertas = puertas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de puertas: " + puertas);
    }
}