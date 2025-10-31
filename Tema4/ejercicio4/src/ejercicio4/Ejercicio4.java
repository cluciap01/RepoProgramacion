package ejercicio4;

import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Pedimos el primer numero
        System.out.println("Introduce un numero: ");
        int numero1 = entrada.nextInt();
        
        //Pedimos el segundo numero
        System.out.println("Introduce un numero: ");
        int numero2 = entrada.nextInt();
        
        //Pedimos el tercer numero
        System.out.println("Introduce un numero: ");
        int numero3 = entrada.nextInt();
    
        //Llamamos a la otra clase que hemos creado
        Utilidades.mostrarMenor(numero1, numero2, numero3);
    }     
}
