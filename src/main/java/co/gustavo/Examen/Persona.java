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


    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumDoc() {
        return numDoc;
    }


    }














