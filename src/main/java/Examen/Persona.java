package Examen;

public class Persona {
    private String nombre;
    private String apellido;
    private byte edad;
    private char genero;
    private String direccion;
    private boolean cliente;

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
    public byte getEdad() {
        return edad;
    }
    public void setEdad(byte edad) {
        this.edad = edad;
    }
    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public boolean isCliente() {
        return cliente;
    }
    public void setCliente(boolean cliente) {
        this.cliente = cliente;
    }
    //Constructores

    public Persona(String nombre, String apellido, byte edad, char genero, String direccion, boolean cliente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
        this.cliente = cliente;
    }
}
