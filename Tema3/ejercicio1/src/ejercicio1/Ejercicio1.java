package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, introduzca un numero entero: ");
        
        int numero = entrada.nextInt();
        if (numero <= 0){
            System.out.println("El numero es negativo");
        }
        else {
            System.out.println("El numero es positivo");
        }
    }
    
}
