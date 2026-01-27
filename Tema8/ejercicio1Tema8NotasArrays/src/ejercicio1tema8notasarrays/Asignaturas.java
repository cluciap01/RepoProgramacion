package ejercicio1tema8notasarrays;

import java.util.Scanner;

/**
 *
 * @author Christian
 */

public class Asignaturas {
    String nombreAsignatura;
    double nota;

    // Constructor por defecto
    public Asignaturas(){
        this.nombreAsignatura = "";
        this.nota = 0.0;
    }
    
    // Constructor con parámetros
    public Asignaturas(String nombreAsignatura, double nota) {
        this.nombreAsignatura = nombreAsignatura;
        this.nota = nota;
    }

    // Getters y Setters 
    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    // Método para pedir la nota de cada asignatura
    public void pedirNota(Scanner entrada) {
        System.out.print("Por favor, introduzca la nota de " + getNombreAsignatura() + " : ");
        nota = entrada.nextDouble();
    }
}