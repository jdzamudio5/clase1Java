package Examen;

public class Banco {
    String nombre;
    String direccion;
    int telefono;
    String correoInstitucional;
    int cuenta;
    public static void crearBanco(){
    }
    public static void consultarCliente(){
    }
    public static void asociarCliente(){

    }
    public static void actualizarInformacionCliente(){

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
    public int getCuenta(){
        return cuenta;
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

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }
}
