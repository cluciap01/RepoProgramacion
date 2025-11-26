package animales;

/**
 *
 * @author alumno
 */
public class Lobos extends Canidos{
    
    //Constructor por defecto    
    public Lobos (){
        super();
    }
    
    //Constructor paramétrico    
    public Lobos(String nombre , int edad , double peso){
        super (nombre , edad , peso);
    }

    //Implementacion de métodos
    @Override
    public String sonido() {
        return " aulla";
    }

    @Override
    public String habitat() {
        return " bosque";
    }

    @Override
    public String alimentacion() {
        return " carnívora"; 
    }

    @Override
    public String nombreCientifico() {
        return " Canis lupus";
    }
}
