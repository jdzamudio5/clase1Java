package co.Alejandra.ExamenJava;

import javax.swing.*;

public class Usuarios {

    private String nombreUsuario;
    private String apellidoUsuario;
    private int identificacionUsuario;

    public Usuarios(String nombreUsuario, String apellidoUsuario, int identificacionUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.identificacionUsuario = identificacionUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public int getIdentificacionUsuario() {
        return identificacionUsuario;
    }


}
