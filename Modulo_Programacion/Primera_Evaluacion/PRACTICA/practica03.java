package Primera_Evaluacion.PRACTICA;

import java.util.Scanner;

public class practica03 {

    /**
     
     ==> Utilizaré la clase *Scanner* para pedir al usuario un número por teclado.
         Luego emplearé un *BUCLE FOR* para calcular los 5 primeros múltiplos de ese número.
            ¡Manos a la obra!
     */

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
System.out.println("");

        System.out.println("3. Escribir un programa donde se muestren los 5 primeros múltiplos de uno dado por el usuario:");

System.out.println("");
        
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();
        
System.out.println("");

        System.out.println("**********************************");
        System.out.println("  *** MULTIPLOS CON BUCLE FOR ***");
        System.out.println("**********************************");

System.out.println("");

        for (int i = 1; i <= 5; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

System.out.println("");

        System.out.println("*** Fin del Programa ***");

System.out.println("");
        
        sc.close();
    }
}





