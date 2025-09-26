// Ejemplos simples de uso de booleanos en java

public class booleanos03 {
    public static void main(String[] args) {

        
System.out.println("");
System.out.println("*******************************************");
System.out.println("*** TEORÍA GENERAL DE BOOLEANOS *** ");
System.out.println("*******************************************");

System.out.println("");

        // Ejemplo 1: Asignar un valor booleano directamente
        boolean esMayorDeEdad = true;
        System.out.println("Ejemplo 1: ¿Es mayor de edad? " + esMayorDeEdad);

        // Ejemplo 2: Resultado de una comparación 
        int a = 5, b = 10;
        boolean resultado = a < b;
        System.out.println("Ejemplo 2: ¿a es menor que b? " + resultado);

        // Ejemplo 3: Uso en una estructura condicional 
        boolean tienePermiso = false;
        if (tienePermiso) {
            System.out.println("Ejemplo 3: Acceso permitido");
        } else {
            System.out.println("Ejemplo 3: Acceso denegado");

System.out.println("");

        }
    }
}