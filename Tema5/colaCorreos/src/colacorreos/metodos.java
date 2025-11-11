package colacorreos;

import static colacorreos.ColaCorreos.MESA_FINAL;
import static colacorreos.ColaCorreos.MESA_INICIAL;
import static colacorreos.ColaCorreos.numeroEnvio;
import static colacorreos.ColaCorreos.numeroRecogida;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Christian Lucia Pulido
 */

public class metodos {
    
    // Genera el menú que el usuario verá para elegir una opción
    public static void mostrarMenu() {
        System.out.println(" MENU DE COLA DE CORREOS ");
        System.out.println("1. Enviar");
        System.out.println("2. Recoger");
        System.out.println("3. Salir");
        System.out.print("Elige una opción: ");
    }
    
    // Genera una letra aleatoria entre MESA_INICIAL y MESA_FINAL
    public static char generarLetraAleatoria(char inicio, char fin) {
        Random random = new Random();
        int rango = fin - inicio + 1; // número de letras posibles
        return (char) (inicio + random.nextInt(rango));
    }
    
    // Pide un número del menú al usuario
    public static int pedirOpcion(Scanner entrada) {
        int opcion = -1;
        try {
            opcion = entrada.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Debe introducir un número válido.");
            entrada.next(); // Pide de nuevo un numero del menú
        }
        return opcion;
    }
    
    // Incrementa número de envío
    public static void incrementarNumeroEnvio() {
        numeroEnvio++;
    }
    
    //Incrementa número de mesa
    public static void incrementarNumeroRecogida() {
        numeroRecogida++;
    }
    
    // Genera el número de espera para envío
    public static void NumeroEsperaEnvio() {
        char mesa = generarLetraAleatoria(MESA_INICIAL, MESA_FINAL);
        System.out.println("Su número de envío es: E-" + numeroEnvio + " , Mesa: " + mesa);
        incrementarNumeroEnvio();
    }

    // Genera el número de espera para recogida
    public static void NumeroEsperaRecogida() {
        char mesa = generarLetraAleatoria(MESA_INICIAL, MESA_FINAL);
        System.out.println("Su número de recogida es: R-" + numeroRecogida + " , Mesa: " + mesa);
        incrementarNumeroRecogida();
    }
}