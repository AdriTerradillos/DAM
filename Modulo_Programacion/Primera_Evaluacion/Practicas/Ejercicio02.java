public class Ejercicio02 {
    

// Ejercicio 2: Escribir un programa donde se muestren los 50 primeros números pares

/*

1. Voy a usar un bucle for que cuente del 1 al 50 porque quiero 50 números.
2. En cada vuelta, calculo el número par multiplicando el contador por 2.
3. Muestro ese número por pantalla.

*/

 public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {
            int par = i * 2;

            System.out.println(par);
        }


    }
}

