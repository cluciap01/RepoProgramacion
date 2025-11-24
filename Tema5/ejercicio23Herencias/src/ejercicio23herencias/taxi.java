package ejercicio23herencias;

/**
 *
 * @author alumno
 */
public class taxi extends vehiculos{
    
    private int licencia;
   
    //Constructor por defecto
    public taxi(){
        super();
        this.licencia= 0;
    }
    
    public taxi(String matricula, String modelo , int potenciaCV , int licencia){
        super(matricula, modelo , potenciaCV);
        this.licencia=licencia;
    }
    //GET Y SET
    public int getLicencia(){
        return this.licencia;
    }

    public void setLicencia(int licencia){
        this.licencia = licencia;
    }
    
@Override
    public String toString(){
        return super.toString()+" y es un TAXI con numero de licencia: " +this.licencia; 
    }
}
