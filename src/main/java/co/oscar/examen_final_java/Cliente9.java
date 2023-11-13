package co.oscar.examen_final_java;

public class Cliente9 extends Persona9{
    private  int id_cliente;

    public Cliente9(boolean cliente, String nombre, String apellido, String identificacion, int id_cliente) {
        super(cliente, nombre, apellido, identificacion);
        this.id_cliente = id_cliente;
    }
    public static void transaciones(){
    }
    public static void guardar_dinero(){
    }
    public static void actualizar_cliente(){
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
}
