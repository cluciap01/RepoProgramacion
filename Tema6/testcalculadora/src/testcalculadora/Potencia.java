package testcalculadora;

/**
 *
 * @author alumno
 */
public class Potencia extends Calculadora{
    public Potencia() {
        super();
    }

    public Potencia(double numero) {
        super(numero);
    }
    
    private double exponente;

    public Potencia(double numero, double exponente) {
        super(numero);
        this.exponente = exponente;
    }

    @Override
    public void realizarOperacion() {
        double resultado = numero + exponente;
        System.out.println("Resultado de la potencia es : " + resultado);
    }
}