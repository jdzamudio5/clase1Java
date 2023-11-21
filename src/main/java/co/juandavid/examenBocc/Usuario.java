package co.juandavid.examenBocc;

public class Usuario extends Personas{


    private int telefono ;
    private String email;


    public Usuario(String nombre, String apellido, int numDoc, int telefono, String email) {
        super(nombre, apellido, numDoc);
        this.telefono = telefono;
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

