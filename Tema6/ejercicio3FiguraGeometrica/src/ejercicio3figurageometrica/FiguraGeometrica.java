package ejercicio3figurageometrica;

/**
 *
 * @author Usuario
 */
public abstract class FiguraGeometrica {
    protected String color;

    //Constructores
    public FiguraGeometrica() {
        this.color = "";
    }
    public FiguraGeometrica(String color) {
        this.color = color;
    }

    // Métodos abstractos
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}
