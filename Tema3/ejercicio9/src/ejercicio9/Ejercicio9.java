package ejercicio9;

/**
 *
 * @author alumno
 */
    import java.util.Scanner;
    import java.util.Arrays;
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Pedir los cuatro números al usuario
        System.out.print("Por favor, introduzca el primer numero: ");
        int num1 = entrada.nextInt();

        System.out.print("Ahora, introduzca un segundo numero: ");
        int num2 = entrada.nextInt();

        System.out.print("Introduzca el tercer numero: ");
        int num3 = entrada.nextInt();

        System.out.print("Por ultimo, introduzca el cuarto numero: ");
        int num4 = entrada.nextInt();

        // Guardar los números en un array
        int[] numeros = {num1, num2, num3, num4};

        // Ordenar el array de forma creciente
        Arrays.sort(numeros);

        // Mostrar el resultado
        System.out.print("El orden de los numeros introducidos es el ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(" - ");
            }
        }
    }
}
