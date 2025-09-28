import java.util.Scanner;


public class Ejercicio05 {
    

    // Ejercicio 5: Escribir un programa que pida por teclado un número al usuario y diga si es par o impar

/*

1. Pedir al usuario que introduzca un número por teclado usando Scanner.
2. Comprobar si el número es divisible entre 2 usando el operador %.
3. Si el residuo es 0, mostrar "par". Si no, mostrar "impar".

*/

 public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num = teclado.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("El número es par.");

        } else {
            System.out.println("El número es impar.");
        }


    teclado.close();

    }


}


