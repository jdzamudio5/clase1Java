package co.juandavid.examenBocc;

public class Cliente extends Usuario {


    private int idCliente,numCuenta;
    private String cuenta;

    //Constructor


    public Cliente(String nombre, String apellido, int numDoc,
                   int telefono, String email, int idCliente, int numCuenta, String cuenta) {
        super(nombre, apellido, numDoc, telefono, email);
        this.idCliente = idCliente;
        this.numCuenta = numCuenta;
        this.cuenta = cuenta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
}
