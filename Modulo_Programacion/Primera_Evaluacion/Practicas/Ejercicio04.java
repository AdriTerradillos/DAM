public class Ejercicio04 {
    

// Ejercicio 4: Escribir un programa donde se muestren todos los números divisibles por 7 menores a 10000

/*

1. Usaré un bucle for que vaya desde 1 hasta 9999.
2. Para cada número, comprobaré si es divisible por 7 usando el operador %.
3. Si es divisible, lo muestro por pantalla.

*/

    
    public static void main(String[] args) {

        for (int i = 1; i < 10000; i++) {

            if (i % 7 == 0) {
             System.out.println(i);

         
            }
            
        }

        
    }

}


