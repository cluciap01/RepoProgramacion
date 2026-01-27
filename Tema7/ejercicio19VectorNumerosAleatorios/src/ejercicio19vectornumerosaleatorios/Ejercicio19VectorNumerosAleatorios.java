package ejercicio19vectornumerosaleatorios;

import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio19VectorNumerosAleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creo un vector de 100 posiciones
        int[] vector = new int[3];
        
        // Variables para cálculos
        int suma = 0;
        int max = 9;  // Inicializado menor al rango (10-80)
        int min = 81; // Inicializado mayor al rango (10-80)
        
        // Array de frecuencias para calcular el valor que más se repite (Moda)
        // El rango es 10-80, usamos un array que cubra esos índices
        int[] frecuencias = new int[4]; 

        // Rellenar con números aleatorios entre 10 y 80 utilizando bucles
        for (int i = 0; i < vector.length; i++) {

            vector[i] = (int) (Math.random() * 71) + 10;
            
            // Acumulo para la media
            suma += vector[i];
            
            // Determinar mayor y menor
            if (vector[i] > max) max = vector[i];
            if (vector[i] < min) min = vector[i];
            
            // Contar para el valor más repetido
            frecuencias[vector[i]]++;
        }

        // Calcular el valor que más se repite
        int valorMasRepetido = 10;
        int maxFrecuencia = 0;
        for (int i = 10; i <= 80; i++) {
            if (frecuencias[i] > maxFrecuencia) {
                maxFrecuencia = frecuencias[i];
                valorMasRepetido = i;
            }
        }

        // Calcular la media
        double media = (double) suma / vector.length;

        // Mostrar resultados por pantalla
        System.out.println(" Estadísticas del Vector de 100 elementos ");
        System.out.println("El número mayor es: " + max);
        System.out.println("El número menor es: " + min);
        System.out.println("La media aritmética es: " + media);
        System.out.println("El valor que más se repite es: " + valorMasRepetido + " (aparece " + maxFrecuencia + " veces)");
    }
}