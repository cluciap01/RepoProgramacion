package programacionorientadaaobjetos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ProgramacionOrientadaAObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1.Instancio un objeto del tipo que he creado
        // 1.1.Con constructor parametrizado y estableciendo valores con setters
        //Scanner entrada = new Scanner(System.in);
        Coche miCoche = new Coche();
        System.out.println(miCoche.toString());
        
        miCoche.setEspejos(5);
        System.out.println(miCoche.toString());
        
        System.out.println(miCoche.getEspejos());
        
        miCoche.acelerar();
        
        // 1.2.Con constructor parametrizado, inicializando los atributos
        //con los valores pasados por parámetros
        Coche tuCoche = new Coche("Michelín","Baja",3);
        System.out.println(tuCoche.toString());
        //System.out.println(tuCoche);
        //Hace los mismo que tuCoche.toString()
        System.out.println(tuCoche.getRuedas());
        
        Bicicleta miBicicleta = new Bicicleta();
        System.out.println("¿Cuantas bicis hemos creado?");

    }    
}
