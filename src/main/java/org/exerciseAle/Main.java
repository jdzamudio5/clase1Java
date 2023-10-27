package org.exerciseAle;

public class Main {
    public static void main(String[] args) {
        int x,y,z, sum,res, mult=0;
        float mod;
        String dia,noche;

        x=4;
        y=12;
        z=4;
        dia="lunes";
        noche="si";

        sum=x+y+z;
        System.out.println(sum);
        res=x-y-z;
        System.out.println(res);
        mult=x*y*z;
        System.out.println(mult);
        mod=y%x;
        System.out.println(mod);

        boolean a,b,c,iguales;
        a=x<y;
        b=x>y;
        c=(x-y)<z;
        iguales=dia.equals(noche); //Comparación de igual igual con String

        System.out.println(iguales);

    }
}
