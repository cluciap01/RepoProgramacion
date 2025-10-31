package ejercicio4;

/**
 *
 * @author Usuario
 */
public class Utilidades {
    public static void mostrarMenor (int a, int b, int c) {
        int menor;
        
        if (a <= b && a <=c) {
            menor = a;
        } else if (b <= a && b <= c) {
            menor = b;
        }    else {
            menor = c; 
        }
        
        //Mostramos por pantalla el numero menor
        System.out.println("El numero menor de los tres numeros es: " +menor);
        }
    }
