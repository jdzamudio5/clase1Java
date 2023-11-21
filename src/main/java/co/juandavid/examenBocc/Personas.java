package co.juandavid.examenBocc;

public class Personas {

    private String nombre;
    private String apellido;
    private int numDoc;


    // Constructor


    public Personas(String nombre, String apellido, int numDoc) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numDoc = numDoc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(int numDoc) {
        this.numDoc = numDoc;
    }
}