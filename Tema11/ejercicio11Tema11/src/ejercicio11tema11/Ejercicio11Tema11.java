package ejercicio11tema11;

import java.util.Scanner;
import java.util.*;


/**
 *
 * @author alumno
 */
public class Ejercicio11Tema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        Set<Alumno> gestionAlumnos = new TreeSet<>();
        int opcion;

        do {
            System.out.println("--- ALUMNADO ---");
            System.out.println("1. Añadir alumno");
            System.out.println("2. Mostrar alumnos");
            System.out.println("3. Buscar por numero de expediente");
            System.out.println("4. Mostrar alumno por nota");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1 -> añadirAlumno(gestionAlumnos);
                case 2 -> mostrarAlumnos(gestionAlumnos);
                case 3 -> buscarNumeroExpediente(gestionAlumnos, entrada);
                case 4 -> buscarPorNota(gestionAlumnos, entrada);
                case 5 -> System.out.println("Saliendo...");
            }
        } while (opcion != 5);
    }
    
    //MÉTODO PARA AÑADIR ALUMNO
    public void añadirAlumno(){
        return ;
    }
    
    //MÉTODO PARA MOSTRAR ALUMNOS
    public void mostrarAlumnos(){
        return;
    }
    
    //MÉTODO PARA BUSCAR NUMERO DE EXPEDIENTE
    public void buscarNumeroExpediente(){
    return;
    }
    
    //MÉTODO PARA BUSCAR POR NOTA MEDIA
    public void buscarPorNota(){
        return;
    }        
}