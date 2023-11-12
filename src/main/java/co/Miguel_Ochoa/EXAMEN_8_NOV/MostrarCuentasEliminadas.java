package co.Miguel_Ochoa.EXAMEN_8_NOV;

/*
Este código fue realizado por: Miguel Esteban Ochoa
Inicio de creación código: 08 de Noviembre 2023
Finalización de creación código: 12 de Noviembre 2023
 */
import javax.swing.*;

public class MostrarCuentasEliminadas {

    public static void mostrarCuentasEliminadas() {
        if (EliminarCuenta.cuentasEliminadas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay cuentas eliminadas.");
            return;
        }

        StringBuilder mensaje = new StringBuilder("Cuentas Eliminadas:\n");
        for (Cuenta cuenta : EliminarCuenta.cuentasEliminadas) {
            mensaje.append("Cuenta Número: ").append(cuenta.getNumeroDeCuenta())
                    .append(", Tipo: ").append(cuenta.getTipoDeCuenta())
                    .append(", Saldo: $").append(cuenta.getSaldo())
                    .append("\n");
        }

        JOptionPane.showMessageDialog(null, mensaje.toString());
    }
}
