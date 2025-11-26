package animales;

/**
 *
 * @author alumno
 */
public abstract class Animales {
    private String nombre;
    private int edad;
    private double peso;
    
    //Constructor por defecto
    public Animales(){
    this.nombre="";
    this.edad=0;
    this.peso=0.0;
    }
    
    //Constructor paramétrico
    public Animales(String nombre, int edad, double peso){
        this.nombre=nombre;
        this.edad=edad;
        this.peso=peso;
    }
    
    //GETTERS Y SETTERS
    private String getNombre(){
        return this.nombre;
    }
    
    private void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    private double getPeso(){
        return this.peso;
    }
    
    private void setPeso(double peso){
        this.peso=peso;
    }
    
    private int getEdad(){
        return this.edad;
    }
    
    private void setEdad(int edad){
        this.edad=edad;
    }
    
    public abstract String sonido();
    
    public abstract String habitat();
    
    public abstract String alimentacion();
    
    public abstract String nombreCientifico();    
    
    public void caracteristicas(){
        System.out.println("--- " +this.nombre+ " (Edad: " +this.edad+ " años, Peso: " +this.peso+ " kg) ---");
        System.out.println("Sonido: " +sonido());
        System.out.println("Alimentación: " +alimentacion());
        System.out.println("Hábitat: "+habitat());
        System.out.println("Nombre científico: "+nombreCientifico());
    }
}

