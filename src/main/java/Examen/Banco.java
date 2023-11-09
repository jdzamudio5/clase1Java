package Examen;

import java.util.Random;
import Examen.Cuenta;

public class Banco {
    String nombre;
    String direccion;
    int telefono;
    String correoInstitucional;
    public static void consultarCliente(){
    }
    public static void asociarCliente(){
    }
    public static void actualizarInformacionCliente(){
    }
    public static Cuenta crearCuenta(){
        String nombreBanco = "Banco de Occidente";
        String direccionBanco= "Carrera 13 # 26A - 47";
        int telefono = 1234;
        String correoBanco="correo@bancodeoccidente.com.co";
        Random random = new Random();
        // Generar un número entero aleatorio entre 0 y 999999
        int numeroAleatorio = random.nextInt(999999);
        Cuenta cuenta = new Cuenta(nombreBanco,direccionBanco,telefono,correoBanco,null,numeroAleatorio,"aho","01/01/2023",0,80762796);
        System.out.println("Numero de cuenta creado:"+numeroAleatorio);
        return cuenta;
    }
    public Banco(String nombre, String direccion, int telefono, String correoInstitucional, Cuenta cuenta) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoInstitucional = correoInstitucional;
    }
    //aqui van los getter
    public String getNombre() {
        return nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public int getTelefono(){
        return telefono;
    }
    public String getCorreoInstitucional(){
        return correoInstitucional;
    }

    //aqui van los setter
    public void setNombre(String nuevoNombre){
        this.nombre =nuevoNombre;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }
}
