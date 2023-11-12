package co.Miguel_Ochoa.EXAMEN_8_NOV;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.List;

public class EliminarCuenta {
    public static List<Cuenta> cuentasEliminadas = new ArrayList<>();

    public static void eliminarCuenta(Cliente cliente) {
        String numeroDeCuenta = JOptionPane.showInputDialog(null, "Ingrese el número de cuenta a eliminar:");

        Cuenta cuentaAEliminar = null;
        for (Cuenta cuenta : cliente.getCuentas()) {
            if (cuenta.getNumeroDeCuenta().equals(numeroDeCuenta)) {
                cuentaAEliminar = cuenta;
                break;
            }
        }

        if (cuentaAEliminar != null) {
            cliente.getCuentas().remove(cuentaAEliminar);
            cuentasEliminadas.add(cuentaAEliminar); // Agregar la cuenta eliminada a la lista
            JOptionPane.showMessageDialog(null, "La cuenta ha sido eliminada.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró la cuenta con el número proporcionado.");
        }
    }
}


