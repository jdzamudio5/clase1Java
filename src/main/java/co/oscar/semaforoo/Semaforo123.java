package co.oscar.semaforoo;

public class Semaforo123 {
    public static class Semaforo {
        public static void main(String[] arg) {
            String semaforo = "Amarillo";
            if (semaforo.equals("Rojo")) {
                System.out.println("Ojo no pasar");
            }
            else if (semaforo.equals("Verde")) {
                System.out.println("Puede Pasar");
            }
            else if (semaforo.equals("Amarillo")) {
                System.out.println("Ojo listo para Arrancar");
            }
            else {
                System.out.println("Ojo empiece a deternerse");
            }
        }
    }
}