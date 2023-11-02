package co.Javier_Diaz.Usuarios;

public class Usuario {
    private String nombre;
    private String contrasena;

    public Usuario(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String nuevaContrasena) {
        this.contrasena = nuevaContrasena;
    }
}
