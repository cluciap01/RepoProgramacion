package animales;

/**
 *
 * @author alumno
 */
public class Perros extends Canidos{
    
    //Constructor por defecto
    public Perros (){
        super();
    }
    
    //Constructor paramétrico    
    public Perros(String nombre , int edad , double peso){
        super (nombre , edad , peso);
    }

    //Implementacion de métodos
    @Override
    public String sonido(){
        return " ladra";
    }

    @Override
    public String habitat() {
        return " doméstico";
    }    

    @Override
    public String alimentacion() {
        return " carnívora";    
    }
        
    @Override
    public String nombreCientifico() {
        return " Canis lupus familiaris";
    }
}
