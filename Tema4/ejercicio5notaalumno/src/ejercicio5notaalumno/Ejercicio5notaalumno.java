package ejercicio5notaalumno;

import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio5notaalumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Pedimos el numero de la nota
        System.out.println("Introduce la nota del alumno: ");
        int nota = entrada.nextInt();
        
        //Llamamos a la clase de calificacion
        calificacion.notas(nota, nota, nota, nota);
    }
}
