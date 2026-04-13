package ejercicio01tema12;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio01Tema12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        do {            
            System.out.println("--- AGENDA DE CONTACTOS ---");
            System.out.println("1.Añadir contactos.");
            System.out.println("2.Visualizar lista de contactos.");
            System.out.println("3.Eliminar contactos.");
            System.out.println("4.Mostrar todos los contactos ordenados por edad.");
            System.out.println("5.Salir de la agenda.");
            
            switch (opcion) {
                case 1:
                    añadirContactos;
                    break;
                case 2:
                    visualizarContactos;
                    break;
                case 3:
                    eliminarContactos;
                    break;
                case 4:
                    mostrarContactos:
                    break;
                case 5:
                    System.out.println("Saliendo de tu agenda de contactos...");
                    break;
                default:
                    System.out.println("Error. Debe introducir un numero entre 1 y 5.");
            }
        } while (opcion != 5);
    }
    
}
