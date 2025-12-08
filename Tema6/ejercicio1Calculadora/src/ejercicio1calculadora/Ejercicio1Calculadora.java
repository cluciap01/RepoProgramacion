package ejercicio1calculadora;

/**
 *
 * @author Usuario
 */
public class Ejercicio1Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Suma operacionSuma = new Suma(50, 15);
        Multiplicacion operacionMulti = new Multiplicacion(6, 7);
        Potencia operacionPotencia = new Potencia(2, 3);
        
        // Prueba del método realizarOperacion
        operacionSuma.realizarOperacion();
        operacionMulti.realizarOperacion();
        operacionPotencia.realizarOperacion();

        System.out.println("Prueba de Polimorfismo");
        
        Calculadora calc1 = new Suma(100, 25); 
        Calculadora calc2 = new Multiplicacion(10, 10);
        Calculadora calc3 = new Potencia(5, 2);

        //Polimorfismo
        calc1.realizarOperacion(); // Invoca la implementación de Suma
        calc2.realizarOperacion(); // Invoca la implementación de Multiplicacion
        calc3.realizarOperacion(); // Invoca la implementación de Potencia
    }
}
