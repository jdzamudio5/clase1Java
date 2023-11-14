package co.juandavid.ExamenBocc;

public class Personas {
    private String nombre, apellido, identicacion;

    public Personas(String nombre, String apellido, String identicacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identicacion = identicacion;
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

    public String getIdenticacion() {
        return identicacion;
    }

    public void setIdenticacion(String identicacion) {
        this.identicacion = identicacion;
    }
}
