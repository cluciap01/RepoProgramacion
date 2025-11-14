package programacionorientadaaobjetos;

/**
 *
 * @author alumno
 */
public class Bicicleta {
    //Atributos
    private int ruedas;
    private String manillar;
    private String pedales;
    private String frenos;
    private boolean estaPedaleando;
    
    public static int numBicicletas = 0;
    
    private Ciclista ciclista;
    //Constructores
    //Por defecto
    public Bicicleta(){
        this.ruedas = 0;
        this.manillar = "";
        this.pedales = "";
        this.frenos = "";
        this.estaPedaleando = false;
        //Llamamos al metodo definido incrementarNumBicletas
        incrementarNumBicletas();
        
        this.ciclista = new Ciclista();
}
    
    public Bicicleta(int ruedas , String manillar , String pedales , String frenos , boolean estaPedaleando, Ciclista ciclista){
        this.ruedas = ruedas;
        this.manillar = manillar;
        this.pedales = pedales;
        this.frenos = frenos;
        this.estaPedaleando = estaPedaleando;
        //Llamamos al metodo definido incrementarNumBicletas
        incrementarNumBicletas();
        
        this.ciclista = ciclista;
    }
    
    //Getters y setters
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
    
    public int getRuedas(){
        return this.ruedas;
    }
    
    public void setManillar(String manillar) {
        this.manillar = manillar;
    }
    
    public String getManillar(){
        return this.manillar;
    }
    
    public void setPedales(String pedales) {
        this.pedales = pedales;
    }
    
    public String getPedales(){
        return this.pedales;
    }
    
    public void setFrenos(String frenos) {
        this.frenos = frenos;
    }
    
    public String getFrenos(){
        return this.frenos;
    }
    
    public void setEstaPedaleando(boolean estaPedaleando) {
        this.estaPedaleando = estaPedaleando;
    }
    
    public boolean getEstaPedaleando(){
        return this.estaPedaleando;
    }
    
    public int getnumBicicletas(){
        return this.numBicicletas;
    }
    
    //Métodos
    public void acelerar(){
        System.out.println("Acelerando..");
    }
    
    private static void incrementarNumBicletas(){
        numBicicletas++;
    }
    
    public Ciclista getCiclista(){
        return this.ciclista;
    }
    
    public void setCiclista(Ciclista ciclista){
        this.ciclista = ciclista;
    }
    //To String
    @Override
    public String toString(){
        return "Mi biciclera tiene " + this.ruedas + " ruedas " +
                " , un manillar " + this.manillar + 
                " , unos pedales " + this.pedales +
                " , unos frenos " + this.frenos +
                " y ahora ¿estoy pedaleando? " +this.estaPedaleando+
                
                this.ciclista;//Tambien se puedes poner this.ciclista.toString();
    
    }
}
