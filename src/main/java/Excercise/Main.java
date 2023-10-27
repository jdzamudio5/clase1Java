package Excercise;

public class Main {


    public static void main(String[] args) {

    String name="";
    int numero=0;
    float ft=1.1f;
    char ch='a';
    boolean tr=true;

    int x,y,z,sum,res,mult=0;
    float mod=0;
    String dia,noche;
    dia="lunes";
    noche="martes";

    x=4;
    y=11;
    z=4;

    sum=x+y+z;
    System.out.println(sum);
    res=x-y-z;
    System.out.println(res);
    mult=x*y*x;
    System.out.println(mult);
    mod=y%x;
    System.out.println(mod);

    boolean a,b,c,iguales;
    a=x<y;
    b=x>y;
    c=(x-y)<z;
    iguales=dia.equals(noche);

    System.out.println(iguales);




    }

}
