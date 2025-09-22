package Primera_Evaluacion.PRACTICA;

import java.util.Scanner;

public class practica05 {

    /**
     
     ==> Utilizaré *Scanner* para pedir un número por teclado.
         Luego emplearé una estructura *IF-ELSE* con el operador módulo (%) para
             determinar si el número es *par* o *impar*. ¡Vamos allá!
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
System.out.println("");

        System.out.println("5. Escribir un programa que pida por teclado un número al usuario y diga si es par o impar:");

System.out.println("");

        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();

System.out.println("");

        System.out.println("**********************************");
        System.out.println("******** PAR O IMPAR ************");
        System.out.println("**********************************");

System.out.println("");

        if (numero % 2 == 0) {
            System.out.println(numero + " es un número par");

        } else {
            System.out.println(numero + " es un número impar");
        }

System.out.println("");

        System.out.println("*** Fin del Programa ***");

System.out.println("");

        sc.close();
    }
}