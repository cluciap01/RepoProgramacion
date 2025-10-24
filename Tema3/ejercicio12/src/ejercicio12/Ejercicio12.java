package ejercicio12;

/**
 *
 * @author alumno
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 11; // Comenzamos en 11

        do {
            if (numero % 2 == 0) { // Si es par
                System.out.println(numero); //Imprime por pantalla el numero
            }
            numero++; // Aumentamos el número en 1
        } while (numero <= 133); // Repetimos hasta llegar a 133
    }
}
