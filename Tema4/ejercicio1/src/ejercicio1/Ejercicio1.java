package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Pedimos un numero
        System.out.println("Introduce un numero: ");
        int numero = entrada.nextInt();
        
        String resultado = PoN(numero);
        System.out.println("El numero introducido es " +resultado);
               }
    //Creamos las clase para saber si es Positivo o Negativo
    public static String PoN(int numero) {
        if (numero >= 0) {
            return "positivo"; //Si devuelve mayor o igual de 0 es positivo
        } else {
            return "negativo";//Si devuelve menor de 0 es negativo
        }
    }
}
