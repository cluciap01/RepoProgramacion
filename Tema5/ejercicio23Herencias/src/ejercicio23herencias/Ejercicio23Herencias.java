package ejercicio23herencias;

/**
 *
 * @author alumno
 */
public class Ejercicio23Herencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        vehiculos vehiculos = new vehiculos();
        System.out.println(vehiculos);
        
        taxi taxi = new taxi("1234ABC", "AUDI", 90, 154);
        System.out.println(taxi);
        
        autobus autobus = new autobus("9283JKL", "Mercedes", 120, 70);
        System.out.println(autobus);
        
    }
    
}
