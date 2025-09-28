import java.util.Scanner;

public class Ejercicio08 {
    

    // Ejercicio 8: Escribir un programa que reciba el importe de una cantidad a pagar y el número de meses, y devuelva el pago mensual

/*
1. Pedir al usuario el importe total y el número de meses usando Scanner.
2. Dividir el importe entre el número de meses para obtener el pago mensual.
3. Redondear el resultado a dos decimales usando String.format.
4. Mostrar el pago mensual por pantalla.

*/


public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el importe total en euros: ");
        double importe = teclado.nextDouble();
        System.out.print("Introduce el número de meses: ");
        int meses = teclado.nextInt();
        
        double pagoMensual = importe / meses;
        System.out.printf("El pago mensual será: %.2f euros%n", pagoMensual);



        teclado.close();
    }

    
}

