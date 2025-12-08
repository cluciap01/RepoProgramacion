package ejercicio2saludopersona;

/**
 *
 * @author Usuario
 */
public abstract class Persona {
    protected String nombre;

    // Constructores
    public Persona (){
        this.nombre = "";
    }
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto
    public abstract String saludar();
}
