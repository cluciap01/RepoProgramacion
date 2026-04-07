package ejercicio8tema11;

/**
 *
 * @author alumno
 */
public class Sede {
    private double ingresosAnuales;
    private String nombre;
    
    public Sede(double ingresosAnuales, String nombre){
        this.ingresosAnuales=ingresosAnuales;
        this.nombre=nombre;
    }

    public double getIngresosAnuales() {
        return ingresosAnuales;
    }

    public void setIngresosAnuales(double ingresosAnuales) {
        this.ingresosAnuales = ingresosAnuales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return "Sede: " + nombre + " | Ingresos: " + ingresosAnuales + "€";
    }
}
