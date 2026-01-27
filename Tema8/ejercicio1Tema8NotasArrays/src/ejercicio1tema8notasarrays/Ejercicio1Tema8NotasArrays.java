package ejercicio1tema8notasarrays;

import java.util.Scanner;

/**
 *
 * @author Christian
 */

public class Ejercicio1Tema8NotasArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        Asignaturas[] boletin = new Asignaturas[6];
        
        // Añado cada Asignatura a su zona de array
        boletin[0] = new Asignaturas("Programación", 0);
        boletin[1] = new Asignaturas("Lenguaje de marcas", 0);
        boletin[2] = new Asignaturas("Base de datos", 0);
        boletin[3] = new Asignaturas("Entorno de desarrollo", 0);
        boletin[4] = new Asignaturas("Sistemas Informáticos", 0);
        boletin[5] = new Asignaturas("Formación y Orientación Laboral", 0);
        
        // Pedimos nota al usuario
        for (int i = 0; i < boletin.length; i++) {
            boletin[i].pedirNota(entrada);
        }
    
        // Calculamos la media de las asignaturas
        double media = calcularMedia(boletin);
        System.out.println("Su nota media del curso es de: " +media);
    }
    
    // Método calcularMedia
    public static double calcularMedia(Asignaturas[] boletin) {
        double suma = 0.0;

        for (Asignaturas a : boletin) {
            suma += a.getNota();
        }

        return suma / boletin.length;
    }
}