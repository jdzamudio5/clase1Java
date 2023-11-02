package co.Javier_Diaz.Arraylist;

import java.util.ArrayList;  // Agrega esta línea para importar la clase ArrayList

public class Main {
    public static void main(String[] args) {

        /*

        ¿Qué es un ArrayList?

        En Java, un ArrayList es una clase que forma parte del paquete java.util y proporciona una implementación dinámica
        de una lista. A diferencia de los arrays tradicionales, un ArrayList puede cambiar de tamaño dinámicamente,
        lo que significa que puedes agregar o eliminar elementos de la lista de manera flexible. Es una estructura de datos
        que se utiliza comúnmente para almacenar y manipular conjuntos de elementos.

        METODOS DE LA CLASE ARRAYLIST

        - Agregar Elementos:
        lista.add("Elemento1");

        - Acceder a Elementos:
        String elemento = lista.get(1);

        - Modificar Elementos:
        lista.set(0, "NuevoElemento");

        - Eliminar Elementos:
        lista.remove("Elemento1");
        lista.remove(2);

        - Obtener el Tamaño de la Lista:
        int tamaño = lista.size();

        - Comprobar si la Lista Contiene un Elemento: Devuelve true o false
        boolean contiene = lista.contains("Elemento1");

        */

        // Crear un ArrayList de tipo String
        ArrayList<String> listaNombres = new ArrayList<>();

        // Agregar elementos al ArrayList
        listaNombres.add("Javier");
        listaNombres.add("Jorge");
        listaNombres.add("Rafael");

        // Imprimir la lista antes de la modificación
        System.out.println("Lista antes de la modificación:");
        imprimirLista(listaNombres);

        // Modificar un elemento en la lista
        listaNombres.set(1, "Ana");

        // Agregar un nuevo elemento a la lista
        listaNombres.add("Oscar");

        // Eliminar un elemento de la lista
        listaNombres.remove("Rafael");

        // Imprimir la lista después de la modificación
        System.out.println("\nLista después de la modificación:");
        imprimirLista(listaNombres);



    }

    // Método para imprimir los elementos de la lista
    private static void imprimirLista(ArrayList<String> lista) {
        for (int i = 0; i < lista.size(); i++) {
            String elemento = lista.get(i);
            System.out.println(elemento);
        }
    }
}
