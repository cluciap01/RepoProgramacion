package ejercicio11tema11;

/**
 *
 * @author alumno
 */
public class Alumno {
    private String dni;
    private int numeroexpediente;
    private float notamedia;
    
    //Por defecto
    public Alumno (){
        this.dni = "";
        this.numeroexpediente = 0;
        this.notamedia = 0.0f;
    }
    
    //Parametrizado
    public Alumno(String dni , int numeroexpediente , float notamedia){
        this.dni = dni;
        this.numeroexpediente = numeroexpediente;
        this.notamedia = notamedia;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNumeroexpediente() {
        return numeroexpediente;
    }

    public void setNumeroexpediente(int numeroexpediente) {
        this.numeroexpediente = numeroexpediente;
    }

    public float getNotamedia() {
        return notamedia;
    }

    public void setNotamedia(float notamedia) {
        this.notamedia = notamedia;
    }
    
    @Override
    public String toString() {
        return "El Alumno con DNI: " +dni+ " , numero de expediente: " +numeroexpediente+ " , tiene de nota media: " +notamedia;
    }
}
