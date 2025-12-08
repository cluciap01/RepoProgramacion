package ejercicio8vehiculos;

/**
 *
 * @author Usuario
 */
public abstract class Vehiculo {
    protected int velocidad;
    protected String nombre;

    //Constructores
    public Vehiculo() {
        this.nombre = "";
        this.velocidad = 0;
    }
    public Vehiculo(String nombre, int velocidadInicial) {
        this.nombre = nombre;
        this.velocidad = velocidadInicial;
    }

    // Método abstracto
    public abstract void mostrarMovimiento();
}
