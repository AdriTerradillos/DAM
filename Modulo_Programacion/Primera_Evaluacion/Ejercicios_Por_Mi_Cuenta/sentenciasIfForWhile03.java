package Primera_Evaluacion.Ejercicios_Por_Mi_Cuenta;

public class sentenciasIfForWhile03 {
    
    public static void main (String[] args) {


        /**
         === Sentencias If - For - While

          --> if: condicional
          --> for: bucles
          --> while: bucles

         */


System.out.println("");
System.out.println("");


         // Ejercicio 1 (condicional if)

         System.out.println(" ***********************************");
        System.out.println(" *** Ejercicio 1: Condicional IF ***"); 
        System.out.println(" ***********************************");


System.out.println("");

         double valor1 = 12.4;
         int valor2 = 21;

         if (valor1 > valor2) {
            System.out.println("El número " + valor1 + "es mayor que el número " + valor2);


          } else if(valor1 < valor2) {
                System.out.println("==> El número " + valor2 + " es mayor que el número " + valor1);
        }


System.out.println("");
System.out.println("");


        // Ejercicio 2 (bucle for)

        System.out.println(" *******************************");
        System.out.println(" *** Ejercicio 2: Bucle FOR ***"); 
        System.out.println(" *******************************");


System.out.println("");

        int i;

        for (i = 3; i < 60; i++) {
            System.out.println(i + 3);

        }


System.out.println("");
System.out.println("");
        

        // Ejercicio 3 (bucle while)

        System.out.println(" ***********************************");
        System.out.println(" *** Ejercicio 3: Bucle WHILE ***"); 
        System.out.println(" ***********************************");


System.out.println("");

        int numero = 4;

        while (numero <= 10) {
            System.out.println(numero++);
        }


        // CAMBIO EL VALOR DE LA VARIABLE numero
        numero = 11;

        while (numero <=10) {
            System.out.println("Este comando no se va a ejecutar. 11 NO es menor que 10.");

        }

        if (numero > 10) {
            System.out.println("==> Este comando SÍ se va a ejecutar. 11 SÍ es mayor que 10.");

        }


        





        
    }
}