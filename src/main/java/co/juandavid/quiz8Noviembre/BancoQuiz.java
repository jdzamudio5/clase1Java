package co.juandavid.quiz8Noviembre;



//import co.juandavid.examenBocc.Cliente;

import javax.swing.*;

import static co.juandavid.quiz8Noviembre.ClienteQuiz.getStockClientes;
import static co.juandavid.quiz8Noviembre.CuentaQuiz.getCuentasClientes;


public class BancoQuiz {


    private CuentaQuiz cuentaQuiz;
    private ClienteQuiz clienteQuiz;

    public BancoQuiz() {
        this.cuentaQuiz = cuentaQuiz;
        this.clienteQuiz = clienteQuiz;
    }

    public CuentaQuiz getCuentaQuiz() {
        return cuentaQuiz;
    }

    public void setCuentaQuiz(CuentaQuiz cuentaQuiz) {
        this.cuentaQuiz = cuentaQuiz;
    }

    public ClienteQuiz getClienteQuiz() {
        return clienteQuiz;
    }

    public void setClienteQuiz(ClienteQuiz clienteQuiz) {
        this.clienteQuiz = clienteQuiz;
    }

    //crear cliente nuevo

    public void crearCliente(){
        String nombreCliente= JOptionPane.
                showInputDialog(null,"Ingrese el nombre");
        String apellidoCliente= JOptionPane.
                showInputDialog(null,"Ingrese el apellido");
        String identificacion=JOptionPane.
                showInputDialog(null,"Ingrese numero de identifi");
        String email=JOptionPane.
                showInputDialog(null,"Ingrese correo electrónico");
        String telefono=JOptionPane.
                showInputDialog(null,"Ingrese telefono de contacto");

        ClienteQuiz clienteQuiz1=new ClienteQuiz(nombreCliente,apellidoCliente,identificacion,email,telefono,false);
        getStockClientes().add(0,clienteQuiz1);
        System.out.println(getStockClientes().get(0).getNombre());
        JOptionPane.showMessageDialog(null,"Registro exitoso");

    }
    public ClienteQuiz buscarCliente(int identificacion){
        for (ClienteQuiz clienteQuiz1: getStockClientes()) {
            if (Integer.parseInt(clienteQuiz1.getIdentificacion())==identificacion){
                return clienteQuiz1;

            }
            
        }return null;

    }
    public int buscarCuenta(ClienteQuiz clienteQuiz){
        for (CuentaQuiz cuentaQuiz: getCuentasClientes()) {
            if (clienteQuiz.getIdentificacion()==cuentaQuiz.getClienteQuiz().getIdentificacion()){
                return cuentaQuiz.getNumCuenta();

            }

        }return null;

    }




    public void crearCuenta(){
        int identificacion=Integer.parseInt(JOptionPane.showInputDialog(null,"digite numero" +
                "de identificación"));
        clienteQuiz=buscarCliente(identificacion);
        int aleatorio=(int)(Math.random()*(99999-10000+1)+10000);;
        if (clienteQuiz != null) {
            int numCuenta=aleatorio;
            double saldoCuenta=Double.parseDouble(JOptionPane.showInputDialog(null,"" +
                    "Importante: el saldo minimo para abrir la cuenta es de $50.000.\n" +
                    "Por favor ingrese el saldo para abrir la cuenta"));
            if (saldoCuenta >= 50000) {
                CuentaQuiz cuentaQuiz=new CuentaQuiz(numCuenta,saldoCuenta,clienteQuiz);
                getCuentasClientes().add(0,cuentaQuiz);
                JOptionPane.showMessageDialog(null,
                        "cliente Nombre: "+ clienteQuiz.getNombre()+" "+ clienteQuiz.getApellido()
                                +"\n identificación "+clienteQuiz.getIdentificacion()+"Cuenta"+ cuentaQuiz.getNumCuenta()+
                                "saldo: "+cuentaQuiz.getSaldoCuenta());
                System.out.println(cuentaQuiz.getCuentasClientes().get(0).getNumCuenta());

            }else {
                    JOptionPane.showMessageDialog(null, "Consigne un valor minimo de" +
                            "$50.000");
            }


        }else {
            JOptionPane.showMessageDialog(null, "cliente no encontrado");
        }

    }

    public void buscarClientes(){
        int identificacion=Integer.parseInt(JOptionPane.showInputDialog(null,"digite numero" +
                "de identificación"));
        clienteQuiz=buscarCliente(identificacion);
        if (clienteQuiz != null) {
            JOptionPane.showMessageDialog(null,
                    "cliente Nombre: "+ clienteQuiz.getNombre()+" "+ clienteQuiz.getApellido()
                            +"\n identificación "+clienteQuiz.getIdentificacion());
        }else {
            JOptionPane.showMessageDialog(null, "cliente no encontrado");
        }
    }
    public void consultarCuenta(){
        int identificacion=Integer.parseInt(JOptionPane.showInputDialog(null,"digite numero" +
                "de identificación"));
        clienteQuiz=buscarCliente(identificacion);
        if (clienteQuiz != null) {

            JOptionPane.showMessageDialog(null,
                    "cliente Nombre: "+ clienteQuiz.getNombre()+" "+ clienteQuiz.getApellido()
                            +"\n identificación "+clienteQuiz.getIdentificacion());
        }else {
            JOptionPane.showMessageDialog(null, "cliente no encontrado");
        }
    }
}


