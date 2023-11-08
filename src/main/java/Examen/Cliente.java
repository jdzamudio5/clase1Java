package Examen;

public class Cliente extends Persona {
    int numeroCliente;
    public static void realizarTransaccion(){
    }
    public static void actualizarCliente(){
    }
    public static void guardarDinero(){
    }
    //aqui van los getter
    public int getNumeroCliente() {
        return numeroCliente;
    }
    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public Cliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }
}
