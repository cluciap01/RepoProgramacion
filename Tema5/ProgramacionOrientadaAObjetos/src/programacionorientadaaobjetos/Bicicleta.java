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
}
    public Bicicleta(int ruedas , String manillar , String pedales , String frenos , boolean estaPedaleando){
        this.ruedas = ruedas;
        this.manillar = manillar;
        this.pedales = pedales;
        this.frenos = frenos;
        this.estaPedaleando = estaPedaleando;
        //Llamamos al metodo definido incrementarNumBicletas
        incrementarNumBicletas();
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
    //To String
    @Override
    public String toString(){
        return "Mi biciclera tiene " + this.ruedas + " ruedas " +
                " , un manillar " + this.manillar + 
                " , unos pedales " + this.pedales +
                " , unos frenos " + this.frenos +
                " y ahora ¿estoy pedaleando? " +this.estaPedaleando;
    
    }
}
