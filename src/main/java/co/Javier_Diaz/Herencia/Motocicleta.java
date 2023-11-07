package co.Javier_Diaz.Herencia;

// Subclase 2
public class Motocicleta extends Vehiculo {
    boolean tieneSidecar;

    public Motocicleta(String marca, int ano, boolean tieneSidecar) {
        super(marca, ano);
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("¿Tiene sidecar? " + (tieneSidecar ? "Sí" : "No"));
    }
}
