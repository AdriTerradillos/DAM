public class practica11 {

    /*

        EJERCICIO 11 -> Modificar el programa anterior para que tu programa tire dos dados de forma continuada
        hasta que el número que salga en ambos sea el mismo. En ese momento debería de parar la
        ejecución e informarnos de cuantas tiradas ha tenido que hacer para llegar a ese resultado

        => Realizaré un proceso similar al ejercicio anterior; parseo int y multiplico por puntuación máxima 
        en suma con la puntuación mínima. Después, generaré un bucle do while hasta que el resultado de ambas 
        tiradas sea el mismo.

        
     */
    
         public static void main(String[] args) {

        int dado1, dado2;
        int tiradas = 0;

        do {
            dado1 = (int)(Math.random() * 6) + 1;
            dado2 = (int)(Math.random() * 6) + 1;
            tiradas++;
            System.out.println("🎲 Tirada " + tiradas + ": " + dado1 + " - " + dado2);

        } while (dado1 != dado2);

        System.out.println("✨ ¡Ha salido el mismo número!");
        System.out.println("Total de tiradas: " + tiradas);
    }

}
