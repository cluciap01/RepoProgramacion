package ejercicio13;

/**
 *
 * @author alumno
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 11; // Empezamos en 11

        while (numero <= 133) { // Mientras no pasemos de 133
            if (numero % 2 == 0) { // Comprobamos si es par
                System.out.println(numero);
            }
            numero++; // Incrementamos en 1
        }   
    }    
}
