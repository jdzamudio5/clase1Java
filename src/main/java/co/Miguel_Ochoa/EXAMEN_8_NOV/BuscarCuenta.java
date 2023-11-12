package co.Miguel_Ochoa.EXAMEN_8_NOV;
/*
Este código fue realizado por: Miguel Esteban Ochoa
Inicio de creación código: 08 de Noviembre 2023
Finalización de creación código: 12 de Noviembre 2023
 */
import java.util.ArrayList;
import java.util.List;

public class BuscarCuenta{
    public static Cuenta buscarporNumero(List<Cliente> clientes, String numeroCuenta) {
        for (Cliente cliente : clientes) {
            for (Cuenta cuenta : cliente.getCuentas()) {
                if (cuenta.getNumeroDeCuenta().equals(numeroCuenta)) {
                    return cuenta;
                }
            }
        }
        return null;
    }


    public static List<Cuenta> buscarporCedula(List<Cliente> clientes, String cedulaUsuario) {
        Cliente cliente = BuscarCliente.buscar(clientes, cedulaUsuario);
        if (cliente != null) {
            return cliente.getCuentas();
        }
        return new ArrayList<>();
    }
}
