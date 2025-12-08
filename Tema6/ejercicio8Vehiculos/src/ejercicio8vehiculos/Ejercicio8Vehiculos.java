package ejercicio8vehiculos;

/**
 *
 * @author Usuario
 */
public class Ejercicio8Vehiculos {

    public static void procesarVehiculo(Vehiculo vehiculo) {

        vehiculo.mostrarMovimiento(); 

        if (vehiculo instanceof Coche) {
            
            Coche coche = (Coche) vehiculo;
            coche.encenderAire();
            coche.mostrarMovimiento();
        }
        else if (vehiculo instanceof Moto) {

            Moto moto = (Moto) vehiculo;
            moto.hacerCaballito();
            moto.mostrarMovimiento(); // Muestra el movimiento de la moto
        }
    }
    public static void main(String[] args) {
        Vehiculo miCoche = new Coche("Coche Deportivo", 100, false);
        Vehiculo miMoto = new Moto("Moto Cross", 80, false);

        System.out.println(" Procesando Coche ");

        procesarVehiculo(miCoche); 

        System.out.println(" Procesando Moto ");

        procesarVehiculo(miMoto);
    }
    
}
