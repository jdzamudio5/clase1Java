package co.andres.whileand;

public class Whileand {
    public static void main(String[] args) {

        int i=1;

        while (i<11){
            int mul=2*i;
            System.out.println(2+"*"+i+"="+mul);
            i++;
        }
        int j=1;
        do {
            System.out.println(j);
            j++;
        }
        while (j<6);

        int k=1;
        while (k<6){
            System.out.println(k);
            k++;
        }
    }
}
