package examen1;

import java.util.Scanner;

/**
 *
 * @author Christian Lucia Pulido
 */
public class Examen1 {

    /**
     * @param args the command line arguments
     */
    public static final double PI = Math.PI;
    public static void main(String[] args) {
        //Genero un bucle para el menú
        int opcion = 0;
        Scanner entrada = new Scanner(System.in);
        
        do {
            metodos.mostrarMenu();
            opcion = metodos.pedirOpcion(entrada);
            switch (opcion) {
                case 1:
                    metodos.analizarSeñal(entrada);
                    break;
                case 2:
                    metodos.ajustarPotencia();
                    break;
                case 3:
                    metodos.calcularVolumen();
                    break;
                case 4:
                    System.out.println("Saliendo del programa....");
                    break;
                default:
                    System.out.println("Introduce un valor válido");
            }
        }while (opcion != 4); //Mientras el usuario no pulse 4 se quedará dentro del bucle
    }
}

//Es todo lo que supe hacer :/
