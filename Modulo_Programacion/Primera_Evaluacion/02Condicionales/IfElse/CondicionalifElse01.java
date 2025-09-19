public class CondicionalifElse01 {


public static void main(String[] args) {

/**
 * Condicional IF - ELSE IF - ELSE (TEORÍA GENERAL)
 * 1. Compruebo: ¿El condicional if es correcto? No, paso al else / Si (FIN)
 * 2. Compruebo: ¿Ahora el condicional else es correcto? No, paso a else / Sí (FIN)
 * 3. Compruebo: Por último compruebo: ¿Este último condicional es correcto? Debería ser correcto, SI (FIN)
 **/


// asignamos una variable
int edad = 18;

// probaremos si es correcto que la edad del usuario es menor a 18 años...

if(edad < 18) {
    System.out.println("Tienes menos de 18 años.");
}


// en caso de que if no sea correcto, pasamos a else if. 
// probaremos si es correcto que la edad del usuario es de 18 años

else if (edad == 18) {
    System.out.println("Tienes exactamente 18 años.");
}

// else: en caso de no ser correcta tanto if como else if...
else {
    System.out.println("Tienes más de 18 años.");
}

//
System.out.println("Fin del programa.");

}


// EJERCICIO 2 : Sociedad de clases

int claseBaja = 1000;
int claseMedia = 2500;
int claseAlta = 10000;

int sueldoAntonio = 2100;
int sueldoMarta = 1250;
int sueldoSandra = 11500;



//sueldo Antonio

if (1000 > sueldoAntonio) AND < (claseAlta) {
    Sistem.out.println("Antonio se encuentra entre la clase baja y clase alta.");

    else if (sueldoAntonio > claseMedia) {
        System.out.printn("El sueldo de Antonio es de clase baja.");

        else (claseBaja > sueldoAntonio) {
            System.out.println("El sueldo de Antonio es de clase media.");
        }
    }



// sueldo Marta

if(claseBaja < sueldoMarta) AND < (claseAlta < sueldoMarta) {
    System.out.println("Sandra se encuentra entre la clase media y clase alta.");

    } else if (sueldoMarta > claseMedia) AND (sueldoSandra > claseAlta) {
        System.out.println("El sueldo de Marta es de clase alta");

        } else (sueldoMarta < claseMedia) {
            System.out.println("EL sueldo de Marta es de clase baja");
        }



// sueldo Sandra

if(1000 > 11500) AND < (11500 < 2500) {
    System.out.println("Sandra se encuentra entre la clase baja y media.");

    } else if (11500 < 2500) AND > (11500 > 1000) {
        System.out.println("El sueldo de Sandra es de clase media.");

        } else (10000 < 11500) {
            System.out.println("El sueldo de Sandra es de clase alta.")
        }

}

System.out.println("**************************************************")
System.out.println("**************************************************")
System.out.println("**************************************************")


}
 
 
 
 