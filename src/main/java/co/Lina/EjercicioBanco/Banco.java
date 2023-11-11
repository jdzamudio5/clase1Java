package co.Lina.EjercicioBanco;

public class Banco {
    Cuenta[] cuentas;
    int cantidadCuentas;

    public Banco(int cantidad){
        cuentas=new Cuenta[cantidad];
        cantidadCuentas=0;
    }

    public  void crearCuenta(Cliente usuario, double saldo){
        if(cantidadCuentas < cuentas.length){
            cuentas[cantidadCuentas]=new Cuenta(usuario, saldo);
            cantidadCuentas++;
            System.out.println("Cuenta creada");
        }else{
            System.out.println("No se puede crear");
        }
    }

    public Cuenta saldoCuenta(int numCuenta){
        if (numCuenta>=1 && numCuenta<=cantidadCuentas ) {
            return cuentas[numCuenta-1];
        }
        return null;
    }

    public int conocernumCuenta(int numIdentificacion) {
        for (int i=0;i<cantidadCuentas;i++) {
            if (cuentas[i].getUsuario().getNumero_Identificacion()==numIdentificacion) {
                return i+1;
            }
        }
        return -1;
    }
}
