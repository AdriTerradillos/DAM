import java.util.Scanner;

public class practica13 {
    

    /*

        EJERCICIO 13 -> Modifica el programa anterior para que no admita dados con un número de caras impares
        (¡no existen!). En el caso de meter un número impar de caras el programa debería de
        informarnos de que es erróneo y volver a preguntarnos por este dato.

        => Llamaré al metodo Scanner donde se recogerá la información tecleada del usuario
            acerca de la cantidad de dados y de caras de los mismos.

            Después, generaré un condicional if para otorgar la orden de que los valores de tirada sean pares.
            A continuación, plantearé una estructura for que sólo ejecutará la orden ante los valores pares.


     */

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos dados quieres tirar?: ");
        int numDados = scanner.nextInt();

        int caras;
        do {
            System.out.print("¿De cuántas caras son los dados? (solo pares): ");
            caras = scanner.nextInt();

            if (caras % 2 != 0) {
                System.out.println("Error: los dados no pueden tener un número impar de caras.");
            }

        } while (caras % 2 != 0);

        for (int i = 1; i <= numDados; i++) {

            int tirada = (int)(Math.random() * caras) + 1;
            System.out.println("🎲 Dado " + i + ": " + tirada);
        }

        scanner.close();
    }
}
