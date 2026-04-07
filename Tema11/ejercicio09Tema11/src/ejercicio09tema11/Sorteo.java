package ejercicio09tema11;

import java.time.LocalDate;
import java.util.Arrays;

/**
 *
 * @author alumno
 */
public class Sorteo {
    private LocalDate fecha;
    private int[] ganadores; // Vector

    public Sorteo(LocalDate fecha) {
        this.fecha = fecha;
        this.ganadores = new int[4];
        generarNumeros();
    }

    // Método para generar numeros al azar
    private void generarNumeros() {
        for (int i = 0; i < ganadores.length; i++) {
            ganadores[i] = (int) (Math.random() * 100 + 1);
        }
    }

    public LocalDate getFecha() { 
        return fecha; 
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int[] getGanadores() {
        return ganadores;
    }

    public void setGanadores(int[] ganadores) {
        this.ganadores = ganadores;
    }

    @Override
    public String toString() {
        return "Fecha: " + fecha + " | Números: " + Arrays.toString(ganadores);
    }
}
