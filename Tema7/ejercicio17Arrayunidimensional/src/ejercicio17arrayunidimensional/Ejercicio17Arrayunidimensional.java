package ejercicio17arrayunidimensional;

import java.util.Arrays;

public class Ejercicio17Arrayunidimensional {

    public static void main(String[] args) {
        // Crear el array mediante el método correspondiente
        int[] miArray = crearArrayAleatorio();

        // Visualizar el array original
        System.out.println("--- Array Original ---");
        visualizarArray(miArray);

        // Ordenar el array de mayor a menor
        ordenarMayorAMenor(miArray);

        // Visualizar el array ya ordenado
        System.out.println("\n--- Array Ordenado (Mayor a Menor) ---");
        visualizarArray(miArray);
    }

    public static int[] crearArrayAleatorio() {
        int[] vector = new int[2];
        for (int i = 0; i < vector.length; i++) {
            // Genera números entre 0 y 9
            vector[i] = (int) (Math.random() * 10);
        }
        return vector;
    }

    public static void visualizarArray(int[] vector) {
        System.out.println(Arrays.toString(vector));
    }

    public static void ordenarMayorAMenor(int[] vector) {
        int aux;
        // Bucle externo para controlar las pasadas
        for (int i = 0; i < vector.length; i++) {
            // Bucle interno para comparar elementos adyacentes
            for (int j = 0; j < vector.length - 1; j++) {
                // Para ordenar de mayor a menor, si el actual es menor que el siguiente, intercambiamos
                if (vector[j] < vector[j + 1]) {
                    aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }
    }
}