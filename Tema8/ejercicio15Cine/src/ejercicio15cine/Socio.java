package ejercicio15cine;

/**
 *
 * @author Usuario
 */
public class Socio {
    private String nombre;
    private double precioAbonado;

    public Socio(String nombre, double precioAbonado) {
        this.nombre = nombre;
        this.precioAbonado = precioAbonado;
    }

    public String getNombre() { return nombre; }
    public double getPrecioAbonado() { return precioAbonado; }
}
