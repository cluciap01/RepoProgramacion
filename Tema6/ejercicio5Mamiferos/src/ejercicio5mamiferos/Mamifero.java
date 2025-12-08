package ejercicio5mamiferos;

/**
 *
 * @author Usuario
 */
public class Mamifero {
    protected String nombre;
    protected String sexo;
    protected String color;
    protected int edad;

    //Constructores
    public Mamifero() {
        this.nombre = "";
        this.sexo = "";
        this.color = "";
        this.edad = 0;
    }
    public Mamifero(String nombre, String sexo, String color, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.color = color;
        this.edad = edad;
    }
    
    // Método para mostrar información base del mamífero
    public void mostrarInfoBase() {
        System.out.println("Nombre: " + nombre + ", Sexo: " + sexo + ", Color: " + color + ", Edad: " + edad + " años.");
    }
}
