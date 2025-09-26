import java.util.Scanner;

public class practica14 {
    

    /*

        EJERCICIO 14 -> . Escribir un programa que nos pida dos números por teclado y genere un número aleatorio
        comprendido entre ambos. Por el momento no te preocupes de que el primer número
        siempre debería de ser menor que el segundo, simplemente no los metas en un orden
        incorrecto

        => Llamaré al metodo Scanner donde se recogerá la información tecleada del usuario
            acerca del primer y segundo valor. 

            Después, se hallará un número aleatorio entre ambos valores a partir del parseo y el 
            método Math.random.


     */


     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();

        
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();


        // Generamos número aleatorio entre num1 y num2 
        int aleatorio = (int)(Math.random() * (num2 - num1 + 1)) + num1;

        System.out.println("Número aleatorio entre " + num1 + " y " + num2 + ": " + aleatorio + ".");



        scanner.close();
    }

}
