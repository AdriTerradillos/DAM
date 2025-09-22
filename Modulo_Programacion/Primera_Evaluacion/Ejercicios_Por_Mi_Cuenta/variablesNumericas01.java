package Primera_Evaluacion.Ejercicios_Por_Mi_Cuenta;

public class variablesNumericas01 {
    
    /*
    === NÚMEROS ENTEROS ===
    
    --> int
    --> byte
    --> long
    --> short
    
    === NÚMEROS DECIMALES ===
    
    --> float
    --> double
    
    */
    
    public static void main (String[] args) {
        

        // *** Ejercicio 1: Escribir un programa donde se muestren los 10 primeros números enteros ***
        
        
        
        // *** Ejercicio 1: Variable con enteros ***
        
        
        System.out.println("");
        
        System.out.println("**************************************");
        System.out.println(" ***  NÚMEROS ENTEROS ***");
        System.out.println("**************************************");
        
        System.out.println("");
        
        int edad = 32;
        int pulgadas = 45;
        
        System.out.println("=> Mauricio, el entrenador de baloncesto ¡es súper jóven! Tiene " + edad + " años.");
        System.out.println("=> La televisión de Carla se ve grande. Tiene " + pulgadas + " pulgadas.");
        System.out.println("=> Mauricio, socio de " + edad + " años, a comprado la televisión a Carla. Cuenta con " + pulgadas + " pulgadas.");
        
        
        System.out.println("");
        System.out.println("");
        
        
        // *** Ejercicio 2: Variable con decimales ***
        
        
        System.out.println("*********************************************");
        System.out.println(" *** Ejercicio 2: VARIABLE CON DECIMALES ***");
        System.out.println("*********************************************");
        
        System.out.println("");
        
        double metros = 189.3;
        float temperatura = 25F;
        
        System.out.println("=> Este edificio es el más alto de la ciudad. Tiene una altura de " + metros + " metros.");
        System.out.println("=> ¡Hace mucho calor en este restaurante! Oscilaremos los " + temperatura + " grados.");
        System.out.println("=> Dentro de este edificio hay un restaurante con una temperatura que supera los " + temperatura + " grados.");
        
        System.out.println("");
        System.out.println("");
        
        
        int i;
        
        for (i = 0; i == 10; i++) {
            System.out.println("A continuación, se muestran los 10 primeros números: " + i);
        }
        
    }
    
}
