package QUIZ_Java_2;

import javax.swing.*;

public class Persona {
    private String nombre;
    private String apellido;
    private String identificacion;

    public Persona(String nombre, String apellido, String identificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
    }

    public void mostrarinformacion(){
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nApellido: " +
                apellido + "\nIdentificación: " + identificacion);
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

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

}
