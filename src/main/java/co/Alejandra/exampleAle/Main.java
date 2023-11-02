package co.Alejandra.exampleAle;
public class Main {
    public static void main(String[] args) {
        String letra="";
        letra="Hola";
        System.out.println(letra);

        int x;
        x=0;
        System.out.println(x);

        float f;
        f=5.5f;
        System.out.println(f);

        boolean b;
        b=true;
        System.out.println(b);

        char c;
        c='a';
        System.out.println(c);

        //Convertir un float a String
        String f2=Float.toString(f);

        //Concatenar
        String union=letra+" "+c+" "+f2;
        System.out.println(union);
    }
}
