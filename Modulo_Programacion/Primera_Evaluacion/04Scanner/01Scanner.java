public class 01Scanner {

    public static void main (String[] args) {

        /**
         --> Paso a paso
          1º- Declaro la variable 'Scanner' + [nombreVariable];
          2º- Genero, un new Scanner, a partir de [nombreVariable];
          3º- De igual forma, genero una variable String y la asociamos al 
            [nombreVariable] del Scanner
           Vamos ahora a generar algunas variables aleatorias como las siguientes
         */


// 1º- Declaro la variable 'Scanner' + [nombreVariable];

Scanner teclado;

// 2º- Genero, un new Scanner, a partir de [nombreVariable];

Scanner teclado = new Scanner(System.in);


// Aportamos un mensaje previo que saldrá en la terminal que le aparecerá al usuario

System.out.println("Escribe tu nombre: ");


// 3º- De igual forma, genero una variable String y la asociamos al [nombreVariable] del Scanner 
// el usuario escribirá su nombre en la línea siguiente

String nombre = teclado.nextLine();


// 4º- Una vez el usuario escribe su nombre y da ENTER, aparece el siguiente mensaje

System.out.println("Tu nombre es: " + nombre);

teclado.close():
    }
}