package ejercicio3figurageometrica;

/**
 *
 * @author Usuario
 */
public abstract class Triangulo extends FiguraGeometrica{
    protected double base;
    protected double altura;

    //Constructores
    public Triangulo() {
        super();
        this.base = 0;
        this.altura = 0;
    }
    public Triangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    // Implementación calcularArea()
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
    
    // Calculamos perímetro
    @Override
    public abstract double calcularPerimetro();
}
