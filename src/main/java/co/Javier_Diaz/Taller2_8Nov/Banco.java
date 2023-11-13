package co.Javier_Diaz.Taller2_8Nov;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Random;

public class Banco{
    private ArrayList<Cliente> Datos = new ArrayList<>();

    public Banco() {
    }
    public Banco(ArrayList<Cliente> datos) {
        Datos = datos;
    }

    public void requerirDatosNuevacuenta(){

        String Numero_documento=(JOptionPane.showInputDialog("Identificacion:"));
        String Nombres=(JOptionPane.showInputDialog("Nombres:"));
        String Apellidos=(JOptionPane.showInputDialog("Apellidos:"));
        String Usuarios=(JOptionPane.showInputDialog("Usuario:"));
        String Contrasenas=(JOptionPane.showInputDialog("contrasena:"));

        //Creacion del Numero Aleatorio
        Random random = new Random();
        int tempCuenta= random.nextInt(1000);

        //Creacion del Saldo - Se crar opcion por defecto o diferente valor - Si es diferente monto valida que sea mayor al minimo seleccionado.
        double tempsaldo=50000;
        int opcion_MontoInicial;
        String[] opciones_MontoInicial = {"Monto Por Defecto "+tempsaldo, "Diferente Monto"};
        opcion_MontoInicial = JOptionPane.showOptionDialog(
                null,
                "Selecciona una opcion:",
                "Recuerda que el Monto debe ser igual o Mayor a: "+tempsaldo,
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones_MontoInicial,
                opciones_MontoInicial[0]);

        switch (opcion_MontoInicial)
        {
            case 0:
                JOptionPane.showMessageDialog(null, "Monto Minimo Inicial de "+tempsaldo);
                break;
            case 1:
                boolean Validador_Monto_Monimo=true;
                do{
                    double nuevotempsaldo= Double.parseDouble((JOptionPane.showInputDialog("Ingrese Monto: ")));
                    if (nuevotempsaldo>=tempsaldo){
                        tempsaldo=nuevotempsaldo;
                        Validador_Monto_Monimo=false;
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Ingrese un Monto Mayor o igual a  "+tempsaldo);
                    }
                }while(Validador_Monto_Monimo);

                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida");
        }

        Cuenta cuenta = new Cuenta(tempCuenta,tempsaldo,true);
        Cliente cliente = new Cliente(Nombres,Apellidos,Numero_documento,cuenta,Usuarios,Contrasenas,true);
        Datos.add(cliente);
    }

