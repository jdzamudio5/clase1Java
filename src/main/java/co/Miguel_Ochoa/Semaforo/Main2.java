package co.Miguel_Ochoa.Semaforo;
import java.util.Random;
public class Main2 {
    public static void main(String[] args) {
        String[] colores = {"Rojo", "Amarillo", "Verde"};
        boolean carroDetenido = true; // El carro comienza detenido
        Random random = new Random();

        // Simulamos el cambio de color del semáforo
        for (int i = 0; i < 5; i++) { // Realizamos 10 cambios de color
            int indiceAleatorio = random.nextInt(colores.length); // Genera un índice aleatorio
            String colorSemaforo = colores[indiceAleatorio];
            System.out.println("El semáforo está en " + colorSemaforo);

            if (colorSemaforo.equals("Rojo")) {
                System.out.println("Los peatones pueden cruzar y los carros deben detenerse");
                carroDetenido = true; // Detenemos el carro
                // Espera un tiempo antes de cambiar a Amarillo
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else if (colorSemaforo.equals("Amarillo")) {
                System.out.println("Los peatones se deben preparar para cruzar y los vehiculos deben bajar la velocidad");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("El carro puede avanzar y los peatones se deben detener");
                carroDetenido = false; // El carro avanza
                // Espera un tiempo antes de cambiar a Rojo
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
