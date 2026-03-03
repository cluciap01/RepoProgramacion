package ejercicio13tema10;

/**
 *
 * @author alumno
 */
public class venta {
    private String nombreMes;
    private int ventasCoches;

    //Constructor
    public venta(String nombreMes, int ventasCoches) {
        this.nombreMes = nombreMes;
        this.ventasCoches = ventasCoches;
    }

    //Getters y Setters
    public String getNombreMes() {
        return nombreMes;
    }

    public void setNombreMes(String nombreMes) {
        this.nombreMes = nombreMes;
    }

    public int getVentasCoches() {
        return ventasCoches;
    }

    public void setVentasCoches(int ventasCoches) {
        this.ventasCoches = ventasCoches;
    }
    
    @Override
    public String toString() {
        return "Mes: " + nombreMes + " Ventas: " + ventasCoches;
    }
}