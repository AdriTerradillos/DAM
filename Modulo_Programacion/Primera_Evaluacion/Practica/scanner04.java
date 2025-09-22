package Primera_Evaluacion.Practica;

import java.util.Scanner;

public class scanner04 {

    public static void main(String[] args) {


System.out.println("");

        System.out.println("*****************************");
        System.out.println("Ejercicio 1: *** SCANNER ***");
        System.out.println("*****************************");

System.out.println("");

        Scanner scanner = new Scanner(System.in);

        // primer mensaje
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

System.out.println("");

        // Segundo mensaje
        System.out.println("Ingrese su primer apellido: ");
        String apellido = scanner.nextLine();
        
System.out.println("");

        // Tercer mensaje
        System.out.println("Ingrese su edad actual: ");
        int edad = scanner.nextInt();

System.out.println("");

        // Tomamos en cuenta todas las respuestas anteriores para elaborar el resultado final
        System.out.println("Buenas! Mi nombre es  [ " + nombre + " ] [ " + apellido + " ]. Mi edad actual es de [ "  + edad + " ] años.");








    }
    
}
