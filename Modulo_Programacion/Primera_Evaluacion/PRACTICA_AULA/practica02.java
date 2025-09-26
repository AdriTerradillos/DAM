
public class practica02 {

    /**
     
        EJERCICIO 2 -> Escribir un programa donde se muestren los 50 primeros números pares.

         ==> Utilizaré un *BUCLE FOR* para hacer un recento calcular los 100 primeros números. 
            Dentro del bucle, anidaré un *CONDICIONAL IF* con el operador aritmético módulo(%), 
            para averiguar los 50 primeros números pares ¡Manos a la obra!


     */


    public static void main(String[] args) {
    
System.out.println("");

        System.out.println("2. Escribir un programa donde se muestren los 50 primeros números pares:\r");

System.out.println("");
System.out.println("");

        System.out.println("**********************************");
        System.out.println(" *** BUCLE FOR + ANIDACIÓN IF***");
        System.out.println("*********************************");

System.out.println("");

        int i;

        for (i = 0; i <= 50; i++) {

            if (i % 2 == 0) {
                System.out.println(i + " es par");

            } else {
                System.out.println(i + " es impar.");
            }


        }

System.out.println("");

    System.out.println("*** Fin del Programa ***");

System.out.println("");

}


}