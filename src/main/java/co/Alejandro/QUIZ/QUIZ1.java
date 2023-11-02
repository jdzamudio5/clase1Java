package co.Alejandro.QUIZ;
import java.util.Arrays;

public class QUIZ1 {
    public static void main(String[] args) {

        int suma=0;
        double promedio=0;
        int maximo=0;
        int minimo=16;


        int[] numeros={5,10,3,8,15,7,2,9,1,6};
        for(int i=0; i<numeros.length; i++){
            suma+=numeros[i];

            if (numeros[i]>maximo){
                maximo=numeros[i];
            }
            if (numeros[i]<minimo){
                minimo=numeros[i];
            }

            if (esprimo(numeros[i])){
                System.out.println("Numero primo:  "+numeros[i]);
                numeros[i]=0;

            }

        }

        System.out.println("La Suma es: "+suma);
        promedio=suma/Double.valueOf(numeros.length);
        System.out.println("El promedio es: "+promedio);
        System.out.println("El numero Maximo es: "+maximo);
        System.out.println("El numero Minimo es: "+minimo);
        System.out.println("Array final:  "+ Arrays.toString(numeros));

    }


    public static boolean esprimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;

    }

}
