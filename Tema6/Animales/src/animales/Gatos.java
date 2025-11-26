package animales;

/**
 *
 * @author alumno
 */
public class Gatos extends Felinos{
    
    //Constructor por defecto
    public Gatos (){
        super();
        
    }
    
    //Constructor paramétrico    
    public Gatos(String nombre , int edad , double peso){
        super (nombre , edad , peso);
    }

    //Implementacion de métodos
    @Override
    public String sonido() {
        return " maulla";
    }

    @Override
    public String habitat() {
        return " doméstico";
    }

    @Override
    public String alimentacion() {
        return " ratones";
    }

    @Override
    public String nombreCientifico() {
        return " Felis silvestris catus";
    }
}
