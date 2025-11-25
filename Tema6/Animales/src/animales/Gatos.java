package animales;

/**
 *
 * @author alumno
 */
public class Gatos extends Felinos{
    public Gatos (){
        super();
        
    }
    
    public Gatos(String nombre , int edad , double peso){
        super (nombre , edad , peso);
    }

    @Override
    public void sonido() {
        System.out.println("Los gatos maullan");
    }

    @Override
    public void habitat() {
        System.out.println("su hábitat es doméstico");
    }

    @Override
    public void alimentacion() {
        System.out.println("se alimentan de ratones");
    }

    @Override
    public void nombreCientifico() {
        System.out.println("su nombre científico es Felis silvestris catus");
    }
}
