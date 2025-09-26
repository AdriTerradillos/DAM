public class practica10 {
    
/*
    EJERCICIO 10 -> Escribir un programa que genere dos números aleatorios simultáneamente entre el 1 y el 6
    (simulando una tirada de dos dados)

    ==> Nuevamente, haré llamamiento del método 'Math.random()' parseando la variable int.
    Después, multiplico el método por la puntuación máxima del dado (6) sumado a la 
    puntuación mínima del dado (1)

 */

 public class Ejercicio10 {

    public static void main(String[] args) {

        int dado1 = (int)(Math.random() * 6) + 1;
        int dado2 = (int)(Math.random() * 6) + 1;

        System.out.println("🎲 Dado 1: " + dado1);
        System.out.println("🎲 Dado 2: " + dado2);
    }

}

}