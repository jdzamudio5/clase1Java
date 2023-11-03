package co.gustavo.LogIn;

import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Objects;

import static co.gustavo.LogIn.Registro.*;
public class LogIn {



        public static boolean verificarCredenciales(@NotNull ArrayList<String[]> usuarios, String usuario, String contrasena) {
            for (int i = 0; i < usuarios.size(); i++) {
                String[] usuarioVerif = usuarios.get(i);
                if (usuarioVerif[0].equals(usuario) && usuarioVerif[1].equals(contrasena)) {
                    return true; // Usuario y contraseña coinciden
                }
            }
            return false; // Usuario y/o contraseña incorrectos
        }


}
