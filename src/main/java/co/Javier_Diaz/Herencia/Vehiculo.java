package co.Javier_Diaz.Herencia;

public class Vehiculo {
    String marca;
    int ano;

    public Vehiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca + ", Ano: " + ano);
    }
}