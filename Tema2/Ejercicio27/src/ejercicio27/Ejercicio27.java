package ejercicio27;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        
        int numero = entrada.nextInt();
        int num1 = numero * numero;
        int num2 = numero * numero * numero;
        
        System.out.println("El cuadrado de " +numero+ "es: " +num1);
        System.out.println("El cubo de " +numero+ "es: " +num2);
    }
    
}
