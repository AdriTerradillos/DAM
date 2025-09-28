public class Ejercicio11 {
    

    // Ejercicio 11: Modificar el programa anterior para que tire dos dados de forma continuada hasta que salgan iguales. 
// También debe informar cuántas tiradas ha hecho.

/*
1. Usar un bucle while porque no sé cuántas veces se repetirá.
2. Generar dos números aleatorios entre 1 y 6 en cada tirada.
3. Contar el número de intentos con una variable.
4. Mostrar ambos números en cada tirada.
5. Parar cuando los dos dados sean iguales y mostrar cuántas tiradas fueron necesarias.
*/


 public static void main(String[] args) {

        int dado1, dado2;
        int tiradas = 0;

        do {
            dado1 = (int) (Math.random() * 6) + 1;
            dado2 = (int) (Math.random() * 6) + 1;
            tiradas++;

            System.out.println("Tirada " + tiradas + ": " + dado1 + " y " + dado2);
            
        } while (dado1 != dado2);

        System.out.println("¡Dados iguales! Ha costado " + tiradas + " tiradas.");

        
    }

}

