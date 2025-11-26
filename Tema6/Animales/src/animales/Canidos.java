package animales;

/**
 *
 * @author alumno
 */
public abstract class Canidos extends Animales{

   //Constructor por defecto
   public Canidos(){
       super();
   }
   
   //Constructor paramétrico
   public Canidos(String nombre , int edad , double peso){
        super (nombre , edad , peso);
   }
}
