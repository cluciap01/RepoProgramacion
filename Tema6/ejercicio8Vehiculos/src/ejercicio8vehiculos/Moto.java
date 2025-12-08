package ejercicio8vehiculos;

/**
 *
 * @author Usuario
 */
public class Moto extends Vehiculo{ 
    private boolean haciendoCaballito;

    public Moto(String nombre, int velocidadInicial, boolean caballitoInicial) {
        super(nombre, velocidadInicial);
        this.haciendoCaballito = caballitoInicial;
    }

    @Override
    public void mostrarMovimiento() {
        // Muestra mensaje por pantalla
        System.out.println(this.nombre + ": La moto está circulando a " + this.velocidad + " km/h.");
    }

    // Método específico: hace caballito y aumenta la velocidad
    public void hacerCaballito() {
        if (!haciendoCaballito) {
            haciendoCaballito = true;
            this.velocidad += 15; // Aumenta la velocidad en 15 km/h .
            System.out.println("La moto está haciendo un caballito. La velocidad aumenta.");
        } else {
            System.out.println("La moto ya está haciendo un caballito.");
        }
    }
}
