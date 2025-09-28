import java.util.Scanner;


public class Ejercicio03 {

// Ejercicio 3: Escribir un programa donde se muestren los 5 primeros números múltiplos de uno dado por el usuario

/*

1. Pedir al usuario que introduzca un número por teclado usando Scanner.
2. Usar un bucle for que se repita 5 veces.
3. Multiplicar el número introducido por el contador del bucle para obtener los múltiplos.
4. Mostrar cada múltiplo por pantalla.

*/

public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num = teclado.nextInt();
        
        for (int i = 1; i <= 5; i++) {
            System.out.println(num * i);
        }

        teclado.close();
    }


}
