// EJERCICIO: SCANNER + CONDICIONAL IF --> AÑADIR 2 NUMEROS Y PEDIR A LA CONSOLA QUE NOS INDIQUE CUAL
// DE LOS DOS ES MAYOR QUE EL OTRO

import java.util.Scanner;

public class ScannerCombinado03 {

    public static void main(String[] args) {
        
        Scanner numeroMayor = new Scanner(System.in);

        System.out.println("Escribe el primer número: ");

        String valor1 = numeroMayor.nextLine();

        System.out.println("EL primer valor es: " + valor1);


        String valor2 = numeroMayor.nextLine();
        System.out.println("El segundo valor es: " + valor2);


        // genero el condicional if:

        if (valor1 > valor2) {
            System.out.println("El número " + valor1 + "es mayor que el número " + valor2);

            
        } else {
            System.out.println("El número " + valor2 + "es mayor que el número " + valor1);
        }
    
        

    }
    
}
