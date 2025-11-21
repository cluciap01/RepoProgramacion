package ejercicio17examen;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class Ejercicio17examen {
    
    private static Scanner entrada = new Scanner(System.in);
    
    // El método podría devolver un booleano (true si acierta)
    public static boolean realizarPregunta(enunciado enunciado) {
        System.out.println(enunciado.obtenerPregunta());
        System.out.print("Tu respuesta: ");
        String respuestaUsuario = entrada.nextLine();

        // Se utiliza el método equalsIgnoreCase() para comparar la cadena sin importar mayúsculas y minúsculas 
        boolean acierto = respuestaUsuario.equalsIgnoreCase(enunciado.obtenerRespuestaCorrecta());

        if (acierto) {
            System.out.println("Muy bien, respuesta correcta.");
        } else {
            // Mostrar la respuesta correcta si falla
            System.out.println("No es correcto. La respuesta correcta sería " + enunciado.obtenerRespuestaCorrecta());
        }
        return acierto;
    }
    public static void main(String[] args) {
        enunciado p1 = new enunciado("¿Cuál es la capital de España?", "Madrid");
        enunciado p2 = new enunciado("¿Quién descubrió América?", "Colón");
        enunciado p3 = new enunciado("¿Cuánto es 2 + 2?", "4");
        enunciado p4 = new enunciado("¿Primer lenguaje de programación?", "Fortran");

        double nota = 0.0;
        final double PUNTUACION_POR_PREGUNTA = 2.5; // Constante para la puntuación

        //Realizar las preguntas y acumular la nota (+2.5 por acierto)
        if (realizarPregunta(p1)) {
            nota += PUNTUACION_POR_PREGUNTA;
        }
        if (realizarPregunta(p2)) {
            nota += PUNTUACION_POR_PREGUNTA;
        }
        if (realizarPregunta(p3)) {
            nota += PUNTUACION_POR_PREGUNTA;
        }
        if (realizarPregunta(p4)) {
            nota += PUNTUACION_POR_PREGUNTA;
        }
        //Mostrar la nota final
        System.out.println("NOTA DEL EXAMEN: " + nota);
    }
}
