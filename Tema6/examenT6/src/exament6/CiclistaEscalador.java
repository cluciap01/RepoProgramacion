package exament6;

/**
 *
 * @author alumno
 */
public class CiclistaEscalador extends Ciclista implements Pedaleable{
    private double potencia;
    private double fuerza;

    public CiclistaEscalador(){
        super();
        double potencia=0;
        double fuerza=0;
    }
    
    public CiclistaEscalador(String nombre ,int energia , boolean estaEscapando, int kmAMeta, int numBidones, double velocidad, int lvlHidratacion, double potencia , double fuerza){
        super(nombre , energia , estaEscapando, kmAMeta, numBidones, velocidad, lvlHidratacion);
        this.potencia=potencia;
        this.fuerza=fuerza;
    }
    
    private double getPotencia(){
        return this.potencia;
    }
    
    private void setPotencia(double potencia){
        this.potencia=potencia;
    }
    
    private double getFuerza(){
        return this.fuerza;
    }
    
    private void setFuerza(double fuerza){
        this.fuerza=fuerza;
    }
    
    @Override
    public void beber() {
        return ;
    }

    @Override
    public void comer() {
        if (kmAMeta > 100)
              //no se como añadirle el +30 de energia
              System.out.println("El escalador " +nombre+ " acaba de tomar un gel. Su energía ahora es de " +energia);
        
    }
    
    @Override
    public int cogerBidones() {
       if (kmAMeta < 10)
            System.out.println("No puedes coger bidones a menos de 10km de meta");
        return numBidones + 2;
    }

    @Override
    public int tirarBidon() {
        return numBidones - 1;
    }
    
    @Override
    public void sprintar() {
        
    }

    @Override
    public void atacar() {

    }

    @Override
    public float recuperar(int recupera) {
        if (kmAMeta < 15) {
            this.energia = recupera;
            System.out.println(this.nombre+ " está recuperando.");
        }
        return recupera + 5;
    }
}
