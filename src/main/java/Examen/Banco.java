package Examen;

import java.util.Random;
import Examen.Cuenta;

public class Banco {
    private String nombre;
    private String direccion;
    private int telefono;
    private String correoInstitucional;
    public static void consultarCliente(){}
    public static void asociarCliente(){}
    public static void actualizarInformacionCliente(){}
    public static void crearCuenta(){}
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getDireccion() {return direccion;}
    public void setDireccion(String direccion) {this.direccion = direccion;}
    public int getTelefono() {return telefono;}
    public void setTelefono(int telefono) {this.telefono = telefono;}
    public String getCorreoInstitucional() {return correoInstitucional;}
    public void setCorreoInstitucional(String correoInstitucional) {this.correoInstitucional = correoInstitucional;}

    //constructores

    public Banco(String nombre, String direccion, int telefono, String correoInstitucional) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoInstitucional = correoInstitucional;
    }
}
