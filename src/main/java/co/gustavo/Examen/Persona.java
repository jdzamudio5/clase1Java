package co.gustavo.Examen;

public class Persona {

    private String nombre, tipoDoc;
    private int edad,numDoc;


        // Constructor
        public Persona(String nombre,String tipoDoc,int numDoc, int edad) {
            this.nombre = nombre;
            this.tipoDoc = tipoDoc;
            this.numDoc=numDoc;
            this.edad = edad;

        }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(int numDoc) {
        this.numDoc = numDoc;
    }



    // Método para imprimir información de la persona
    public void Informacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Ocupación: " + tipoDoc);
        System.out.println("Ocupación: " + numDoc);
        System.out.println("Edad: " + edad);

    }






    }














