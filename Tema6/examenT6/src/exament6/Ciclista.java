package exament6;

/**
 *
 * @author alumno
 */
public abstract class Ciclista {
    
    public String nombre;
    public int energia;
    public boolean estaEscapando;
    public int kmAMeta;
    public int numBidones;
    public double velocidad;
    public int lvlHidratacion;
    public static int ciclistasCreados;
    
    //Constructor por defecto
    public Ciclista(){
        this.nombre="";
        this.energia=50;
        this.estaEscapando=false;
        this.kmAMeta=120;
        this.numBidones=2;
        this.velocidad=0;
        this.lvlHidratacion=50;
    }
    //Constructor parametrizado
    
    public Ciclista(String nombre ,int energia , boolean estaEscapando, int kmAMeta, int numBidones, double velocidad, int lvlHidratacion){
        this.nombre=nombre;
        this.energia=energia;
        this.estaEscapando=estaEscapando;
        this.kmAMeta=kmAMeta;
        this.numBidones=numBidones;
        this.velocidad=velocidad;
        this.lvlHidratacion=lvlHidratacion;
    }
    
    //GETTERS y SETTERS
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public int getEnergia(){
        return this.energia;
    }
    
    public void setEnergia(int energia){
        this.energia=energia;
    }
    
    public boolean getEstaEscapando(){
        return this.estaEscapando;
    }
    
    public void setEstaEscapando(boolean estaEscapando){
        this.estaEscapando=estaEscapando;
    }
    
    public int getKmAMeta(){
        return this.kmAMeta;
    }
    
    public void setKmAMeta(int kmAMeta){
        this.kmAMeta=kmAMeta;
    }
    
    public int getNumBidones(){
        return this.numBidones;
    }
    
    public void setNumBidones(int numBidones){
        this.numBidones=numBidones;
    }
    
    public double getVelocidad(){
        return this.velocidad;
    }
    
    public void setVelocidad(double velocidad){
        this.velocidad=velocidad;
    }
    public int getLvlHidratacion(){
        return this.lvlHidratacion;
    }
    
    public void setLvlHidratacion(int lvlHidratacion){
        this.lvlHidratacion=lvlHidratacion;
    }
    
    //Metodos abstractos
    public abstract void beber();
    public abstract void comer();
    public abstract int cogerBidones();
    public abstract int tirarBidon();
    
    public void caracteristicas(){
        System.out.println("--- " +this.nombre+ " ---");
        System.out.println("Energia: " +this.energia);
        System.out.println("¿Esta Escapando?: " +this.estaEscapando);
        System.out.println("¿Cuántos km para la meta le quedan?: "+kmAMeta);
        System.out.println("Número de bidones: "+numBidones);
        System.out.println("Velocidad: "+velocidad+ " kmh");
        System.out.println("Nivel de hidratación: "+lvlHidratacion);
    }
    public int conteoCiclistas(){
        return ciclistasCreados ++;
    }
}


    
    

