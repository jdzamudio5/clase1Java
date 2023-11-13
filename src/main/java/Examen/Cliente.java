package Examen;

public class Cliente extends Persona {
    int numeroCliente;
    public static void realizarTransaccion(){}
    public static void actualizarCliente(){}
    public static void guardarDinero(){}
    public int getNumeroCliente() {return numeroCliente;}
    public void setNumeroCliente(int numeroCliente) {this.numeroCliente = numeroCliente;}
    //Constructores

    public Cliente(String nombre, String apellido, byte edad, char genero, String direccion, boolean cliente, int numeroCliente) {
        super(nombre, apellido, edad, genero, direccion, cliente);
        this.numeroCliente = numeroCliente;
    }
}