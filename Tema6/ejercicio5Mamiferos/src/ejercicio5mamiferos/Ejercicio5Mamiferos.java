package ejercicio5mamiferos;

/**
 *
 * @author Usuario
 */
public class Ejercicio5Mamiferos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("PRUEBA 1: ");

        Ornitorrinco orny = new Ornitorrinco("Perry", "Macho", "Marrón", 5, 2);
        Murcielago bat = new Murcielago("Bato", "Macho", "Negro", 2, 10.0);

        System.out.println("Prueba Ornitorrinco");
        orny.mostrarInfoBase();
        System.out.println(orny.obtenerMensajeOviparo());
        orny.mostrarNumHuevos();
        orny.ponerHuevo();
        orny.incubarHuevo();

        System.out.println("Prueba Murciélago");
        bat.mostrarInfoBase();
        System.out.println(bat.obtenerMensajeVolador());
        bat.mostrarAlturaVuelo();
        bat.aumentarAlturaVuelo();
        bat.bajarAlturaVuelo();
       
        //Uso de Polimorfismo
        System.out.println("PRUEBA 2: POLIMORFISMO");

        // Polimorfismo con Oviparo
        Oviparo oviparosAnimal = new Ornitorrinco("Sheila", "Hembra", "Crema", 3, 0); 
        
        System.out.println("Polimorfismo Oviparo");
        // Solo podemos llamar a los métodos definidos en la interfaz Ovíparos.
        System.out.println(oviparosAnimal.obtenerMensajeOviparo());
        oviparosAnimal.ponerHuevo();
        oviparosAnimal.ponerHuevo();
        oviparosAnimal.mostrarNumHuevos();
        
        // Polimorfismo con Volador
        Volador vuelaAnimal = new Murcielago("Noche", "Hembra", "Gris", 1, 50.0); 

        System.out.println("Polimorfismo Volador");
        // Solo podemos llamar a los métodos definidos en la interfaz Volador.
        System.out.println(vuelaAnimal.obtenerMensajeVolador());
        vuelaAnimal.aumentarAlturaVuelo(); // Aumenta 5 metros
        vuelaAnimal.aumentarAlturaVuelo(); // Aumenta 5 metros
        vuelaAnimal.mostrarAlturaVuelo();
    }
    
}
