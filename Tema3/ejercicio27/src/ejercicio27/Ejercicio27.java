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
        Scanner entrada = new Scanner(System.in);
        int opcion;
        double num1, num2;

        // Pedimos al usuario los dos números
        System.out.print("Introduce el primer numero: ");
        num1 = entrada.nextDouble();
        System.out.print("Introduce el segundo numero: ");
        num2 = entrada.nextDouble();

        do {
            // Mostramos el menú
            System.out.println("\n--- MENÚ ---");
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Dividir");
            System.out.println("5.- Salir");
            System.out.print("Elige una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Error: No se puede dividir entre 0.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intenta de nuevo.");
            }

        } while (opcion != 5);
        entrada.close();
        
    }
    
}
