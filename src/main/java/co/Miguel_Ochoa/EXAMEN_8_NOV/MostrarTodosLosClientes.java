package co.Miguel_Ochoa.EXAMEN_8_NOV;
/*
Este código fue realizado por: Miguel Esteban Ochoa
Inicio de creación código: 08 de Noviembre 2023
Finalización de creación código: 12 de Noviembre 2023
 */
import javax.swing.*;

public class MostrarTodosLosClientes {

    public void mostrarInformacionClientes(Cliente[] clientes) {
        if (clientes == null || clientes.length == 0) {
            JOptionPane.showMessageDialog(null, "No hay clientes para mostrar.", "Información de Clientes", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        StringBuilder info = new StringBuilder();

        for (Cliente cliente : clientes) {
            if (cliente == null) continue; // Salta clientes nulos

            info.append("Nombre y Apellido: ").append(cliente.getNombre()).append(" ").append(cliente.getApellido())
                    .append("\nCedula: ").append(cliente.getCedulaUsuario()).append("\n");

            Cuenta[] cuentas = cliente.getCuentas().toArray(new Cuenta[0]);
            if (cuentas != null && cuentas.length > 0) {
                for (Cuenta cuenta : cuentas) {
                    if (cuenta == null) continue; // Salta cuentas nulas

                    info.append("Tipo de Cuenta: ").append(cuenta.getTipoDeCuenta())
                            .append("\nNumero de Cuenta: ").append(cuenta.getNumeroDeCuenta())
                            .append("\nSaldo de Cuenta: ").append(cuenta.getSaldo()).append("\n");
                }
            } else {
                info.append("Este cliente no tiene cuentas asociadas.\n");
            }
            info.append("--------------------------------------\n");
        }

        JOptionPane.showMessageDialog(null, info.toString(), "Información de Clientes", JOptionPane.INFORMATION_MESSAGE);
    }
}
