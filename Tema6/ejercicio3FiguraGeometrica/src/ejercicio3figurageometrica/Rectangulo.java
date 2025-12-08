package ejercicio3figurageometrica;

/**
 *
 * @author Usuario
 */
public class Rectangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    //Constructores
    public Rectangulo() {
        super();
        this.base = 0;
        this.altura = 0;
    }
    public Rectangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        // Área = base * altura
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        // Perímetro = 2 * (base + altura)
        return 2 * (base + altura);
    }
}
