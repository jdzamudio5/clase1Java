package co.MiguelAcevedo.ExamenCuenta;

public class Persona {
    private String nombre;
    private String apellido;
    private int identificacionUsuario;
    //boolean cliente;
    //private String tipoUsuario;

    public Persona() {
        this.nombre = nombre;
        this.apellido=apellido;
        this.identificacionUsuario=identificacionUsuario;
        //this.cliente=cliente;
    }

    public Persona(String nombre, String apellido, int identificacionUsuario) {
    }


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getIdentificacionUsuario() {
        return identificacionUsuario;
    }


// public String getTipoUsuario() {
   //     return tipoUsuario;
   // }
}
