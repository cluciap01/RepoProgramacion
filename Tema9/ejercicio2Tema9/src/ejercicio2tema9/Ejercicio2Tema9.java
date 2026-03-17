package ejercicio2tema9;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio2Tema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, introduzca una cadena de caracteres:");
        String cadena = entrada.nextLine();
        
        System.out.println("Los caracteres de la cadena son:");

        for (int i = 0; i < cadena.length(); i++) {
            
            System.out.println(cadena.charAt(i));
        }
    }
    
}
