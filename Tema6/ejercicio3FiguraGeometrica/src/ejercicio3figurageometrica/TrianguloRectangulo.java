package ejercicio3figurageometrica;

/**
 *
 * @author Usuario
 */
public class TrianguloRectangulo extends Triangulo{
    //Constructores
    
    public TrianguloRectangulo() {
        super();
    }
    
    public TrianguloRectangulo(String color, double base, double altura) {
        super(color, base, altura);
    }

    public double calcularHipotenusa() {
        // Hipotenusa = sqrt(base^2 + altura^2)
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }
    
    @Override
    public double calcularPerimetro() {
        double hipotenusa = calcularHipotenusa();
        return base + altura + hipotenusa;
    }

    public String determinarTipoTriangulo() {
        double hipotenusa = calcularHipotenusa();
        // Redondeamos para evitar problemas de precisión de double
        double cateto1 = Math.round(base * 100.0) / 100.0;
        double cateto2 = Math.round(altura * 100.0) / 100.0;
        double hip = Math.round(hipotenusa * 100.0) / 100.0;
        
        // Equilátero: todos los lados iguales
        if (cateto1 == cateto2 && cateto2 == hip) {
            return "Equilátero";
        } 
        // Isósceles: dos lados iguales
        else if (cateto1 == cateto2 || cateto1 == hip || cateto2 == hip) {
            return "Isósceles";
        }
        // Escaleno: todos los lados diferentes
        else {
            return "Escaleno";
        }
    }

    public String obtenerInformacion() {
        return "Triángulo Rectángulo (" + color + "): Base=" + base + " cm, Altura=" + altura + " cm";
    }
}
