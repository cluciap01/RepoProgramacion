package exament6;

/**
 *
 * @author alumno
 */
public class CiclistaSprinter extends Ciclista implements Pedaleable{
    private double aceleracion;
    
    public CiclistaSprinter(){
        super();
        double aceleracion;
    }
    public CiclistaSprinter(String nombre ,int energia , boolean estaEscapando, int kmAMeta, int numBidones, double velocidad, int lvlHidratacion, double aceleracion){
        super(nombre , energia , estaEscapando, kmAMeta, numBidones, velocidad, lvlHidratacion);
        this.aceleracion=aceleracion;
    }
    
    
    @Override
    public void beber() {
        
    }

    @Override
    public void comer() {
        
    }

    @Override
    public int cogerBidones() {
       if (kmAMeta < 10)
            System.out.println("No puedes coger bidones a menos de 10km de meta");
        return numBidones + 2;
    }

    @Override
    public int tirarBidon() {
        return 4;

    }

    @Override
    public void sprintar() {

    }

    @Override
    public void atacar() {

    }

    @Override
    public float recuperar(int recupera) {
        if (kmAMeta < 5) {
            this.energia = recupera;
            System.out.println(this.nombre+ " está recuperando.");
        }
        return recupera + 5;
    }
    
}
