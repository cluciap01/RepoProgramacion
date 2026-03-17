package ejercicio3tema9;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio3Tema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca una cadena de caracteres:");
        String cadena = entrada.nextLine();// Para leer la línea completa
        
        char[] caracteres = cadena.toCharArray();
        
        System.out.println("Los caracteres de la cadena (uno por línea) son:");
        
        for (int i = 0; i < caracteres.length; i++) {
            System.out.println(caracteres[i]);
        }
    }
    
}
