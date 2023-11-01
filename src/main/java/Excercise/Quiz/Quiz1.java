package Excercise.Quiz;

import javax.swing.*;

public class Quiz1 {

    public static void main(String[] args) {

        int[] numeros={5,6,8,9,4,3,7,8};
        int suma=0,minimo=numeros[0],maximo=0;

// sumatoria de los numeros
        for (int i=0; i< numeros.length; i++){
            suma+=numeros[i];
        }
        JOptionPane.showMessageDialog(null,"La suma de los datos del array es: "+suma);

//promedio
        double promedio = (double) suma/ numeros.length;
        JOptionPane.showMessageDialog(null,"el promedio del array es: "+promedio);

// minimo

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

        JOptionPane.showMessageDialog(null,"el numero menor del array es: "+ minimo);

//Maximo
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }
        JOptionPane.showMessageDialog(null,"el numero mayor del array es: "+ maximo);




// Saber si un numero es primo o no

        int c=0,i=1,j=0;

        do {

                for(i = 1; i < numeros.length; i++)
                {
                    if((numeros[j] % i) == 0)
                    {
                        c++;
                    }
                }

                if(c <= 2)
                    {
                            System.out.println("El numero: "+numeros[j]+" es primo");
                            c=0;
                    }else{
                            System.out.println("El numero: "+numeros[j]+" no es primo");
                            c=0;
                        }
                j++;
        }while(j!= numeros.length);




//Reemplazar numeros primos con 0


        c=j=0;
        i=1;
        do {

            for(i = 1; i < numeros.length; i++)
            {
                if((numeros[j] % i) == 0)
                {
                    c++;
                }
            }

            if(c <= 2)
            {
               numeros[j]=0;
                c=0;
            }else{
                c=0;
            }
            j++;
        }while(j!= numeros.length);





// imprimir el arreglo


        for (int k=0; k< numeros.length; k++){

            System.out.println("El numero: "+numeros[k]+" esta en la posicion "+k+" Del Arreglo");

        }






    }





}
