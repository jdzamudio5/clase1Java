package co.juandavid.examen3;


import java.util.List;

public class Usuario {
    private String nombre, apellido, correo, contrasena1, contrasena2;

    public Usuario(String nombre, String apellido, String correo, String contrasena1, String contrasena2) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena1 = contrasena1;
        this.contrasena2 = contrasena2;
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

    public String getContrasena1() {
        return contrasena1;
    }

    public void setContrasena1(String contrasena1) {
        this.contrasena1 = contrasena1;
    }

    public String getContrasena2() {
        return contrasena2;
    }

    public void setContrasena2(String contrasena2) {
        this.contrasena2 = contrasena2;
    }
}
