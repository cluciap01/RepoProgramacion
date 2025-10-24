package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca la nota del alumno: ");
        
        int nota = entrada.nextInt();
        switch (nota) {
            case 0:
                System.out.println("Suspenso");
                break;
            case 1:
                System.out.println("Suspenso");
                break;
            case 2:
                System.out.println("Suspenso");
                break;
            case 3:
                System.out.println("Suspenso");
                break;
            case 4:
                System.out.println("Suspenso");
                break;
            case 5:
                System.out.println("Bien");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7:
                System.out.println("Notable");
                break;
            case 8:
                System.out.println("Notable");
                break;
            case 9:
                System.out.println("Sobresaliente");
                break;
            case 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Valor no valido. Introduzca un numero entre 0 - 10");
        }
    }
    
}
