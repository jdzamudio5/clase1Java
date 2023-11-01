package co.Javier_Diaz.Clases;

public class Principal {
    // Crear una instancia de ArrayListHandler
    ArrayList array = new ArrayList();

    // Agregar elementos a la lista usando el método de ArrayListHandler
        array.agregarElemento(5);
        array.agregarElemento(10);
        array.agregarElemento(15);

    // Obtener la lista desde ArrayListHandler
    ArrayList<Integer> miLista = array.getLista();

    // Crear una instancia de ContarArray
    ContarArray contarArray = new ContarArray();

    // Contar los elementos en la lista usando el método de ContarArray
    int cantidadElementos = contarArray.ContarArray(miLista);

    // Imprimir la cantidad de elementos
        System.out.println("La cantidad de elementos en la lista es: " + cantidadElementos);
}
}