    public void verClientes(){

        // Crear un StringBuilder para almacenar las iteraciones
        StringBuilder mensajeBuilder = new StringBuilder();

        for (int i = 0; i < Datos.size(); i++) {
            mensajeBuilder.append("Nombres: ").append(Datos.get(i).getNombres()).append("\n");
            mensajeBuilder.append("Apellidos: ").append(Datos.get(i).getApellidos()).append("\n");
            mensajeBuilder.append("Numero de Documento: ").append(Datos.get(i).getNumero_Documento()).append("\n");
            mensajeBuilder.append("Estado Cliente: ").append(Datos.get(i).getEstado_Cliente()).append("\n");
            mensajeBuilder.append("Usuario: ").append(Datos.get(i).getUsuario()).append("\n");
            mensajeBuilder.append("Contrasena: ").append(Datos.get(i).getContrasena()).append("\n");
            mensajeBuilder.append("Numero de Cuenta: ").append(Datos.get(i).getCuenta().getNumero_Cuenta()).append("\n");
            mensajeBuilder.append("Estado de Cuenta: ").append(Datos.get(i).getCuenta().getEstadoCuenta()).append("\n");
            mensajeBuilder.append("Saldo: ").append(Datos.get(i).getCuenta().getSaldo()).append("\n");
            mensajeBuilder.append("-------------------------------------------------------------------------------------\n\n");
        }

        // Obtener el String final
        String mensajeFinal = mensajeBuilder.toString();

        JOptionPane.showMessageDialog(null, mensajeFinal);
    }
    public void Deposito(){
        int Numero_Cuenta = -1;
        String Numero_identificacion="Null";

        int opcion_Deposito;
        String[] opciones_Deposito = {"Numero de Cuenta", "Numero de Documento"};
        opcion_Deposito = JOptionPane.showOptionDialog(
                null,
                "Selecciona una opcion:",
                "Banco De Occidente",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones_Deposito,
                opciones_Deposito[0]);

        switch (opcion_Deposito){
            case 0:
                Numero_Cuenta= Integer.parseInt((JOptionPane.showInputDialog("Numero De Cuenta:")));
                for (int i = 0; i < Datos.size(); i++) {

                    if (Numero_Cuenta == Datos.get(i).getCuenta().getNumero_Cuenta()) {
                        double Deposito = Double.parseDouble((JOptionPane.showInputDialog("Ingrese Monto a Depositar: ")));
                        double NuevoSaldo=Datos.get(i).getCuenta().getSaldo() + Deposito;
                        Datos.get(i).getCuenta().setSaldo(NuevoSaldo);
                        JOptionPane.showMessageDialog(null, "El nuevo Saldo para cuenta: "+Datos.get(i).getCuenta().getNumero_Cuenta()+" es de "+NuevoSaldo);
                    }
                }
                break;

                case 1:
                    Numero_identificacion=(JOptionPane.showInputDialog("Numero De identificacion:"));
                    ArrayList<Integer> CuentaIdentificacion = new ArrayList<>();

                    for (int i = 0; i < Datos.size(); i++) {
                        if (Numero_identificacion.equals(Datos.get(i).getNumero_Documento())){
                            CuentaIdentificacion.add(Datos.get(i).getCuenta().getNumero_Cuenta());
                        }
                    }

                    Integer[] arrayCuentas = CuentaIdentificacion.toArray(new Integer[CuentaIdentificacion.size()]);

                    int opcion_Cuenta_Deposito;
                    int Cuenta_opcion_Deposito = JOptionPane.showOptionDialog(
                            null,
                            "Selecciona una Cuenta:",
                            "Banco De Occidente",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            arrayCuentas,
                            arrayCuentas[0]);


                    for (int i = 0; i < Datos.size(); i++) {
                        if (arrayCuentas[Cuenta_opcion_Deposito] == Datos.get(i).getCuenta().getNumero_Cuenta()) {
                                         double Deposito = Double.parseDouble((JOptionPane.showInputDialog("Ingrese Monto a Depositar: ")));
                                         double NuevoSaldo=Datos.get(i).getCuenta().getSaldo()+Deposito;
                                         Datos.get(i).getCuenta().setSaldo(NuevoSaldo);
                                         JOptionPane.showMessageDialog(null, "El nuevo Saldo para cuenta: "+Datos.get(i).getCuenta().getNumero_Cuenta()+" es de "+NuevoSaldo);
                        }
                    }

                    break;

            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida");
        }
    }
    public void Retiro(){
            int Numero_Cuenta = -1;
            String Numero_identificacion="Null";

            int opcion_Retiro;
            String[] opciones_Retiro = {"Numero de Cuenta", "Numero de Documento"};
            opcion_Retiro = JOptionPane.showOptionDialog(
                    null,
                    "Selecciona una opcion:",
                    "Banco De Occidente",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones_Retiro,
                    opciones_Retiro[0]);

            switch (opcion_Retiro){
                case 0:
                    Numero_Cuenta= Integer.parseInt((JOptionPane.showInputDialog("Numero De Cuenta:")));
                    for (int i = 0; i < Datos.size(); i++) {
                        if (Numero_Cuenta == Datos.get(i).getCuenta().getNumero_Cuenta()) {
                            double Retiro = Double.parseDouble((JOptionPane.showInputDialog("Ingrese Monto a Retirar:")));
                            double NuevoSaldo=Datos.get(i).getCuenta().getSaldo() - Retiro;
                            Datos.get(i).getCuenta().setSaldo(NuevoSaldo);
                            JOptionPane.showMessageDialog(null, "El nuevo Saldo para cuenta: "+Datos.get(i).getCuenta().getNumero_Cuenta()+" es de "+NuevoSaldo);
                        }
                    }
                    break;

                case 1:
                    Numero_identificacion=(JOptionPane.showInputDialog("Numero De identificacion:"));
                    ArrayList<Integer> CuentaIdentificacion = new ArrayList<>();

                    for (int i = 0; i < Datos.size(); i++) {
                        if (Numero_identificacion.equals(Datos.get(i).getNumero_Documento())){
                            CuentaIdentificacion.add(Datos.get(i).getCuenta().getNumero_Cuenta());
                        }
                    }

                    Integer[] arrayCuentas = CuentaIdentificacion.toArray(new Integer[CuentaIdentificacion.size()]);

                    int opcion_Cuenta_Retiro;
                    int Cuenta_opcion_Retiro = JOptionPane.showOptionDialog(
                            null,
                            "Selecciona una Cuenta:",
                            "Banco De Occidente",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            arrayCuentas,
                            arrayCuentas[0]);


                    for (int i = 0; i < Datos.size(); i++) {
                        if (arrayCuentas[Cuenta_opcion_Retiro] == Datos.get(i).getCuenta().getNumero_Cuenta()) {
                            double Retiro = Double.parseDouble((JOptionPane.showInputDialog("Ingrese Monto a Retirar: ")));
                            double NuevoSaldo=Datos.get(i).getCuenta().getSaldo()-Retiro;
                            Datos.get(i).getCuenta().setSaldo(NuevoSaldo);
                            JOptionPane.showMessageDialog(null, "El nuevo Saldo para cuenta: "+Datos.get(i).getCuenta().getNumero_Cuenta()+" es de "+NuevoSaldo);
                        }
                    }

                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        }

        public void ActulizarCliente(){
           String TempNumero_Identificacion= JOptionPane.showInputDialog("Numero De Identificacion:");
            boolean ValidacionClinete=false;

            for (int i = 0; i < Datos.size(); i++) {
                if (TempNumero_Identificacion.equals(Datos.get(i).getNumero_Documento())){
                    ValidacionClinete=true;
                }
            }

            if (ValidacionClinete){

                String TempNombres= JOptionPane.showInputDialog("Ingrese Nombres");
                String TempApellidos= JOptionPane.showInputDialog("Ingrese Apellidos");
                String TempUsuario= JOptionPane.showInputDialog("Ingrese Usuarios");
                String TempClave= JOptionPane.showInputDialog("Ingrese Clave");

                for (int i = 0; i < Datos.size(); i++) {
                    if (TempNumero_Identificacion.equals(Datos.get(i).getNumero_Documento())){
                        Datos.get(i).setNombres(TempNombres);
                        Datos.get(i).setApellidos(TempApellidos);
                        Datos.get(i).setUsuario(TempUsuario);
                        Datos.get(i).setContrasena(TempNumero_Identificacion);
                    }
                }

                JOptionPane.showMessageDialog(null, "Informacion del Ciente Actulizada");

            }else {
                JOptionPane.showMessageDialog(null, "No Existen Clientes con este numero de Documento");
            }

        }

    public void ElimiarCuenta(){
        int Numero_Cuenta = -1;
        String Numero_identificacion="Null";

        int opcion_Eliminar;
        String[] opciones_Eliminar = {"Numero de Cuenta", "Numero de Documento"};
        opcion_Eliminar = JOptionPane.showOptionDialog(
                null,
                "Selecciona una opcion:",
                "Banco De Occidente",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones_Eliminar,
                opciones_Eliminar[0]);

        switch (opcion_Eliminar){
            case 0:
                Numero_Cuenta= Integer.parseInt((JOptionPane.showInputDialog("Numero De Cuenta:")));
                for (int i = 0; i < Datos.size(); i++) {
                    if (Numero_Cuenta == Datos.get(i).getCuenta().getNumero_Cuenta()) {
                        Datos.get(i).getCuenta().setEstadoCuenta(false);
                        JOptionPane.showMessageDialog(null, "El nuevo estado de la cuenta: "+Datos.get(i).getCuenta().getNumero_Cuenta()+" es Desactivada");
                    }
                }
                break;

            case 1:
                Numero_identificacion=(JOptionPane.showInputDialog("Numero De identificacion:"));
                ArrayList<Integer> CuentaIdentificacion = new ArrayList<>();

                for (int i = 0; i < Datos.size(); i++) {
                    if (Numero_identificacion.equals(Datos.get(i).getNumero_Documento())){
                        CuentaIdentificacion.add(Datos.get(i).getCuenta().getNumero_Cuenta());
                    }
                }

                Integer[] arrayCuentas = CuentaIdentificacion.toArray(new Integer[CuentaIdentificacion.size()]);

                int opcion_Cuenta_Retiro;
                int Cuenta_opcion_Retiro = JOptionPane.showOptionDialog(
                        null,
                        "Selecciona una Cuenta:",
                        "Banco De Occidente",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        arrayCuentas,
                        arrayCuentas[0]);


                for (int i = 0; i < Datos.size(); i++) {
                    if (arrayCuentas[Cuenta_opcion_Retiro] == Datos.get(i).getCuenta().getNumero_Cuenta()) {
                        Datos.get(i).getCuenta().setEstadoCuenta(false);
                        JOptionPane.showMessageDialog(null, "El nuevo estado de la cuenta: "+Datos.get(i).getCuenta().getNumero_Cuenta()+" es Desactivada");
                    }
                }

                break;

            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida");
        }
    }
        public void ElimiarCliente(){
            String Numero_identificacion=(JOptionPane.showInputDialog("Numero De identificacion:"));
            for (int i = 0; i < Datos.size(); i++) {
                if (Numero_identificacion.equals(Datos.get(i).getNumero_Documento())){
                    Datos.get(i).setEstado_Cliente(false);
                }
            }
        }
}


