package co.oscar.examen_final_java;


import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
public class Banco9 {
    private ArrayList<Cliente9> clientes;

    public Banco9() {
        this.clientes = new ArrayList<>();
    }

    public static class Banco {
        private String nombre;
        private int numeroCuenta;
        public static Cuenta9 cuenta = new Cuenta9();

        public static void consultarCliente() {
        }

        public static void asociarCliente() {
        }

        public static void actualizarInformacionCliente() {
        }

        public static <Cuenta> Cuenta9 crearCuenta() {
            String nombre = (JOptionPane.showInputDialog("Nombres:"));
            String apellido = (JOptionPane.showInputDialog("Apellidos:"));
            int numeroCedula = Integer.parseInt((JOptionPane.showInputDialog("Identificacion:")));

            Random random = new Random();
            // Generar un número entero aleatorio entre 0 y 999999
            int numeroAleatorio = random.nextInt(999999);
            JOptionPane.showInputDialog("Numero de cuenta creado:" + numeroAleatorio);
            return cuenta;
        }

        public Banco() {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

    }
}