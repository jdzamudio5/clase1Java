package co.Lina.EjercicioBanco;

public class Banco {
    Cuenta[] cuentas;
    int cantidadCuentas;

    public Banco(int cantidad){
        cuentas=new Cuenta[cantidad];
        cantidadCuentas=0;
    }

    public  void crearCuenta(int usuario, double saldo){
        if(cantidadCuentas < cuentas.length){
            cuentas[cantidadCuentas]=new Cuenta(usuario, saldo);
            cantidadCuentas++;
            System.out.println("Cuenta creada");
        }else{
            System.out.println("No se puede crear");
        }
    }

    public Cuenta obtenerNumeroCuenta(int numCuenta){
        if (numCuenta>=1 && numCuenta<=cantidadCuentas ) {
            return cuentas[numCuenta-1];
        }
        return null;
    }

    public boolean exiteCliente(Persona usuario,int numIdentificacion){

        for (int i = 0; i < cantidadCuentas; i++) {
            if (cuentas[i].getUsuario().getNombre().equals(usuario.getNombre()) &&
            cuentas[i].getUsuario().getApellido().equals(usuario.getApellido()) &&
            cuentas[i].getUsuario().getNumero_Identificacion()==numIdentificacion){
                return true;
            }
        }
        return false;
    }

    public Cuenta buscarCliente(int numIdentificacion){
        for (int i = 0; i < cantidadCuentas; i++) {
            if(cuentas[i].getUsuario().getNumero_Identificacion()==numIdentificacion){
                return cuentas[i];
            }
        }
        return null;
    }
}
