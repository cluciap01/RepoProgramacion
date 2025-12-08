package ejercicio2saludopersona;

/**
 *
 * @author Usuario
 */
public class Ejercicio2SaludoPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Profesor profe1 = new Profesor("Anabel", "Programación");
        Alumno alumno1 = new Alumno("Christian", "1DAW");
        
        // El método saludar se invoca tanto a alumno como a profesor
        System.out.println(profe1.saludar());
        System.out.println(alumno1.saludar());

        //Uso de Polimorfismo
        System.out.println("Prueba de Polimorfismo");

        Persona persona1 = new Profesor("Amelia", "Seguridad Informática");
        Persona persona2 = new Alumno("Izan", "2DAW");

        System.out.println(persona1.saludar()); // Invoca la implementación de Profesor
        System.out.println(persona2.saludar()); // Invoca la implementación de Alumno
    }
}
