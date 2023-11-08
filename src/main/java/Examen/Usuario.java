package Examen;

public class Usuario extends Persona{
    String usuario;
    String clave;
    public static void ingresarSistema(){
    }
    //aqui van los getter y setter
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
