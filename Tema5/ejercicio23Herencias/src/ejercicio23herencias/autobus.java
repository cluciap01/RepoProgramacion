package ejercicio23herencias;

/**
 *
 * @author alumno
 */
public class autobus extends vehiculos{
 
    public int numeroPlazas;
    
    public autobus(){
    super();
    this.numeroPlazas= 60;
}
        
public autobus(String matricula, String modelo , int potenciaCV , int numeroPlazas){
    super(matricula, modelo , potenciaCV);
    this.numeroPlazas=numeroPlazas;
}

public int getNumeroPlazas(){
    return this.numeroPlazas=numeroPlazas;
}

public void setNumeroPlazas(int numeroPlazas){
        this.numeroPlazas=numeroPlazas;
    }
    
@Override
    public String toString(){
        return super.toString()+" y es un AUTOBÚS con " + this.numeroPlazas+ " plazas";
    }
}



