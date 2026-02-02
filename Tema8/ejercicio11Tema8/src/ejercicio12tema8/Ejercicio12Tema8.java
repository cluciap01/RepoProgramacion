package ejercicio12tema8;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author alumno
 */
public class Ejercicio12Tema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        Mueble[] muebles= new Mueble[4];
        
        //Menú para pedir al usuario
        
        
        // Añado cada mueble a su zona de array
        muebles[0] = new Mueble(24.5, "Mesa");
        muebles[1] = new Mueble();
        
        //Implementacion de descripción
        muebles[0].setDescripcion("Mesa de comedor");
        muebles[1].setDescripcion("Silla de aluminio");
        
        // Mostrar información por pantalla
        System.out.println("Mueble 1:");
        System.out.println("Precio: " + muebles[0].getPrecio());
        System.out.println("Descripción: " + muebles[0].getDescripcion());

        System.out.println("Mueble 2:");
        System.out.println("Precio: " + muebles[1].getPrecio());
        System.out.println("Descripción: " + muebles[1].getDescripcion());
    }
}
