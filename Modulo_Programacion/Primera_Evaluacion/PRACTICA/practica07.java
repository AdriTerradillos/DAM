package Primera_Evaluacion.PRACTICA;

import java.util.Scanner;

public class practica07 {

    /**
     
     ==> Pediré al usuario un precio por teclado (puede tener decimales).
         Aplicaré el 21% de IVA y mostraré el precio final.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

System.out.println("");

        System.out.println("7. Escribir un programa que simule el precio de un artículo con IVA del 21%:");

System.out.println("");

        System.out.print("Introduce el precio del artículo (sin IVA): ");
        double precio = sc.nextDouble();

        double precioConIVA = precio * 1.21;

System.out.println("");

        System.out.println("**********************************");
        System.out.println("**** PRECIO CON IVA APLICADO ****");
        System.out.println("**********************************");

System.out.println("");

        System.out.printf("Precio original: %.2f €\n", precio);
        System.out.printf("Precio con IVA (21%%): %.2f €\n", precioConIVA);

System.out.println("");

        System.out.println("*** Fin del Programa ***");

System.out.println("");



    }


}
