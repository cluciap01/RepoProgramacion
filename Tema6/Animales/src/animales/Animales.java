package animales;

/**
 *
 * @author alumno
 */
public abstract class Animales {
    private String nombre;
    private int edad;
    private double peso;
    
    //Constructores
    public Animales(){
    this.nombre="";
    this.edad=0;
    this.peso=0.0;
    }
    
    public Animales(String nombre, int edad, double peso){
        this.nombre=nombre;
        this.edad=edad;
        this.peso=peso;
    }
    
    //GETTERS Y SETTERS
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public double getPeso(){
        return this.peso;
    }
    
    public void setPeso(double peso){
        this.peso=peso;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public abstract void sonido();
    
    public abstract void habitat();
    
    public abstract void alimentacion();
    
    public abstract void nombreCientifico();    
    
}

