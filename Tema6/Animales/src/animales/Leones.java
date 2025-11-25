package animales;

/**
 *
 * @author alumno
 */
public class Leones extends Felinos{
    public Leones(){
        super();
        
    }
    
    public Leones(String nombre , int edad , double peso){
        super (nombre , edad , peso);
    }

    @Override
    public void sonido() {
        System.out.println("Los leones rugen");
    }

    @Override
    public void habitat() {
        System.out.println("su hábitat es la sabana");
    }

    @Override
    public void alimentacion() {
        System.out.println("su alimentación es carnívora");
    }

    @Override
    public void nombreCientifico() {
        System.out.println("su nombre científico es Panthera leo");
    }
}
