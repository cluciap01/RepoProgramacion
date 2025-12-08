package ejercicio8vehiculos;

/**
 *
 * @author Usuario
 */
public class Coche extends Vehiculo{
    private boolean aireEncendido;

    //Constructores
    public Coche() {
        super();
        this.aireEncendido = false;
    }
    public Coche(String nombre, int velocidadInicial, boolean aireInicial) {
        super(nombre, velocidadInicial);
        this.aireEncendido = aireInicial;
    }

    @Override
    public void mostrarMovimiento() {
        // Muestra mensaje por pantalla
        System.out.println(this.nombre + ": El coche está circulando a " + this.velocidad + " km/h.");
    }

    // Método específico: enciende el aire y reduce la velocidad
    public void encenderAire() {
        if (!aireEncendido) {
            aireEncendido = true;
            this.velocidad -= 10; // Decrementa la velocidad en 10 km/h 
            System.out.println("El coche ha encendido el aire. La velocidad se reduce.");
        } else {
            System.out.println("El aire ya está encendido.");
        }
}
}
