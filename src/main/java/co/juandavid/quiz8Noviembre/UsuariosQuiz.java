package co.juandavid.quiz8Noviembre;

public class UsuariosQuiz extends PersonaQuiz{
    private String email;
    private String telefono;

    public UsuariosQuiz(String nombre, String apellido, String identificacion, String email, String telefono) {
        super(nombre, apellido, identificacion);
        this.email = email;
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
