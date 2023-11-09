package co.juandavid.ExamenBocc;

public class Cliente {
    private String nombre, apellido, id, email, pass1, pass2;

    public Cliente(String nombre, String apellido, String id, String email, String pass1, String pass2) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.email = email;
        this.pass1 = pass1;
        this.pass2 = pass2;
    }

    public Cliente() {

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass1() {
        return pass1;
    }

    public void setPass1(String pass1) {
        this.pass1 = pass1;
    }

    public String getPass2() {
        return pass2;
    }

    public void setPass2(String pass2) {
        this.pass2 = pass2;
    }
}
