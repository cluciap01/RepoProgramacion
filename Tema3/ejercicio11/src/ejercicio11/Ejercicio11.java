package ejercicio11;

/**
 *
 * @author alumno
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            System.out.print("Hola" + i);
            
            // Añadimos - después de cada saludo, excepto el último
            if (i < 6) {
                System.out.print(" - "); // Le quitamos el ln en el print para que salgan todos los Hola en la misma linea
            } else {
                System.out.print(" - ");
            }
        }
    }
}
