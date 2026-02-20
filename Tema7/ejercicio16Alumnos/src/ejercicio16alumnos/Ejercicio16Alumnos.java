package ejercicio16alumnos;

import java.util.Scanner;

public class Ejercicio16Alumnos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Definición de datos según el enunciado
        String[] alumnos = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "María"};
        String[] asignaturas = {"Lengua", "Mates", "Historia", "Física"};
        
        // Matriz de 6 filas (alumnos) y 4 columnas (asignaturas)
        float[][] notas = new float[5][6];
        int opcion;
        boolean notasRellenas = false;

        // Menú
        do {
            System.out.println("\n--- GESTIÓN DE NOTAS ---");
            System.out.println("1. Rellenar las notas de los alumnos.");
            System.out.println("2. Mostrar las notas.");
            System.out.println("3. Mejor alumno (media más alta).");
            System.out.println("4. Alumno con más suspensos.");
            System.out.println("5. Asignatura más difícil (media más baja).");
            System.out.println("6. Salir.");
            System.out.print("Elija una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1: // Rellenar notas utilizando bucles anidados
                    for (int i = 0; i < alumnos.length; i++) {
                        System.out.println("Notas de " + alumnos[i] + ":");
                        for (int j = 0; j < asignaturas.length; j++) {
                            System.out.print("  " + asignaturas[j] + ": ");
                            notas[i][j] = entrada.nextFloat();
                        }
                    }
                    notasRellenas = true;
                    break;

                case 2: // Mostrar notas
                    if (!notasRellenas) {
                        System.out.println("Error: Primero debe rellenar las notas.");
                    } else {
                        for (int i = 0; i < alumnos.length; i++) {
                            System.out.print(alumnos[i] + " -> ");
                            for (int j = 0; j < asignaturas.length; j++) {
                                System.out.print(asignaturas[j] + ": " + notas[i][j] + " | ");
                            }
                            System.out.println();
                        }
                    }
                    break;

                case 3: // Mejor alumno (media más alta)
                    float maxMedia = -1;
                    int indiceMejor = 0;
                    for (int i = 0; i < alumnos.length; i++) {
                        float suma = 0;
                        for (int j = 0; j < asignaturas.length; j++) {
                            suma += notas[i][j];
                        }
                        float media = suma / asignaturas.length;
                        if (media > maxMedia) {
                            maxMedia = media;
                            indiceMejor = i;
                        }
                    }
                    System.out.println("El mejor alumno es " + alumnos[indiceMejor] + " con una media de " + maxMedia);
                    break;

                case 4: // Alumno con más suspensos
                    int maxSuspensos = -1;
                    int indicePeor = 0;
                    for (int i = 0; i < alumnos.length; i++) {
                        int contadorSuspensos = 0;
                        for (int j = 0; j < asignaturas.length; j++) {
                            if (notas[i][j] < 5) contadorSuspensos++;
                        }
                        if (contadorSuspensos > maxSuspensos) {
                            maxSuspensos = contadorSuspensos;
                            indicePeor = i;
                        }
                    }
                    System.out.println("El alumno con más suspensos es " + alumnos[indicePeor] + " (" + maxSuspensos + " suspensos)");
                    break;

                case 5: // Asignatura más difícil (media más baja)
                    float minMediaAsig = 11;
                    int indiceDificil = 0;
                    for (int j = 0; j < asignaturas.length; j++) {
                        float sumaAsig = 0;
                        for (int i = 0; i < alumnos.length; i++) {
                            sumaAsig += notas[i][j];
                        }
                        float mediaAsig = sumaAsig / alumnos.length;
                        if (mediaAsig < minMediaAsig) {
                            minMediaAsig = mediaAsig;
                            indiceDificil = j;
                        }
                    }
                    System.out.println("La asignatura más difícil es " + asignaturas[indiceDificil] + " con una media de " + minMediaAsig);
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6); // Se repite hasta pulsar 6
    }
}