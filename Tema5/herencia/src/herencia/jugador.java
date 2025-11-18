package herencia;

/**
 *
 * @author alumno
 */
public class jugador extends personaje{
    
    public String inventario;
    
    public jugador(){
        //Llamar al constructor por defectro de personaje
        super();
        this.inventario = "";
    }
    
    public jugador(int vida , String inventario){
        super(vida);
        this.inventario= inventario;
    }
    
    public String getInventario(){
        return this.inventario;
    }
    
    public void setInventario(String inventario){
        this.inventario=inventario;
    }
    
    public void recoger(){
        System.out.println("Recogiendo..");
    }
    
    @Override
    public String toString(){
        return super.toString()+" y es un JUGADOR con " + this.inventario;
    }
}
