package ejercicio14tema8;

/**
 *
 * @author alumno
 */
public class Alumno {
    String nombre;
    int edad;
    double notamedia;
    
    //Constructor por defecto
    public Alumno() {
        this.nombre="";
        this.edad=0;
        this.notamedia=0.0;
    }
    
    //Constructor parametrizado
    public Alumno(String nombre , int edad , double notamedia){
        this.nombre = nombre;
        this.edad = edad;
        this.notamedia = notamedia;
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

    public double getNotamedia() {
        return notamedia;
    }

    public void setNotamedia(double notamedia) {
        this.notamedia = notamedia;
    }
    
}
