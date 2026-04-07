package ejercicio8tema11;

import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author alumno
 */
public class Ciudad {
    private String nombreCiudad;
    private Set<Sede> conjuntoSedes;//Conjunto de sedes
    
    public Ciudad(String nombreCiudad){
        this.nombreCiudad=nombreCiudad;
        this.conjuntoSedes = new HashSet<>();
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }
    
    public Set<Sede> getConjuntoSedes() { 
        return conjuntoSedes;
    }

    public void añadirSede(Sede s) {
        conjuntoSedes.add(s);
    }
    
}
