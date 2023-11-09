package co.MiguelAcevedo.ejercicioLogin;

public class Usuario {
    private String nombre;
    private int identificacionUsuario;
    private String correoUsuario;
    private  String nombre_Usuario;
    private  String contrasena;
    public Usuario(String nombre, int identificacionUsuario, String correoUsuario, String nombre_Usuario, String contrasena) {
        this.nombre = nombre;
        this.identificacionUsuario=identificacionUsuario;
        this.correoUsuario=correoUsuario;
        this.nombre_Usuario=nombre_Usuario;
        this.contrasena= contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdentificacionUsuario() {
        return identificacionUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public String getNombre_Usuario() {
        return nombre_Usuario;
    }

    public String getContrasena() {
        return contrasena;
    }
}
