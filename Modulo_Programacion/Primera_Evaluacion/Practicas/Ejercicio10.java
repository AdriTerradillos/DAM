public class Ejercicio10 {
 
    
    // Ejercicio 10: Escribir un programa que genere dos números aleatorios entre 1 y 6 (simulando dos dados)

/*
1. Generar dos números aleatorios entre 1 y 6 usando Math.random().
2. Convertir los resultados a enteros.
3. Mostrar los dos números por pantalla simulando la tirada de dos dados.
*/


public static void main(String[] args) {

        int dado1 = (int) (Math.random() * 6) + 1;
        int dado2 = (int) (Math.random() * 6) + 1;
        
        System.out.println("Tirada de los dos dados: " + dado1 + " y " + dado2);

        
    }


}
