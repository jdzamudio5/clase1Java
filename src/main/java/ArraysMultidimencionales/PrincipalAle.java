package ArraysMultidimencionales;

import static ArraysMultidimencionales.Array_List.addData;
import static ArraysMultidimencionales.Array_List.updateDate;

public class PrincipalAle {
    public static void main(String[] args) {
        addData(); // Se llena el arrayList -- Se invoca el método de la clase  Array_List
        updateDate(); // Se modifica

        Array_List metodos= new Array_List();
        metodos.getData1();

    }
}
