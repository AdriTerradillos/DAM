// numero par o impar? A partir de condicional if-else if- else + Scanner

import java.util.Scanner;

public class ScannerCombinado02 {

    /** Guía Ejercicio por pasos...
     
     1º- Creamos el objeto Scanner para leer desde la terminal
     2º- Pediremos el primer número
     3º- Pediremos el siguiente número
     4º- Comprobamos cada una de las posibilidades que indiquen si primer y segundo
     número son par o impar (condicional)
      
     */

    public static void main (String[] args) {

        // Objeto scanner
        Scanner scanner = new Scanner(System.in);

        // Pedir primer número
        System.out.println("Escribe el primer número: ");
        int valor1 = scanner.nextInt();

        // Pedir segundo número
        System.out.println("Escribe el segundo número: ");
        int valor2 = scanner.nextInt();


System.out.println("");


        // Comprobar si números son par o impar


        // if [primer número]

        if (valor1 % 2 == 0) {
            System.out.println("El primer número, [ " + valor1 + " ], es par.");
            
        } else {
            System.out.println("El primer número, [ " + valor1 + " ], es impar.");
        }

        // if [segundo número]

        if (valor2 % 2 == 0) {
            System.out.println("El segundo número, [ " + valor2 + " ],  es par.");

        } else {
            System.out.println("El segundo número, [ " + valor2 + " ], es impar.");
        }


System.out.println("");


        System.out.println(" *** Fin del programa ***");


        scanner.close();

    }
}