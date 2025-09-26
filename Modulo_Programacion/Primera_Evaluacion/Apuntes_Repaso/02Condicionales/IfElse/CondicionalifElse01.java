public class CondicionalifElse01 {

    public static void main(String[] args) {

        // ----------------------------------------
        // EJERCICIO 1: Condicional IF - ELSE IF - ELSE
        // ----------------------------------------

        int edad = 18;

        if (edad < 18) {
            System.out.println("Tienes menos de 18 años.");
        } else if (edad == 18) {
            System.out.println("Tienes exactamente 18 años.");
        } else {
            System.out.println("Tienes más de 18 años.");
        }

        System.out.println("Fin del programa.");

        // ----------------------------------------
        // EJERCICIO 2: Sociedad de clases
        // ----------------------------------------

        // Rango de clases según sueldo
        int claseBaja = 1000;
        int claseMedia = 2500;
        int claseAlta = 10000;

        // Sueldos de personas
        int sueldoAntonio = 2100;
        int sueldoMarta = 1250;
        int sueldoSandra = 11500;

        // ---- Sueldo Antonio ----
        if (sueldoAntonio < claseBaja) {
            System.out.println("Antonio está en la clase baja.");
        } else if (sueldoAntonio < claseMedia) {
            System.out.println("Antonio está en la clase media.");
        } else if (sueldoAntonio < claseAlta) {
            System.out.println("Antonio está entre clase media y alta.");
        } else {
            System.out.println("Antonio está en la clase alta.");
        }

        // ---- Sueldo Marta ----
        if (sueldoMarta < claseBaja) {
            System.out.println("Marta está en la clase muy baja.");
        } else if (sueldoMarta < claseMedia) {
            System.out.println("Marta está en la clase baja-media.");
        } else if (sueldoMarta < claseAlta) {
            System.out.println("Marta está en la clase media.");
        } else {
            System.out.println("Marta está en la clase alta.");
        }

        // ---- Sueldo Sandra ----
        if (sueldoSandra < claseBaja) {
            System.out.println("Sandra está en la clase baja.");
        } else if (sueldoSandra < claseMedia) {
            System.out.println("Sandra está en la clase media.");
        } else if (sueldoSandra < claseAlta) {
            System.out.println("Sandra está entre clase media y alta.");
        } else {
            System.out.println("Sandra está en la clase alta.");
        }

        // Decoración visual
        System.out.println("**************************************************");
        System.out.println("***************** FIN DEL CÓDIGO *****************");
        System.out.println("**************************************************");
    }
}