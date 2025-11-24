package ejercicio16calificacion;

/**
 *
 * @author Christian
 */
public class alumno {
    private String nombre;
    private int nota;

    //Constructor por defecto
    public alumno(){
        this.nombre="";
        this.nota=0;
    }
    // Constructor
    public alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    // Método para calcular la calificación basado en la nota
    public String calcularCalificacion() {
        
        if (nota < 0 || nota > 10) {
           //Podría avisar de un error al no estar la nota entre el rango que hemos puesto
            return "Error: Nota fuera de rango (0-10)";
        } else if (nota <= 4) {
            return "Suspenso"; // 0 a 4 = Suspenso
        } else if (nota <= 6) {
            return "Bien"; // 5 a 6 = Bien
        } else if (nota <= 8) {
            return "Notable"; // 7 a 8 = Notable
        } else {
            return "Sobresaliente"; // 9 a 10 = Sobresaliente
        }
    }
    
    // Muestra los datos , nota y calificacion del alumno
    public void mostrarEstado() {
        System.out.println("Alumno: " + nombre + ", Nota: " + nota);
        System.out.println("Calificación: " + calcularCalificacion());
    }
}
