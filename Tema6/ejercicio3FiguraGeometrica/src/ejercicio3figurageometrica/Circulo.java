package ejercicio3figurageometrica;

/**
 *
 * @author Usuario
 */
public class Circulo extends FiguraGeometrica{
    private double radio;

    //Constructores
    public Circulo() {
        super();
        this.radio = 0;
    }
    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        // Área = PI * radio^2
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        // Perímetro = 2 * PI * radio
        return 2 * Math.PI * radio;
    }
}
