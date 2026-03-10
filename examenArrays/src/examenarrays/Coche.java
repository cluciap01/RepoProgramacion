package examenarrays;

/**
 *
 * @author Christian
 */
public class Coche {
    String nombre;
    String matricula;
    
    //Constructor por defecto
    public Coche (){
        nombre = "";
        matricula = "";        
    }
    
    //Constructor parametrizado
    public Coche(String nombre , String matricula){
        this.nombre = nombre;
        this.matricula = matricula;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "El titular del vehículo es: " +nombre+ " y la matricula: " +matricula;
    }
}