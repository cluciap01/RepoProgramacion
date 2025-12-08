package ejercicio3figurageometrica;

/**
 *
 * @author Usuario
 */
public class Cuadrado extends FiguraGeometrica{
    private double lado;

    //Constructores
    public Cuadrado() {
        super();
        this.lado = 0;
    }
    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        // Área = lado * lado
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        // Perímetro = 4 * lado
        return 4 * lado;
    }
}
