package ejercicio06tema11;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author Christian
 */
public class Campania {
    private String nombreCampania;
    private ArrayList<Donacion> listaDonaciones;
    //Set<String> listaDonacionesLinkedHashSet = new LinkedHashSet<>();

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
    
    public void aniadirDonacionOrdenada(Donacion nueva) {
        int i = 0;
        while (i < listaDonaciones.size() && listaDonaciones.get(i).getCantidad() > nueva.getCantidad()) {
            i++;
        }
        listaDonaciones.add(i, nueva);
    }

    public void mostrarDonaciones() {
        if (listaDonaciones.isEmpty()) {
            System.out.println("No hay donaciones registradas.");
        } else {
            for (Donacion d : listaDonaciones) System.out.println(d);
        }
    }
    
    public void mostrarPorNombre(String nombre) {
        boolean encontrado = false;
        for (Donacion d : listaDonaciones) {
            if (d.getNombreDonante().equalsIgnoreCase(nombre)) {
                System.out.println(d);
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("No existen donaciones de: " + nombre);
    }

    public int obtenerNumeroDonaciones() {
        return listaDonaciones.size();
    }

    public double calcularTotalRecaudado() {
        double total = 0;
        for (Donacion d : listaDonaciones) {
            total += d.getCantidad();
        }
        return total;
    }
}
