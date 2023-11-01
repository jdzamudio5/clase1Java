package EjerciciosArray;

public class EjemploArray {

    public static void main(String[] args) {
        int [] num={5,10,3,8,15,7,2,9,1,6}; //Creación del array
        int sumar=0;
        /*
        //1.Suma de elementos

        for(int i=0;i<num.length;i++){
            sumar+=num[i];
        }
        System.out.println("Suma es: "+sumar);
        */

        /*
        //2.Promedio de Elementos

        for (int i=0;i<num.length;i++){
            sumar+=num[i];
        }
        double promedio=(double)sumar/num.length;
        System.out.println("El promedio es: "+promedio);
         */

        //3. Elemento maximo
        /*
        int maximo = num[0];
        for (int i=1;i<num.length;i++) {
            if (num[i]>maximo) {
                maximo=num[i];
            }
        }
        System.out.println("El máximo es: "+maximo);
         */

        //4. Elemento minimo
        /*
        int minimo = num[0];
        for (int i=1;i<num.length;i++) {
            if (num[i]<minimo) {
                minimo=num[i];
            }
        }
        System.out.println("El máximo es: "+minimo);
         */

        //5. Validar su un numero es primo
        /*
        for (int val:num) {
            boolean primo = true; // asumo que el numero es primo desde el inicio
            if (val <= 1) { // verifico si el numero es menor o igual a 1
                primo = false; // no es primo si es menor o igual a 1
            } else { // verifico si el numero se puede divir
                for (int i = 2; i*i<=val;i++) {
                    if (val%i==0) {
                        primo = false; // no es primo si se divido por algun numero
                        break;// salgo del bucle cuando encuentre se divida
                    }
                }
            }
            if (primo) {// imprime si es primo
                System.out.println(val+" es primo");
            }
         */



        }
    }

