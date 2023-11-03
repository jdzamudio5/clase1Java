package co.gustavo.LogIn;

import javax.swing.*;

import java.util.ArrayList;

import static co.gustavo.LogIn.LogIn.*;
import static co.gustavo.LogIn.Menu.*;
import static co.gustavo.LogIn.Registro.*;

/*import static co.gustavo.LogIn.LogIn.registro;*/

public class Main {

    public static void main(String[] args) {

        int opcion;

        do {
            opcion = seleccionarOpcion();
            proceso(opcion);
        } while (opcion != 3);

        listadoUsuarios();// verificacion de almacenamiento


    }

}
