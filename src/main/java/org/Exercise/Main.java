package org.Exercise;

public class Main {
    public static void main(String[] args) {
        //operadores lógicos
        int x,y,z, res=0, mult=0, mod=0;
        String dia, noche;

        dia="lunes";
        noche="si";

        x=3;
        y=5;
        z=4;

        res=x+y+z;
        System.out.println(res);
        res=x-y-z;
        System.out.println(res);
        mult=x*y*z;
        System.out.println(mult);

        mod=x%y;
        System.out.println(mod);

        boolean a,b,c,iguales;
        a=x<y;
        b=x>y;
        c=(x-y)<z;
        //== comparación solo valores numéricos
        // string equalsTo
        iguales=dia.equals(noche);

        System.out.println(iguales);
    }
}
