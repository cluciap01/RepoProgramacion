package utilidades;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Utilidades {

    /**
     * @param args the command line arguments
     * Generar una letra aleatoria entra a y z
     */
    
    public static char letraAleatoria (){
        Random random = new Random();
        //En ASCII el numero 97 es a y la z es 122
        int codigo = random.nextInt(26) + 'a';
        return (char) codigo;
    }
    public static void main(String[] args) {
        System.out.println("Letra aleatoria: " +letraAleatoria());
    }
}
