package ejercicio01tema12;

/**
 *
 * @author alumno
 */
public class Contacto {
    private String nombre;
    private int edad;
    private int numero;
    //Constructor por defecto
    public Contacto (){
        this.nombre = "";
        this.edad = 0;
        this.numero = 0;
    }
    //Constructor parametrizado
    public Contacto (String nombre, int edad, int numero){
        this.nombre = nombre;
        this.edad = edad;
        this.numero = numero;
    }
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
