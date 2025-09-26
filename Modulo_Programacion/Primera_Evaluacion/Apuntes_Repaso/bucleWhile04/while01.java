
import java.util.Scanner;

public class while01 {
    
    public static void main (String[] args) {


        // 1º- genero un nuevo scanner
        Scanner scanner = new Scanner(System.in);

        // 2º- aporto un primer mensaje que saldrá en pantalla al usuario
        System.out.println("Escribe un número al azar: ");

        // 3º- incorporo la posibilidad de interactuar del usuario con la consola
        int numero = scanner.nextInt();

        // 4º- formulo

        while (numero > 0 && numero <= 100) {

            System.out.println("El número " + numero + " está entre el 0 y el 100");

            numero = scanner.nextInt();

        } do while (numero > 100 && numero < 200) {

            numero = scanner.nextInt();
            
            System.out.println("El número " + numero + " está entre 100 y 200.");
            


        do while (numero > 200);

            numero = scanner.nextInt();

            System.out.println("El número " + numero + " es mayor que 200");
        


        do while (numero == 0);

            numero = scanner.nextInt();
            
            System.out.println("El número " + numero + " es cero.");

            System.out.println("");
            System.out.println("");
            
            
            
                    System.out.println("===============================");
                    System.out.println("* *** Fin del programa *** *");
                    System.out.println("===============================");
            
            
                    scanner.close();
                    
        }
    }
}
}
    



