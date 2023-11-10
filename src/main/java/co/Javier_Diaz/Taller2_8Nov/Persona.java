package co.Javier_Diaz.Taller2_8Nov;

public class Persona {
    private String Nombres;
    private String Apellidos;
    private String Numero_Documento;

    public Persona() {
    }

    public Persona(String nombres, String apellidos, String numero_Documento) {
        Nombres = nombres;
        Apellidos = apellidos;
        Numero_Documento = numero_Documento;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getNumero_Documento() {
        return Numero_Documento;
    }

    public void setNumero_Documento(String numero_Documento) {
        Numero_Documento = numero_Documento;
    }
}
