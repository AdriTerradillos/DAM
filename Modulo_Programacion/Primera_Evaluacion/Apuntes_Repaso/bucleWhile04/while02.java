import java.util.Scanner;

public class while02 {

    public static void main (String[] args) {

        Scanner teclado = new Scanner (System.in);

        int tecla = 9;

        while(tecla != 0) {
            System.out.println("Escribe un entero. O salir: ");
            

            tecla = teclado.nextInt();

            System.out.println(tecla);
                 break;

        }

        System.out.println("");
        System.out.println("");
        

        System.out.println(" *** Fin del Programa ***");

    }
    
}
