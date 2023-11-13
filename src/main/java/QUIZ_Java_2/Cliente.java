package QUIZ_Java_2;

public class Cliente extends Persona{


    public Cliente(String nombre, String apellido, String identificacion) {
        super(nombre, apellido, identificacion);
    }
    public Void mostrarInformacion(){
        super.mostrarinformacion();
        return null;
    }
}
