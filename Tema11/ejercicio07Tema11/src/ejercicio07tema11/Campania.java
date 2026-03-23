package ejercicio07tema11;

import java.util.ArrayList;

/**
 *
 * @author Christian
 */
public class Campania {
    private String nombreCampania;
    private ArrayList<Donacion> listaDonaciones;

    public Campania(String nombreCampania) {
        this.nombreCampania = nombreCampania;
        this.listaDonaciones = new ArrayList<>();
    }

    public ArrayList<Donacion> getListaDonaciones() {
        return listaDonaciones;
    }

    public void setListaDonaciones(ArrayList<Donacion> listaDonaciones) {
        this.listaDonaciones = listaDonaciones;
    }

    public String getNombreCampania() {
        return nombreCampania;
    }

    public void setNombreCampania(String nombreCampania) {
        this.nombreCampania = nombreCampania;
    }

    public void añadirDonacion(Donacion d) {
        listaDonaciones.add(d);
    }

    public double obtenerTotalRecaudado() {
        double total = 0;
        for (Donacion d : listaDonaciones) total += d.getCantidad();
        return total;
    }
}
