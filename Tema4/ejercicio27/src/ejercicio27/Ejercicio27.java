package ejercicio27;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
import java.util.Random;
public class Ejercicio27 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        String eleccionUsuario;
        String resultado;
        boolean acierto = false;

        System.out.println("Bienvenido al juego de la moneda");
        System.out.println("Debes elegir entre 'cara' o 'cruz'.");

        // Bucle hasta que el usuario acierte
        while (!acierto) {
            System.out.print("\nElige (cara/cruz): ");
            eleccionUsuario = entrada.nextLine().toLowerCase();

            // Validar entrada
            if (!eleccionUsuario.equals("cara") && !eleccionUsuario.equals("cruz")) {
                System.out.println("Entrada no válida. Por favor, escribe 'cara' o 'cruz'.");
                continue;
            }

            // Generar resultado aleatorio
            resultado = random.nextBoolean() ? "cara" : "cruz";
            System.out.println("La moneda cayó en " + resultado );

            // Comprobar si acertó
            if (eleccionUsuario.equals(resultado)) {
                System.out.println("¡Enhorabuena! Has acertado");
                acierto = true;
            } else {
                System.out.println("Has perdido, inténtalo de nuevo");
            }
        }
    }
    
}
