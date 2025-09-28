import java.util.Scanner;

public class Ejercicio07 {
    

    // Ejercicio 7: Escribir un programa que pida un número por teclado que simule ser el precio de un artículo y aplicarle el IVA del 21%

/*
1. Pedir al usuario que introduzca el precio del artículo usando Scanner.
2. Calcular el IVA multiplicando el precio por 0.21.
3. Sumar el IVA al precio original para obtener el precio final.
4. Mostrar el resultado por pantalla.

*/

 public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el precio del artículo: ");
        double precio = teclado.nextDouble();
        

        double precioFinal = precio * 1.21; // sumando el 21% de IVA
        System.out.println("El precio con IVA del 21% es: " + precioFinal);

    

        teclado.close();
    }



}



