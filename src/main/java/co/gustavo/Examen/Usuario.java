package co.gustavo.Examen;

public class Usuario extends Persona{


    private int telefono ;
    private String email;

    public Usuario(String nombre, String tipoDoc, int numDoc, int edad, int telefono,String email) {
        super(nombre, tipoDoc, numDoc, edad);
        this.telefono = telefono;
        this.email= email;
    }

    //MEtodos


}
