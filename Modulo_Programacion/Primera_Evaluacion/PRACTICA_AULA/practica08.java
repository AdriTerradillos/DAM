import java.util.Scanner;

public class practica08 {

     /**
        EJERCICIO 8 -> Escribir un programa que reciba por teclado el importe de una cantidad a pagar en euros
        (puede tener decimales) y el número de meses que contamos para pagarla (tiene que ser un
        número entero) y nos devuelva el dinero que tendríamos que pagar cada mes. No aplicamos
        intereses de ningún tipo y redondeamos a dos decimales.


     ==> Utilizaré *Scanner* para leer el importe estipulado por el usuario y
         también haré lo mismo para deducir el número de meses totales en abonarlo.
         Después, crearé la variable cuota para deducir con los datos obtenidos, el importe
         mensual a pagar.
        
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos el importe total
        System.out.print("Introduce el importe [en €]: ");
        double importe = sc.nextDouble();

        // Pedimos el número de meses
        System.out.print("Introduce el número de meses: ");
        int meses = sc.nextInt();

        // Calculamos la cuota mensual
        double cuota = importe / meses;

        // Mostramos el resultado con 2 decimales
        System.out.printf("Cada mes tendrás que pagar: %.2f €%n", cuota + ".");

        sc.close();
    }
}
