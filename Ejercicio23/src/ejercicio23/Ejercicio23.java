package ejercicio23;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        Scanner precio = new Scanner (System.in);
        
        System.out.println("Por favor , introduzca el precio del modelo del ordenador que desea comprar: ");
        
        double dinero = precio.nextDouble();
        
        System.out.println("¿Cuantas unidades quiere llevarse?");
        
        int unidades = numero.nextInt();
        
        double total = dinero * unidades;
        
        System.out.println("El precio total de su compra es de: " +total+ " euros."); 
        
    }
    
}
