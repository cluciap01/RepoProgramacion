package animales;

/**
 *
 * @author alumno
 */
public class Leones extends Felinos{
    
    //Constructor por defecto
    public Leones(){
        super();
        
    }
    
    //Constructor paramétrico    
    public Leones(String nombre , int edad , double peso){
        super (nombre , edad , peso);
    }

    //Implementacion de métodos
    @Override
    public String sonido() {
        return " ruge";
    }

    @Override
    public String habitat() {
        return " sabana";
    }

    @Override
    public String alimentacion() {
        return " carnívora"; 
    }

    @Override
    public String nombreCientifico() {
        return " Panthera leo";
    }
}
