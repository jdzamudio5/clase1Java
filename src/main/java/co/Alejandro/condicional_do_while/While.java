package co.Alejandro.condicional_do_while;

public class While {

    public static void main(String[] args) {
        int numero =2;
        int conta =1;
        int resultado;

        do {

            resultado=numero*conta;
            System.out.println(numero +" x "+conta +" ="+resultado);
            conta++;
        } while (conta <=10);
    }
}