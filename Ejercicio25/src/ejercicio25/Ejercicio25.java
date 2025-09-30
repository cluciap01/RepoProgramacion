package ejercicio25;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero: ");
        
        double num1 = entrada.nextDouble();
        
        System.out.println("Introduce el segundo numero: ");
        
        double num2 = entrada.nextDouble();
        
        System.out.println("Introduce el tercer numero: ");
        
        double num3 = entrada.nextDouble();
        
        double suma = num1+num2+num3;
        double producto = num1*num2*num3;
        
        System.out.println("La suma de los numeros introducidos es: " +suma);
        System.out.println("El producto de los numeros introducidos es: " +producto);
        
    }
    
}
