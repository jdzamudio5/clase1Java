package co.Lina.ArrayMultidimensional;

public class Principal {

//esta clase solo se encarga de ejecutar de los metodos de otra clase
    public static void main(String[] args) {
        //llamar los metodos , no se necesita instancias por que los metodos son static
        ArrayListExample.agregarDatos();
        ArrayListExample.actualizarDatos();

        //crear instancia de un clase, para poder acceder a metodos que no son estaticos

        ArrayListExample metodos= new ArrayListExample();
        metodos.obtenerDatos();
    }
}
