import java.util.Scanner;

public class ScannerCombinado04 {
    
    public static void main(String[] args) {


System.out.println("");


        System.out.println( "***********************************");
        System.out.println("FORMULARIO - ATENCIÓN AL CLIENTE ");
        System.out.println( "***********************************");


System.out.println("");


        Scanner scanner = new Scanner(System.in);

        System.out.println("· Ingrese su nombre completo: ");
        String usuario1 = scanner.nextLine();
    


System.out.println("");


        System.out.println("· Ingrese su edad actual: ");
        int edad1 = scanner.nextInt();


System.out.println("");


System.out.println("· Anote sus ingresos brutos anuales: ");
double Bruto1 = scanner.nextInt();


System.out.println("");


        System.out.println("· Ingrese su país de residencia: ");
        String pais1 = scanner.next();
        

System.out.println("");


        System.out.println("· Ingrese la ocupación profesional que desarrolla: ");
        String ocupacion1 = scanner.next();


System.out.println("");


        System.out.println(" ==> Mi nombre es [ " + usuario1 + " ] Tengo [ " + edad1 + " ] años. " +
        "Vivo en [ " + pais1 + " ]. Trabajo de [ " + ocupacion1 + " ] Anualmente gano [ " + Bruto1 +
        " ]€ al año." );


System.out.println("");
System.out.println("");

        System.out.println("*** Final del formulario, gracias por su tiempo :3 *** ");

        scanner.close();
    }
}
