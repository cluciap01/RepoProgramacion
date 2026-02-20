package ejercicio9aula;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class Ejercicio9Aula {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Arrays auxiliares para nombres
        String[] nombresAlumnos = {"Pepe", "Juan", "Marta"};
        String[] nombresAsignaturas = {"Lengua", "Mates", "Historia", "Física"};
        
        // Array de 3 posiciones para objetos Alumno
        Alumno[] aula = new Alumno[6];
        
        // Inicialización de los objetos en el array
        for (int i = 0; i < aula.length; i++) {
            aula[i] = new Alumno();
            aula[i].setNombreAlumno(nombresAlumnos[i]);
            for (int j = 0; j < 4; j++) {
                aula[i].getNotas()[j] = new Asignatura();
                aula[i].getNotas()[j].setNombreAsignatura(nombresAsignaturas[j]);
            }
        }

        int opcion;
        do {
            System.out.println("\n--- MENÚ GESTIÓN AULA ---");
            System.out.println("1. Rellenar las notas.");
            System.out.println("2. Mostrar notas.");
            System.out.println("3. Mejor alumno (nota media más alta).");
            System.out.println("4. Alumno con más suspensos.");
            System.out.println("5. Asignatura más difícil (media más baja).");
            System.out.println("6. Salir.");
            System.out.print("Elija una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1: // Rellenar notas
                    for (Alumno al : aula) {
                        System.out.println("Notas de " + al.getNombreAlumno() + ":");
                        for (Asignatura asig : al.getNotas()) {
                            System.out.print("  " + asig.getNombreAsignatura() + ": ");
                            asig.setNota(entrada.nextFloat());
                        }
                    }
                    break;

                case 2: // Mostrar notas
                    for (Alumno al : aula) {
                        System.out.print(al.getNombreAlumno() + " -> ");
                        for (Asignatura asig : al.getNotas()) {
                            System.out.print(asig.getNombreAsignatura() + ": " + asig.getNota() + " | ");
                        }
                        System.out.println();
                    }
                    break;

                case 3: // Mejor alumno
                    float maxMedia = -1;
                    String nombreMejor = "";
                    for (Alumno al : aula) {
                        float suma = 0;
                        for (Asignatura asig : al.getNotas()) suma += asig.getNota();
                        float media = suma / 4;
                        if (media > maxMedia) {
                            maxMedia = media;
                            nombreMejor = al.getNombreAlumno();
                        }
                    }
                    System.out.println("El mejor alumno es " + nombreMejor + " (Media: " + maxMedia + ")");
                    break;

                case 4: // Alumno con más suspensos
                    int maxSuspensos = -1;
                    String nombrePeor = "";
                    for (Alumno al : aula) {
                        int suspensos = 0;
                        for (Asignatura asig : al.getNotas()) if (asig.getNota() < 5) suspensos++;
                        if (suspensos > maxSuspensos) {
                            maxSuspensos = suspensos;
                            nombrePeor = al.getNombreAlumno();
                        }
                    }
                    System.out.println("El alumno con más suspensos es " + nombrePeor + " con " + maxSuspensos);
                    break;

                case 5: // Asignatura más difícil
                    float minMediaAsig = 11;
                    int indiceAsigDificil = 0;
                    for (int j = 0; j < 4; j++) {
                        float sumaAsig = 0;
                        for (int i = 0; i < 3; i++) {
                            sumaAsig += aula[i].getNotas()[j].getNota();
                        }
                        float mediaAsig = sumaAsig / 3;
                        if (mediaAsig < minMediaAsig) {
                            minMediaAsig = mediaAsig;
                            indiceAsigDificil = j;
                        }
                    }
                    System.out.println("La asignatura más difícil es " + nombresAsignaturas[indiceAsigDificil]);
                    break;
            }
        } while (opcion != 6);
    }
}