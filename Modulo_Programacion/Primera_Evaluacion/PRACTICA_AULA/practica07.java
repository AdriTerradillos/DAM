

import java.util.Scanner;

public class practica07 {

    /**
        EJERCICIO 7 -> Escribir un programa que pida un número por teclado al usuario que simule ser 
        el precio de un artículo y escriba el resultado de aplicarle el IVA del 21%
     
     ==> Pediré al usuario un precio por teclado (puede tener decimales).
         Aplicaré el 21% de IVA y mostraré el precio final.
         
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

System.out.println("");
System.out.println("");

        System.out.print("Introduce el precio del artículo (sin IVA): ");
        double precio = sc.nextDouble();

        double precioConIVA = precio * 1.21;

System.out.println("");

        System.out.println("  **********************************");
        System.out.println("**** 💰 PRECIO CON IVA APLICADO 💰 ****");
        System.out.println("  **********************************");

System.out.println("");

        System.out.printf("Precio original: %.2f €\n", precio);
        System.out.printf("Precio con IVA (21%%): %.2f €\n", precioConIVA);

System.out.println("");

        System.out.println("*** Fin del Programa ***");

System.out.println("");



    }


}
