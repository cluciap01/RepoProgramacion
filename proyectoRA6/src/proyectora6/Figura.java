package proyectora6;

/**
 *
 * @author Christian
 */
public class Figura {
    
    private String nombrepj;
    private double valor;
    private String coleccion;
    
    //Contructor por defecto
    public Figura (){
        this.nombrepj = "";
        this.valor = 0;
        this.coleccion = "";
    }
    
    //Constructor parametrizado
    public Figura (String nombrepj , double valor , String coleccion){
        this.nombrepj = nombrepj;
        this.valor = valor;
        this.coleccion = coleccion;
    }

    //Getters y Setters
    public String getNombrepj() {
        return nombrepj;
    }

    public void setNombrepj(String nombrepj) {
        this.nombrepj = nombrepj;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getColeccion() {
        return coleccion;
    }

    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }

    @Override
    public String toString() {
        return "Personaje: " +nombrepj+ "| Valor: " + valor + " | Colección: " + coleccion;
    }
 
}
