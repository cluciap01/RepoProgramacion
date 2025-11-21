package ejercicio15direccion;

/**
 *
 * @author Christian
 */
public class Ejercicio15TestDireccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos direcciones para futuros empleados
        direccion d1 = new direccion("Calle Sol", 10, 1, "Madrid");
        direccion d2 = new direccion("Avenida Luna", 5, 2, "Barcelona");

        // Creamos empleados y se les asignan datos
        empleado e1 = new empleado("Juan Perez", 30000, d1);
        empleado e2 = new empleado("Maria Lopez", 45000, d2);
        
        //Obtenemos el estado de los empleados
        e1.obtenerEstado();
        e2.obtenerEstado();
    }
}
