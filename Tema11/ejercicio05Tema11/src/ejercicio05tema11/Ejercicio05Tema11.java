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
        mapaMeses.put(12, "Diciembre");
        mapaMeses.put(11, "Noviembre");
        mapaMeses.put(10, "Octubre");
        mapaMeses.put(9, "Septiembre");
        mapaMeses.put(8, "Agosto");
        mapaMeses.put(7, "Julio");
        mapaMeses.put(6, "Junio");
        mapaMeses.put(5, "Mayo");
        mapaMeses.put(4, "Abril");
        mapaMeses.put(3, "Marzo");
        mapaMeses.put(2, "Febrero");
        mapaMeses.put(1, "Enero");
        
        System.out.println(mapaMeses);
        
        Map<Integer, String> mapaOrdenado = new LinkedHashMap<>();//Orden de inserción 
        
        mapaMeses.put(12, "Diciembre");
        mapaMeses.put(11, "Noviembre");
        mapaMeses.put(10, "Octubre");
        mapaMeses.put(9, "Septiembre");
        mapaMeses.put(8, "Agosto");
        mapaMeses.put(7, "Julio");
        mapaMeses.put(6, "Junio");
        mapaMeses.put(5, "Mayo");
        mapaMeses.put(4, "Abril");
        mapaMeses.put(3, "Marzo");
        mapaMeses.put(2, "Febrero");
        mapaMeses.put(1, "Enero");
        
        System.out.println(mapaOrdenado);
    }
    
}
