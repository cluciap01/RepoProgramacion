package testcalculadora;

/**
 *
 * @author alumno
 */
public abstract class Calculadora {
    
    protected double numero; // Atributo común

    //Constructores
    public Calculadora (){
        super();
    }
    public Calculadora(double numero) {
        this.numero = numero;
    }

    // Método abstracto
    public abstract void realizarOperacion();
}

