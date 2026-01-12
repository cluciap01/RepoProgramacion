package ejercicio8arraysnumeros;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio8ArraysNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = pedirNumero();
        int[]cifras = dividirEnCifras(numero);
        numeroAlReves(cifras);
    }
    
    //Método para pedir un numero de 5 cifras
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduzca un número entero de 5 cifras: ");
            numero = entrada.nextInt();
        } while (numero < 10000 || numero > 99999);

        return numero;
    }
    
    //Método para dividir el numero por cifras
    public static int[] dividirEnCifras(int numero) {
        int[] cifras = new int[5];

        for (int i = 4; i >= 0; i--) {
            cifras[i] = numero % 10;
            numero /= 10;
        }

        return cifras;
    }
    
    //Método para ver el número al revés
    public static void numeroAlReves(int[] cifras){
        System.out.print("El numero introducido escrito al revés es el: ");

        for (int i = 4; i >= 0; i--) {
            System.out.print(cifras[i]);
        }
    
    }
}
