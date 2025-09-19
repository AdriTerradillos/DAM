// EJERCICIO CLASE (nueva clase - nuevo archivo)

public class CondicionalifElse02 {
    
    public static void main(String[] args) {
        
        System.out.println("*** EJERCICIOS DE CLASE ***");
 
    double sueldo1 = 1700.00;
    double neto = 0;

    // no se activa el if...
    if (sueldo1 <= 1000) {
    System.out.println("Tu sueldo es menor a 1000.");
    System.out.println("No pagas impuestos.");
    System.out.println("TOTAL:" + sueldo1);
    System.out.println("Si no aplico impuestos(%), va a cobrar " + sueldo1);
  
        // no se activa el else if...
        } else if (sueldo1 < 10000) {
           System.out.println("Tu sueldo es mayor a 1000 pero menor a 10000.");
           System.out.println("Pagas un 10% de impuestos.");
           System.out.println("Total: " + (sueldo1 - (sueldo1 * 10/100)));
           System.out.println("Si aplico un 10% de impuestos a mi sueldo, va a cobrar " + (sueldo1 - (sueldo1 * 10/100)));
 

            // se activará el else, por lo que el sueldo sufriá una aplicación de impuestos del 50%
            } else {
                System.out.println("Tu sueldo es mayor a 10000");
                System.out.println("Pagas un 50% de impuestos.");
                System.out.println("Total: " + (sueldo1 - (sueldo1 * 50/100)));
                System.out.println("Si aplico un 50% de impuestos");          
            }
        }
    }

