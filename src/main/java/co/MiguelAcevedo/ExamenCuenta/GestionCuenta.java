package co.MiguelAcevedo.ExamenCuenta;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class GestionCuenta {
        Banco banco = new Banco();
        Cuenta cuenta;
        Cliente cliente;
        private List<Persona> personas; //ARRAY PARA GUARDAR LOS DATOS DE LOS USUARIOS
        private List<Banco> bancos;
        private List<Cliente> clientes;
       private List<Cuenta> cuentas;

    public GestionCuenta() {
            this.personas = new ArrayList<>();
            this.bancos = new ArrayList<>();
            this.clientes = new ArrayList<>();
            this.cuentas = new ArrayList<>();
        }
        public void crearCliente () {
            //CAPTURAR VARIABLES
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del usuario.");
            String apellido = JOptionPane.showInputDialog(null, "Ingrese el apellido del usuario.");
            int identificacionUsuario = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la identificación del usuario."));
            cliente = new Cliente(nombre, apellido, identificacionUsuario, false);
            banco.crearCliente(cliente);
            //clientes.add(cliente);
            JOptionPane.showMessageDialog(null, "El usuario "+ cliente.getNombre()+" ha sido registrado.");
        }
        public void buscarCliente(){
        String identificacionUsuario = JOptionPane.showInputDialog("Ingrese el usuario a buscar.");
        cliente = banco.buscarCliente(Integer.parseInt(identificacionUsuario));
            if (cliente != null) {
                JOptionPane.showMessageDialog(null,
                        "cliente encontrado "+ cliente.getNombre()+" "+ cliente.getApellido()+" ID: "+cliente.getIdentificacionUsuario()+"\n");
            } else {
                JOptionPane.showMessageDialog(null,"cliente no encontrado");
            }
        }
    public void crearCuentaAh(){
        String identificacionUsuario = JOptionPane.showInputDialog("ingrese la identificación del usuario:");
        cliente = banco.buscarCliente(Integer.parseInt(identificacionUsuario));
        if (cliente != null) {
            String tipoCuenta = JOptionPane.showInputDialog(null, "Ingrese el tipo de cuenta del usuario.");
            int numCuenta = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de cuenta."));
            double saldoCuenta = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el saldo inicial de la cuenta."));
            //cuenta.saldoCuenta();
            //int numCuenta = cuenta.getNumCuenta();
            //double saldoCuenta = cuenta.getSaldoCuenta();
            cuenta = new Cuenta(tipoCuenta, numCuenta, saldoCuenta, cliente);
            cuenta.crearCuenta(cliente);
            JOptionPane.showMessageDialog(null,"la cuenta del usuario "+ cliente.getNombre()+" ha sido creada con éxito.");
        } else {
            JOptionPane.showMessageDialog(null,"cliente no encontrado");
        }
    }
    public void actualizarInfos(){
        int identificacionUsuario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el usuario a buscar."));
        cliente = banco.buscarCliente(identificacionUsuario);
        if (cliente != null) {
            JOptionPane.showMessageDialog(null,"cliente encontrado "+ cliente.getNombre());
        } else {
            JOptionPane.showMessageDialog(null,"cliente no encontrado");
        }
    }
        public void actualizarInfo() {
            String identificacionUsuario = JOptionPane.showInputDialog("ingrese la identificación del usuario:");
            cliente = banco.buscarCliente(Integer.parseInt(identificacionUsuario));
            if (cliente != null) {
                cliente.setNombre(JOptionPane.showInputDialog("Digite el nombre a actualizar:"));
                cliente.setApellido(JOptionPane.showInputDialog("Digite el apellido a actualizar:"));

                JOptionPane.showMessageDialog(null,"la cuenta del usuario "+ cliente.getNombre()+" ha sido actualizado con éxito.");
            } else {
                JOptionPane.showMessageDialog(null,"cliente no encontrado");
            }


        }
    }


