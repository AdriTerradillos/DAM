public class Ejercicio09 {
    

    // Ejercicio 9: Escribir un programa que genere un número aleatorio entre 0 y 50 y lo muestre

/*
1. Usar la clase Math.random() para generar un número aleatorio.
2. Multiplicar el resultado por 51 para que esté entre 0 y 50 inclusive.
3. Convertirlo a entero usando (int) y mostrarlo por pantalla.

*/

 public static void main(String[] args) {

        int aleatorio = (int) (Math.random() * 51);
        System.out.println("Número aleatorio entre 0 y 50: " + aleatorio);


    }

    
}

