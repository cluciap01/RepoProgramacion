package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Pedimos los 2 numeros al usuario
        System.out.println("Introduce el primer numero:");
        int numero1 = entrada.nextInt();
        //Mostramos por pantalla los numeros pedidos
        System.out.println("Introduce el segundo numero:");
        int numero2 = entrada.nextInt();
        if (numero1 >= 10) {
            Operaciones.multiplicacion(numero1, numero2);

        } else {
            Operaciones.suma(numero1, numero2);
        }

    }

}
