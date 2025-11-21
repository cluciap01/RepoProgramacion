
package ejercicio16calificacion;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio16calificacion {

    private static Scanner entrada = new Scanner(System.in);
    public static int solicitarNota() {
        int nota;
        do {
            System.out.print("Introduzca la nota (0-10): ");
            // Utilizaremos el Scanner para leer la nota del alumno
            if (entrada.hasNextInt()) { //Con hasNextInt lo que conseguimos es un booleano y nos aseguramos de que el numero de nota es entero (consulté ayuda para sacarlo:))
                nota = entrada.nextInt();
                if (nota < 0 || nota > 10) {
                    System.out.println("ERROR: La nota debe estar entre 0 y 10."); // Aviso de error
                }
            } else {
                System.out.println("Entrada inválida. Intente de nuevo.");
                entrada.next(); // Limpia el buffer
                nota = -1; // Valor para forzar la repetición del bucle
            }
        } while (nota < 0 || nota > 10);
        entrada.nextLine(); //Cambia de linea
        return nota;
    }
    public static void main(String[] args) {
        System.out.print("Nombre del alumno 1: ");
        String nombre1 = entrada.nextLine();
        int nota1 = solicitarNota();
        alumno a1 = new alumno(nombre1, nota1);
        
        System.out.print("Nombre del alumno 2: ");
        String nombre2 = entrada.nextLine();
        int nota2 = solicitarNota();
        alumno a2 = new alumno(nombre2, nota2);

        System.out.print("Nombre del alumno 3: ");
        String nombre3 = entrada.nextLine();
        int nota3 = solicitarNota();
        alumno a3 = new alumno(nombre3, nota3);

        a1.mostrarEstado();
        a2.mostrarEstado();
        a3.mostrarEstado();
    }
}
