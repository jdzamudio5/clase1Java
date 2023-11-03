package co.Alejandra.cicloWhile;

public class Main {
    public static void main(String[] args) {
        int num []= {5,10,3,8,15,7,2,9,1,6};
        int indice=0;

       while (indice<num.length){
            int valor = num[indice];
           System.out.println("Valor posicion"+indice+": "+valor);
           indice++;
       }

       //Tabla del 2 con ciclo while
        int i=1;
        int producto;
        while (i<=10){
            producto=i*2;
            System.out.println(producto);
            i++;
        }

    }
}
