package ejercicio27;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        int num1, num2;
        Scanner entrada = new Scanner(System.in);   
        // Pedimos al usuario los dos números
        System.out.print("Introduce el primer numero: ");
        num1 = entrada.nextInt();
        System.out.print("Introduce el segundo numero: ");
        num2 = entrada.nextInt();

        do {
            // Mostramos el menú
            System.out.println("\n--- MENU ---");
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Dividir");
            System.out.println("5.- Salir");
            System.out.print("Elige una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + (num1 + num2)); //SUMA
                    break;
                case 2:
                    System.out.println("Resultado: " + (num1 - num2)); //RESTA
                    break;
                case 3:
                    System.out.println("Resultado: " + (num1 * num2)); //PRODUCTO
                    break;
                case 4:
                    try {
                       System.out.println("Resultado: " + (num1 / num2)); //DIVISION
                    }
                    catch (ArithmeticException e) //EXCEPCION
                    {
                        System.out.println("No se puede dividir entre 0");
                        System.out.println(e);
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa..."); //SALIR DEL PROGRAMA
                    break;
                default:
                    System.out.println("Opcion no valida. Intenta de nuevo.");
            }
        } while (opcion != 5);
    }
}
