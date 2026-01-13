package ejercicio9arraysnumeroalreves;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio9ArraysNumeroAlReves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = pedirNumero();
        int numCifras = contardorCifras(numero);
        int[] cifras = dividirEnCifras(numero, numCifras);
        mostrarAlReves(cifras);
    }
    
    //Método para pedir un numero al usuario
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca un número entero: ");
        return entrada.nextInt();
    }
    
    //Método para contar el numero de cifras que tiene el número
    public static int contardorCifras(int numero) {
        int contador = 0;

        do {
            numero = numero / 10;
            contador++;
        } while (numero > 0);

        return contador;
    }
    
    //Método para dividir el numero en cifras
    public static int[] dividirEnCifras(int numero, int numCifras) {
        int[] cifras = new int[numCifras];

        for (int i = numCifras - 1; i >= 0; i--) {
            cifras[i] = numero % 10;
            numero = numero / 10;
        }

        return cifras;
    }
    
    // Método para mostrar el array al revés
    public static void mostrarAlReves(int[] cifras) {
        System.out.print("El numero introducido escrito al revés es el: ");

        for (int i = cifras.length - 1; i >= 0; i--) {
            System.out.print(cifras[i]);
        }
    }
}
