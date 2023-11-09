package co.juandavid.examen3;

public class Prueba {
    private String nombre,apellido,correo,password1,password2, cedula;

    public Prueba(String nombre, String apellido, String cedula, String correo, String password1, String password2) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.password1 = password1;
        this.password2 = password2;
        this.cedula=cedula;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}
