import java.util.Scanner;

public class Scanner01 {

    public static void main (String[] args) {

  
      // System.out.println("*** Conociendo la clase Scanner ***");

        /**
         --> Paso a paso
          1º- Declaro la variable 'Scanner' + [nombreVariable];
           Genero, un new Scanner, a partir de [nombreVariable] --> nuevo objeto;
          3º- De igual forma, genero una variable String y la asociamos al 
            [nombreVariable] del Scanner

           Vamos ahora a generar algunas variables aleatorias como las siguientes
         */


// 1º- Declaro la variable 'Scanner' + [nombreVariable];
// Genero, un new Scanner, a partir de [nombreVariable];(EN LA MISMA LÍNEA)

Scanner teclado = new Scanner(System.in);


// Aportamos un mensaje previo que saldrá en la terminal que le aparecerá al usuario

System.out.println("Escribe tu nombre: ");


// 3º- De igual forma, genero una variable String y la asociamos al [nombreVariable] del Scanner 
// el usuario escribirá su nombre en la línea siguiente

String nombre = teclado.nextLine();


// 4º- Una vez el usuario escribe su nombre y da ENTER, aparece el siguiente mensaje

System.out.println("Tu nombre es: " + nombre);

System.out.println("*** Fin del programa ***");

teclado.close();

    }
}