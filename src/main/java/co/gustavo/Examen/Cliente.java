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

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

}
