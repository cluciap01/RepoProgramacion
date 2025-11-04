package ejercicio26esprimo;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio26esprimo {

    /**
     * @param args the command line arguments
     */
    
    // Método que determina si un número es primo
    public static boolean esPrimo(int numero) {
        
        if (numero < 1){
            return false;
        }
        
        // Comprobamos si tiene algún divisor desde 2
        int i=2;
        while(i <= Math.sqrt(numero)) {
            if (numero % i == 0) { 
            // Si el resto es 0, no es primo
                return false;
            }
            i++;
        }

        // Si no es primo
        return true;
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        // Leer el número del usuario
        int numero = entrada.nextInt(); 
        
        // Llamar al método y mostrar el resultado por pantalla
        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }

    }
}