package ejercicio05tema11;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author alumno
 */
public class Ejercicio05Tema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] meses = {
            "[12,Diciembre]", "[11,Noviembre]", "[10,Octubre]", "[09,Septiembre]", "[08,Agosto]", "[07,Julio]",
            "[06,Junio]", "[05,Mayo]", "[04,Abril]", "[03,Marzo]", "[02,Febrero]", "[01,Enero]"
        };
        
        Map<Integer, String> mapaMeses = new TreeMap<>();//Orden ascendente
        Map<Integer, String> mapaOrdenado = new LinkedHashMap<>();//Orden de inserción 
        
    }
    
}
