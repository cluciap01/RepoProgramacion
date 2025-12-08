package testtelevision;

/**
 *
 * @author alumno
 */
public class TesteTelevision {

    public static void main(String[] args) {
        System.out.println("PRUEBA TELEVISOR");
        Television tv = new Television();

        tv.encender(); // Muestra canal actual (1)

        tv.mostrarInformacion();

        System.out.println("Subiendo volumen 3 veces:");
        tv.subirVolumen();
        tv.subirVolumen();
        tv.subirVolumen();

        System.out.println("Volumen actual (atributo): " + tv.getVolumen());

        tv.cambiarCanal(5.5f); // Se convierte a int (5)

        System.out.println("Bajando volumen:");
        tv.bajarVolumen();

        tv.apagar(); // Muestra mensaje de apagado

        tv.mostrarInformacion();

        System.out.println("PRUEBA RADIO");
        Radio radio = new Radio();

        radio.encender(); // Se enciende

        radio.mostrarInformacion();

        System.out.println("\nSubiendo volumen 3 veces (+5 por vez):");
        radio.subirVolumen(); // Volumen sube de 15 a 20
        radio.subirVolumen(); // Volumen sube a 25
        radio.subirVolumen(); // Volumen sube a 30

        System.out.println("Volumen actual (atributo): " + radio.getVolumen());

        radio.cambiarCanal(95.8f); // Se cambia la emisora

        System.out.println("Bajando volumen (-5):");
        radio.bajarVolumen(); // Volumen baja a 25

        radio.apagar(); // Se apaga

        radio.mostrarInformacion();
        
        
        // Polimorfismo
        System.out.println("DEMOSTRACIÓN DE POLIMORFISMO ");
        ControlRemoto dispositivo1 = new Television();
        ControlRemoto dispositivo2 = new Radio();

        dispositivo1.encender(); 
        dispositivo2.encender();

        System.out.println("Subiendo volumen desde el ControlRemoto genérico:");
        dispositivo1.subirVolumen(); // Incrementa en 1 (TV)
        dispositivo2.subirVolumen(); // Incrementa en 5 (Radio)
    }
}
