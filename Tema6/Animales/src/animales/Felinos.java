package animales;

/**
 *
 * @author alumno
 */
public abstract class Felinos extends Animales{
    
   //Constructor por defecto
   public Felinos(){
       super();
   }

   //Constructor paramétrico
   public Felinos(String nombre , int edad , double peso){
       super (nombre , edad , peso);
   }

}


