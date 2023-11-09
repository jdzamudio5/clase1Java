package co.andres.ClasesYObjetos;

public class Persona {
    //Atributos
    String nombre;
    int edad;

    //Metodos

    //Metodo constructor
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;

    }

    public void mostrarDatos(){
        System.out.println("El nombre es: " + nombre);
        System.out.println("la edad es: " + edad);
    }
}
