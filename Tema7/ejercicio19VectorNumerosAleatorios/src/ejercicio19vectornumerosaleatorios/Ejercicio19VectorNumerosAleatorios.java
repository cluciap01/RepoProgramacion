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
        // 1. Crear un vector de 100 posiciones según el enunciado [1]
        int[] vector = new int[7]; 
        
        // Variables para cálculos
        int suma = 0;
        int max = 9;  
        int min = 81; 
        
        // 2. Array de frecuencias (Moda)
        // Debe ser de tamaño 81 para permitir el índice 80 [4]
        int[] frecuencias = new int[8]; 

        // 3. Rellenar y procesar datos en un solo bucle [9]
        for (int i = 0; i < vector.length; i++) {
            // Aleatorios entre 10 y 80 [5]
            vector[i] = (int) (Math.random() * 71) + 10;
            
            suma += vector[i];
            
            if (vector[i] > max) max = vector[i];
            if (vector[i] < min) min = vector[i];
            
            // Incrementa la frecuencia del número generado
            frecuencias[vector[i]]++;
        }

        // 4. Calcular el valor que más se repite (Moda)
        int valorMasRepetido = 10;
        int maxFrecuencia = 0;
        for (int i = 10; i <= 80; i++) {
            if (frecuencias[i] > maxFrecuencia) {
                maxFrecuencia = frecuencias[i];
                valorMasRepetido = i;
            }
        }

        // 5. Calcular la media aritmética
        double media = (double) suma / vector.length;

        // 6. Mostrar resultados por pantalla [1]
        System.out.println(" Estadísticas del Vector de 100 elementos ");
        System.out.println("-------------------------------------------");
        System.out.println("El número mayor es: " + max);
        System.out.println("El número menor es: " + min);
        System.out.println("La media aritmética es: " + media);
        System.out.println("El valor que más se repite es: " + valorMasRepetido + 
                           " (aparece " + maxFrecuencia + " veces)");
    }
}