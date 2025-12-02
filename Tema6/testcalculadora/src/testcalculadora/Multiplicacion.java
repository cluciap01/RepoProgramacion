package testcalculadora;

/**
 *
 * @author alumno
 */
public class Multiplicacion extends Calculadora{
    
    //Constructores
    public Multiplicacion (){
        super();
    }
   private double multiplicando;

    public Multiplicacion(double numero, double multiplicando) {
        super(numero);
        this.multiplicando = multiplicando;
    }

    @Override
    public void realizarOperacion() {
        double resultado = numero * multiplicando;
        System.out.println("Resultado de la multiplicacion es : " + resultado);
    }
}