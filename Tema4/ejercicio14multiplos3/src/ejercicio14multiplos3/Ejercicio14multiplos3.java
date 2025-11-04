package ejercicio14multiplos3;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio14multiplos3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = pedirNumero();
        mostrarMultiplosDeTres(numero);
    }

    // Método para pedir el número al usuario y comprobar que es mayor que 0
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        int n;
        do {
            System.out.print("Introduce un número mayor que 0: ");
            n = entrada.nextInt();
            if (n <= 0) {
                System.out.println("Error: el número debe ser mayor que 0.");
            }
        } while (n <= 0);
        return n;
    }

    // 
    public static void mostrarMultiplosDeTres(int limite) {
        int contador = 0;
        System.out.println("\nMúltiplos de 3 entre 1 y " + limite + ":");
        for (int i = 1; i <= limite; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
                contador++;
            }
        }
        System.out.println("Total de múltiplos de 3: " + contador);
    }
}
