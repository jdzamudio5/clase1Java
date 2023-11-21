package co.juandavid.javaJuanDavid;

public class Perro {
    private static String nombre, raza;
    private static int edad;

    public Perro(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;

    }
    public Perro(){

    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Perro.nombre = nombre;
    }

    public static String getRaza() {
        return raza;
    }

    public static void setRaza(String raza) {
        Perro.raza = raza;
    }

    public static int getEdad() {
        return edad;
    }

    public static void setEdad(int edad) {
        Perro.edad = edad;
    }

    public void imprimir(){
        System.out.println("Raza: "+this.raza+"\nNombre: "+this.nombre+"\nedad: "+this.edad);
    }
}
