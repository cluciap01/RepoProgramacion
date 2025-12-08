package ejercicio2saludopersona;

/**
 *
 * @author Usuario
 */
public class Profesor extends Persona{
   private String especialidad;

   //Constructores
   public Profesor() {
       super();
       this.especialidad = "";
   }
   public Profesor(String nombre, String especialidad) {
       super(nombre);
       this.especialidad = especialidad;
   }

    // Implementación del método abstracto saludar
    @Override
    public String saludar() {
        //Se muestra por pantalla el saludo que pongamos para el profesor
        return "Hola, soy la profesora " + this.nombre + " y soy de la especialidad de " + this.especialidad + ".";
    }
}
