import java.util.Scanner;

public class practica12 {

/**
 
        EJERCICIO 12 -> Escribir un programa que sirva como asistente para un juego de rol. Tu programa debería de
        pedir por teclado el número de dados que se van a tirar y el número de caras de estos (4, 6,
        8, 12, etc.) A continuación debería de hacer la tirada y mostrarla.

        => Llamaré en primer lugar al método scanner, donde se recogerá la información tecleada del usuario
            acerca de la cantidad de dados y de caras de los mismos.

            Después, generaré un bucle for, ya qué tiraremos los dados de forma continuada, una detrás de otra, recogiendo
            así el resultado total del número de tiradas de manera aleatoria.


 */

    public static void main(String[] args) {

    
        Scanner scanner = new Scanner(System.in);

        // Pedimos los datos
        System.out.print("¿Cuántos dados quieres tirar?: ");
        int numDados = scanner.nextInt();

        System.out.print("¿De cuántas caras son los dados? (4, 6, 8, 12...): ");
        int caras = scanner.nextInt();

        // Tiramos los dados
        for (int i = 1; i <= numDados; i++) {
            int tirada = (int)(Math.random() * caras) + 1;
            System.out.println("🎲 Dado " + i + ": " + tirada);
        }

        scanner.close();
    }

}


