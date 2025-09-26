
public class practica04 {

    /**
     
        EJERCICIO 4 -> Escribir un programa donde se muestren todos los números divisibles por 
        7 menores a 10000
     
        ==> Emplearé un *BUCLE FOR* para recorrer los números del 1 al 9999.
            Dentro del bucle, un *IF* con el operador *%* identificará si es divisible por 7.
            ¡Manos a la obra!
     */

    public static void main(String[] args) {
    
System.out.println("");

        System.out.println("4. Escribir un programa donde se muestren todos los números divisibles por 7 menores a 10000:");

System.out.println("");

        System.out.println("**********************************");
        System.out.println("*** NÚMEROS DIVISIBLES POR 7 ***");
        System.out.println("**********************************");

System.out.println("");

        for (int i = 1; i < 10_000; i++) {

            if (i % 7 == 0) {
                System.out.println(i + " es divisible por 7");
            }
        }

System.out.println("");

        System.out.println("*** Fin del Programa ***");

System.out.println("");



    }
}