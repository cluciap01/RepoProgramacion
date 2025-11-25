package animales;

/**
 *
 * @author alumno
 */
public class Lobos extends Canidos{
    public Lobos (){
        super();
    }
    
    public Lobos(String nombre , int edad , double peso){
        super (nombre , edad , peso);
    }

    @Override
    public void sonido() {
        System.out.println("Los lobos aullan");
    }

    @Override
    public void habitat() {
        System.out.println("su hábitat es el bosque");
    }

    @Override
    public void alimentacion() {
        System.out.println("su alimentación es carnívora");
    }

    @Override
    public void nombreCientifico() {
        System.out.println("su nombre científico es Canis lupus");
    }
}
