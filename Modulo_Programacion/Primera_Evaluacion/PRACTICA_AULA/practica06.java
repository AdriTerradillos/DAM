
import java.util.Scanner;

public class practica06 {

    /**
        EJERCICIO 6 -> Escribir un programa que pida por teclado un número al usuario y diga si 
        es divisible por 3 o no.


     ==> Utilizaré *Scanner* para leer un número del usuario.
         Después usaré *IF* con el operador módulo (%) para verificar si es divisible por 3.

     */


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
System.out.println("");

        System.out.println("6. Escribir un programa que diga si un número introducido por teclado es divisible por 3:");

System.out.println("");

        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();

System.out.println("");
    
        System.out.println("**********************************");
        System.out.println("*** ¿DIVISIBLE ENTRE TRES? ******");
        System.out.println("**********************************");

        System.out.println("");

        if (numero % 3 == 0) {
            System.out.println(numero + " es divisible por 3.");
            
        } else {
            System.out.println(numero + " NO es divisible por 3.");
        }

System.out.println("");

        System.out.println("*** Fin del Programa ***");

System.out.println("");

        sc.close();
    }
}