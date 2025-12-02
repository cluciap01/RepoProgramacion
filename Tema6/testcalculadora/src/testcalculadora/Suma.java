package testcalculadora;

/**
 *
 * @author alumno
 */
public class Suma extends Calculadora {

    private double sumando;

    public Suma(double numero, double sumando) {
        super(numero);
        this.sumando = sumando;
    }

    @Override
    public void realizarOperacion() {
        double resultado = numero + sumando;
        System.out.println("Resultado de la suma: " + resultado);
    }
}

