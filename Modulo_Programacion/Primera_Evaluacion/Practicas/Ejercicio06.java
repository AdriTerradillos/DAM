import java.util.Scanner;


public class Ejercicio06 {
    

// Ejercicio 6: Escribir un programa que pida por teclado un número al usuario y diga si es divisible por 3 o no

/*
1. Pedir al usuario que introduzca un número usando Scanner.
2. Comprobar si el número es divisible entre 3 usando el operador %.
3. Si el residuo es 0, mostrar que es divisible por 3. Si no, mostrar que no lo es.
*/


public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num = teclado.nextInt();
        
        if (num % 3 == 0) {
            System.out.println("El número es divisible por 3.");

        } else {
            System.out.println("El número no es divisible por 3.");

        }

        teclado.close();
    }
}


