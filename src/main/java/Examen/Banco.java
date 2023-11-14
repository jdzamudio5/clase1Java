package Examen;

import java.util.Random;
import Examen.Cuenta;

public class Banco {
    private String nombre="Banco de Occidente";
    private String direccion="Carrera 13 # 26A - 47";
    private int telefono=55555;
    private String correoInstitucional="correo@bancodeoccidente.com.co";
    public static void consultarCliente(){}
    public static void asociarCliente(){}
    public static void actualizarInformacionCliente(){}
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
