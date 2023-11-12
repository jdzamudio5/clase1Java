package co.Miguel_Ochoa.EXAMEN_8_NOV;
/*
Este código fue realizado por: Miguel Esteban Ochoa
Inicio de creación código: 08 de Noviembre 2023
Finalización de creación código: 12 de Noviembre 2023
 */
import java.util.List;
public class Cliente extends Persona {
    private boolean esNuevo;
    private boolean esAntiguo;
    private List<Cuenta> cuentas;

    public boolean isEsNuevo() {
        return esNuevo;
    }

    public void setEsNuevo(boolean esNuevo) {
        this.esNuevo = esNuevo;
    }

    public boolean isEsAntiguo() {
        return esAntiguo;
    }

    public void setEsAntiguo(boolean esAntiguo) {
        this.esAntiguo = esAntiguo;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public Cliente(String nombre, String apellido, String cedulaUsuario, boolean esNuevo, boolean esAntiguo) {
        super(nombre, apellido, cedulaUsuario);
        this.esNuevo = esNuevo;
        this.esAntiguo = esAntiguo;
        this.cuentas = cuentas;
    }
}

