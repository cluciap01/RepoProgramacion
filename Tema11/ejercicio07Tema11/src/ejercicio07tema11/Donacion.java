package ejercicio07tema11;

/**
 *
 * @author Christian
 */
public class Donacion {
    private String nombreDonante;
    private double cantidad;

    public Donacion(String nombreDonante, double cantidad) {
        this.nombreDonante = nombreDonante;
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombreDonante() {
        return nombreDonante;
    }

    public void setNombreDonante(String nombreDonante) {
        this.nombreDonante = nombreDonante;
    }    

    @Override
    public String toString() {
        return "Donante: " + nombreDonante + " , Cantidad: " + cantidad + "€";
    }
}
