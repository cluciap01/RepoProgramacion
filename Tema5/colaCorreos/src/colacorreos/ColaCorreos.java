package colacorreos;

import java.util.Scanner;

/**
 *
 * @author Christian Lucia Pulido
 */
public class ColaCorreos {
    // CONSTANTES
    public static final char MESA_INICIAL = 'A';
    public static final char MESA_FINAL = 'F';

    // VARIABLES
    public static int numeroEnvio = 1;
    public static int numeroRecogida = 1;

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        do {
            metodos.mostrarMenu();
            opcion = metodos.pedirOpcion(entrada);
            
            switch (opcion) {
                case 1:
                    metodos.NumeroEsperaEnvio();
                    break;
                case 2:
                    metodos.NumeroEsperaRecogida();
                    break;
                case 3:
                    System.out.println("Acabas de salir del programa.");
                    break;
                default:
                    System.out.println("Introduce un numero del 1 al 3");
            }
        }while (opcion != 3); //Mientras el usuario no pulse 3 se quedará dentro del bucle
    }
}