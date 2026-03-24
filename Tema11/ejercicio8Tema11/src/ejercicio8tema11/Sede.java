package ejercicio8tema11;

/**
 *
 * @author alumno
 */
public class Sede {
    private float ingresosAnuales;
    private String nombreSede;
    
    public Sede(float ingresosAnuales, String nombreSede){
        this.ingresosAnuales=ingresosAnuales;
        this.nombreSede=nombreSede;
    }

    public float getIngresosAnuales() {
        return ingresosAnuales;
    }

    public void setIngresosAnuales(float ingresosAnuales) {
        this.ingresosAnuales = ingresosAnuales;
    }

    public String getNombreSede() {
        return nombreSede;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }
    
}
