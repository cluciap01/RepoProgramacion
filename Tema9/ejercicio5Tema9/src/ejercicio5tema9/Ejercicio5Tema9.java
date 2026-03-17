package ejercicio5tema9;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio5Tema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        
        System.out.println("Introduce un día de la semana:");
        String diaUsuario = entrada.nextLine();
        
        boolean encontrado = false;
        for (int i = 0; i < dias.length; i++) {
            if (dias[i].equalsIgnoreCase(diaUsuario)) {
                System.out.println("Es el " + (i + 1) + " día de la semana.");
                encontrado = true;
                break;
            }
        }
        
        if (!encontrado) {
            System.out.println("El texto introducido no es un día válido.");
        }
    }
    
}
