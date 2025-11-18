package herencia;

/**
 *
 * @author alumno
 */
public class enemigo extends personaje {
    private String arma;
    
    public enemigo(){
        super();
        this.arma="";
    }
    
    public enemigo(int vida , String arma){
        super(vida);
        this.arma=arma;
    }
    
    public String getArma(){
        return this.arma;
    }
    
    public void setArma(String arma){
        this.arma=arma;
    }
    
    public void crearSoldados(){
        System.out.println("Creando soldados...");
    }
    
    @Override
    public String toString(){
        return super.toString()+" y el ENEMIGO tiene "+this.arma+ " como arma";
    }
    
    
    
}
