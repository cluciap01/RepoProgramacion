package ejercicio7tema9;

/**
 *
 * @author alumno
 */
public class Ejercicio7Tema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        invertirPalabras("Hola mundo desde Java");
    }

    public static void invertirPalabras(String frase) {

        String[] palabras = frase.split(" ");
        System.out.print("Frase invertida: ");

        for (int i = palabras.length - 1; i >= 0; i--) {
            System.out.print(palabras[i] + " ");
        }
        System.out.println();
    }
}