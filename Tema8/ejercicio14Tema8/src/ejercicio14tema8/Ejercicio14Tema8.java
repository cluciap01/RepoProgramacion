package ejercicio14tema8;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio14Tema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Alumno[] datos= new Alumno[2];
        
        // Añado cada mueble a su zona de array
        datos[0] = new Alumno("Pedro", 17, 6.4);
        datos[1] = new Alumno();
    }
    
}
