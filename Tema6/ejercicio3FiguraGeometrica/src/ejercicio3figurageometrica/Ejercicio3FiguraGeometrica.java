package ejercicio3figurageometrica;

/**
 *
 * @author Usuario
 */
public class Ejercicio3FiguraGeometrica {

    /**
     * @param args the command line arguments
     */
    public static void mostrarDatos(FiguraGeometrica figura) {
        System.out.println("Figura: " + figura.getClass().getSimpleName() + " (" + figura.color + ")"); //Este método devuelve un objeto de tipo Class que contiene información sobre la definición y la estructura del objeto
        System.out.printf("Área: %.2f\n", figura.calcularArea());
        System.out.printf("Perímetro: %.2f\n", figura.calcularPerimetro());

        // Si es un Triángulo Rectángulo, mostramos información adicional
        if (figura instanceof TrianguloRectangulo) {
            TrianguloRectangulo tr = (TrianguloRectangulo) figura;
            System.out.printf("Hipotenusa: %.2f\n", tr.calcularHipotenusa());
            System.out.println("Tipo de Triángulo: " + tr.determinarTipoTriangulo());
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        System.out.println("PRUEBA 1: INSTANCIACIÓN DIRECTA");
        
        Circulo c = new Circulo("Rojo", 5.0);
        Rectangulo r = new Rectangulo("Azul", 4.0, 8.0);
        Cuadrado q = new Cuadrado("Verde", 6.0);
        // Triángulo rectángulo con catetos 3 y 4
        TrianguloRectangulo tr = new TrianguloRectangulo("Amarillo", 3.0, 4.0);

        mostrarDatos(c);
        mostrarDatos(r);
        mostrarDatos(q);
        mostrarDatos(tr);

        // 2. Uso de Polimorfismo
        System.out.println("PRUEBA 2: USO DE POLIMORFISMO");
        
        // Se pueden crear los objetos a partir de la superclase FiguraGeometrica
        FiguraGeometrica fig1 = new Circulo("Morado", 10.0);
        FiguraGeometrica fig2 = new Rectangulo("Naranja", 10.0, 5.0);
        FiguraGeometrica fig3 = new Cuadrado("Blanco", 7.0);
        // Triángulo rectángulo con catetos 5 y 5
        FiguraGeometrica fig4 = new TrianguloRectangulo("Negro", 5.0, 5.0);

        mostrarDatos(fig1);
        mostrarDatos(fig2);
        mostrarDatos(fig3);
        mostrarDatos(fig4);
    }
}
