package co.Lina.EjercicioBanco;

public class Persona {

    String nombre;
    String apellido;
    int numero_Identificacion;


    public Persona(String nombre, String apellido, int numero_Identificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero_Identificacion = numero_Identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getNumero_Identificacion() {
        return numero_Identificacion;
    }

    public void mostrarDatos(int numIdentificacion){
       if(numero_Identificacion==numIdentificacion){
            System.out.println("Nombre: "+getNombre());
            System.out.println("Apellido: "+getApellido());
            System.out.println("Numero de Identificación: "+getNumero_Identificacion());
        }else{
            System.out.println("No se encuentran datos");
        }

    }

    public boolean exitePersona(int numIdentificacion){
        return numero_Identificacion==numIdentificacion;
    }
}
