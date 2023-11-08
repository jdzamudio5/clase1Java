package Examen;

public class Cliente extends Persona {
    int numeroCliente;
    boolean cliente;
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

    public boolean isCliente() {
        return cliente;
    }
    //aqui van los setter

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public void setCliente(boolean cliente) {
        this.cliente = cliente;
    }
}
