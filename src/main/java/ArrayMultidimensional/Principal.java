package ArrayMultidimensional;

import static ArrayMultidimensional.ArrayListExample.actualizarDatos;
import static ArrayMultidimensional.ArrayListExample.agregarDatos;

public class Principal {

//esta clase solo se encarga de ejecutar de los metodos de otra clase
    public static void main(String[] args) {
        //llamar los metodos , no se necesita instancias por que los metodos son static
        agregarDatos();
        actualizarDatos();

        //crear instancia de un clase, para poder acceder a metodos que no son estaticos

        ArrayListExample metodos= new ArrayListExample();
        metodos.obtenerDatos();
    }
}
