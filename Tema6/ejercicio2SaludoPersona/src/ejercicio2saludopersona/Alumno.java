package ejercicio2saludopersona;

/**
 *
 * @author Usuario
 */
public class Alumno extends Persona{
     private String grupo; 

    public Alumno() {
        super();
        this.grupo = "";
    }

    public Alumno(String nombre, String grupo) {
        super(nombre);
        this.grupo = grupo;
    }

    // Implementación del método abstracto saludar
    @Override
    public String saludar() {
        //Se muestra por pantalla el saludo que pongamos para el alumno
        return "Hola, soy el alumno " + this.nombre + " y estoy en el grupo de " + this.grupo + ".";
}
}
