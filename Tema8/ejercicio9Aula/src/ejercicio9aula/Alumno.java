package ejercicio9aula;

/**
 *
 * @author Usuario
 */
public class Alumno {
    private String nombreAlumno;
    private Asignatura[] notas; // Array de 4 posiciones

    public Alumno() {
        this.notas = new Asignatura[3]; // Inicializa el array de asignaturas
    }

    // Getters y Setters
    public String getNombreAlumno() { return nombreAlumno; }
    public void setNombreAlumno(String nombreAlumno) { this.nombreAlumno = nombreAlumno; }
    public Asignatura[] getNotas() { return notas; }
    public void setNotas(Asignatura[] notas) { this.notas = notas; }
}