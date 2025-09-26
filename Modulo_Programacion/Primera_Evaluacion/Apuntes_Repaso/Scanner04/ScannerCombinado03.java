// EJERCICIO: SCANNER + CONDICIONAL IF --> AÑADIR 2 NUMEROS Y PEDIR A LA CONSOLA QUE NOS INDIQUE CUAL
// DE LOS DOS ES MAYOR QUE EL OTRO

import java.util.Scanner;

public class ScannerCombinado03 {

    /** Guía Ejercicio por pasos...
     
      1º- Creamos el objeto Scanner para leer desde la terminal
      2º- Pediremos el primer número 
      3º- Pediremos el segundo número
      4º- Sumamos los dos números
      5º- Comprobamos que número es el mayor (condicional if) 

     */


    public static void main (String[] args) {
    

        // Objeto Scanner

        Scanner scanner = new Scanner(System.in);


        // Pedir primer número

        System.out.println("Tecleé el primer valor numérico: ");
        int valor1 = scanner.nextInt();


        // Pedir segundo número

        System.out.println("Tecleé el segundo valor numérico: ");
        int valor2 = scanner.nextInt();


        // Sumar ambos números

        int suma = valor1 + valor2;
        System.out.println("La suma de los dos números es: " + suma);


         System.out.println("");


        // Comprobar que número es mayor

        if (valor1 > valor2) {
            System.out.println("El primer valor númerico [ " + valor1 + " ] es mayor que el segundo valor numérico [ " + valor2 + " ]");

        } else if (valor2 > valor1) {
            System.out.println("El segundo valor numérico [ " + valor2 + " ] es mayor que el primer valor numérico [ " + " ]");

        } else {
            System.out.println("Ambos números son iguales.");
        }

        System.out.println("");
        System.out.println("");

        System.out.println("*** Fin del programa ***");
        scanner.close();

    
        

    }
    
}
