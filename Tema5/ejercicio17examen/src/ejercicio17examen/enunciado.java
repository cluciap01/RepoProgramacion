package ejercicio17examen;

/**
 *
 * @author Christian
 */
public class enunciado {
    private String pregunta;
    private String respuestaCorrecta;

    // Constructor
    public enunciado(String pregunta, String respuestaCorrecta) {
        this.pregunta = pregunta;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    // Métodos Getter para la pregunta y respuesta correcta
    public String obtenerPregunta() {
        return pregunta;
    }

    public String obtenerRespuestaCorrecta() {
        return respuestaCorrecta;
    }
}
