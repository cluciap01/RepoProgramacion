package ejercicio7mayormenor;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author alumno
 */
public class Ejercicio7mayormenor {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Pedimos los numeros al usuarios
        System.out.print("Por favor, introduzca el primer numero: ");
        int n1 = entrada.nextInt();

        System.out.print("Ahora, introduzca un segundo numero: ");
        int n2 = entrada.nextInt();

        System.out.print("Introduzca el tercer numero: ");
        int n3 = entrada.nextInt();

        System.out.print("Por último, introduzca un cuarto numero: ");
        int n4 = entrada.nextInt();

        mostrarOrdenCreciente(n1, n2, n3, n4);
    }

    public static void mostrarOrdenCreciente(int a, int b, int c, int d) {
        // Ordenamos con un bucle sencillo
        //Reconozco que utilicé un video para entender como utilizar el bucle "Método de la burbuja"
        int[] numeros = {a, b, c, d};
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
        //Mostramos por pantalla el orden de los numeros despues del bucle
        System.out.print("El orden de los números introducidos es el ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print("  ");
            }
        }
    }
}
