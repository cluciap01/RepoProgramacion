package ejercicio04tema11;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class Ejercicio04Tema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] meses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
        
        //Creamos los dos conjuntos
        Set<String> mesesHashSet = new HashSet<>();
        Set<String> mesesLinkedHashSet = new LinkedHashSet<>();
        
        //Inserción de los meses en los dos conjuntos
        for (String mes : meses) {
            mesesHashSet.add(mes);
            mesesLinkedHashSet.add(mes);
        }
        
        System.out.println(" HashSet: ");//Desordena la lista y si hay repetidos solo los muestra una vez
        for (String m : mesesHashSet) {
            System.out.println(m);
        }

        System.out.println(" LinkedHashSet: ");//Deja la lista ordenada y si hay repetidos solo los muestra una vez
        for (String m : mesesLinkedHashSet) {
            System.out.println(m);
        }
    }
}
