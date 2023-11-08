package co.gustavo.Examen;

public class Cliente extends Persona {


    private int idCliente,numCuenta;
    private String cuenta;

    //Constructor

    public Cliente(String nombre,String tipoDoc,int numDoc, int edad, int idCliente, int numCuenta) {
        super(nombre,tipoDoc,numDoc,edad);
        this.idCliente = idCliente;
        this.numCuenta = numCuenta;
    }


    // get y set

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


    // metodos



}
