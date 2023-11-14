package co.juandavid.ExamenBocc;

public class Cliente extends Personas {
    private String email;

    public Cliente(String nombre, String apellido, String identicacion, String email) {
        super(nombre, apellido, identicacion);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
