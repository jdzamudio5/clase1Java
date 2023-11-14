package Examen;
import javax.swing.*;

public class Persona {
    private double cedula;
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
    private String direccion;
    private boolean cliente;

    public Persona() {
    }

    public double getCedula() {return cedula;}

    public void setCedula(double cedula) {this.cedula = cedula;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isCliente() {
        return cliente;
    }

    public void setCliente(boolean cliente) {
        this.cliente = cliente;
    }

    //Constructores
    public Persona(double cedula, String nombre, String apellido, int edad, String genero, String direccion, boolean cliente) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
        this.cliente = cliente;
    }

    public static void crearPersona(){
        System.out.println("Crear Persona");
        Persona miPersona = new Persona();
        double cedulaCliente = 0;
        int edadCliente = 0;
        try {
            cedulaCliente = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cedula del cliente:"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido para la cedula del cliente.");
        }
        String nombreCliente = JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente:");
        String apellidoCliente = JOptionPane.showInputDialog(null, "Ingrese el apellido del cliente:");
        try {
            edadCliente = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad del cliente:"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido para la edad del cliente.");
        }
        String direccionCliente = JOptionPane.showInputDialog(null, "Ingrese la direccion cliente:");
        boolean estadoCliente = false;
        System.out.println("Cliente: " + nombreCliente + " " + apellidoCliente + " Creado con exito!!!");
        miPersona.setCedula(cedulaCliente);
        miPersona.setNombre(nombreCliente);
        miPersona.setApellido(apellidoCliente);
        miPersona.setEdad(edadCliente);
        miPersona.setDireccion(direccionCliente);
        miPersona.setCliente(estadoCliente);
    }
    public static void consultarPersona(double cedula){
        Persona miPersona = new Persona();
        miPersona.getCedula();
        System.out.println(miPersona.getCedula());
    }
}