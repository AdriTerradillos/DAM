public class practica09 {

    /** 
        EJERCICIO 9 -> Escribir un programa que genere un número aleatorio entre 
        el 0 y el 50 y lo muestre

        ==> Parsearé el valor de la variable int. Después, generaré el método
        Math.random, multiplicando este por +1 al valor de 50.
 
     */



    public static void main(String[] args) {

        int numero = (int)(Math.random() * 51); // de 0 a 50
        System.out.println("Número aleatorio entre 0 y 50: " + numero);
    }
}
