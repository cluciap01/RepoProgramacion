package animales;

/**
 *
 * @author alumno
 */
public class Perros extends Canidos{
    
    public Perros (){
        super();
    }
    
    public Perros(String nombre , int edad , double peso){
        super (nombre , edad , peso);
    }

    @Override
    public void sonido(){
        System.out.println("El perro ladra");
    }

    @Override
    public void habitat() {
        System.out.println("su hábitat es doméstico");
    }
        

    @Override
    public void alimentacion() {
        System.out.println("su alimentación es carnívora");    
    }
        

    @Override
    public void nombreCientifico() {
        System.out.println("su nombre científico es Canis lupus familiaris");
    }
    
    
    
}
