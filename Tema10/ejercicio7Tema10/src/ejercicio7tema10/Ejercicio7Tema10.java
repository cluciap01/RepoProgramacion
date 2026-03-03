package ejercicio7tema10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio7Tema10 {

    public final static int SEMANAS = 4;
    public final static int DIAS = 7;

    public static void rellenar(ArrayList<ArrayList<Integer>> temperaturas , Scanner entrada) {
        for(int i = 0; i < SEMANAS; i++){
            ArrayList<Integer> dias = new ArrayList<>();
            
            for(int j = 0; j < DIAS; j++){
                dias.add((int)(Math.random()*15));
            }
            
            temperaturas.add(dias);
        }
    }
    
    public static void mostrar (ArrayList<ArrayList<Integer>> temperaturas , String[] nombreDias){
        for(int i = 0; i < SEMANAS; i++){
            System.out.println("Semana " + (i + 1));
            for(int j = 0; j < DIAS; j++){
                System.out.println(nombreDias[j] + " : " +temperaturas.get(i).get(j)+ " ºC ");
            }
        }
    }
    
    public static void calcularMedia(ArrayList<ArrayList<Integer>> temperaturas) {
        int media = 0;
        
        for(int i = 0; i < SEMANAS; i++){  
            for(int j = 0; j < DIAS; j++){
                media += temperaturas.get(i).get(j);
            }
        }
        media/=SEMANAS * DIAS;
        System.out.println("La temperatura media del mes es: " +media);
    }
    
    public static void mostrarTemperaturaMaxima(ArrayList<ArrayList<Integer>> temperaturas, String[] nombreDias) {
        int maxTemp = 0 , tempActual;
        for(int i = 0; i < SEMANAS; i++){  
            for(int j = 0; j < DIAS; j++){
                tempActual = temperaturas.get(i).get(j);
                if (tempActual > maxTemp){
                    maxTemp = tempActual;
                }
            }
        }
        System.out.println("Los dias con temperaturas mas altas son:");
        for(int i = 0; i < SEMANAS; i++){  
            for(int j = 0; j < DIAS; j++){
                if(temperaturas.get(i).get(j)==maxTemp){
                    System.out.println("* El " + nombreDias[j] + " de la Semana " + (i + 1) + " con " + maxTemp + " grados.");
                }
                
            }
        }
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> temperatura = new ArrayList<>();
        String[] nombreDias = {"Lunes" , "Martes" ,"Miercoles" , "Jueves" , "Viernes" , "Sabado" , "Domingo"};
        int opcion = 0;
        
        do {
            System.out.println(" MENÚ TEMPERATURAS ");
            System.out.println("1. Rellenar temperaturas");
            System.out.println("2. Mostrar temperaturas");
            System.out.println("3. Media de temperaturas del mes");
            System.out.println("4. Día o días más calurosos");
            System.out.println("5. Salir");
            System.out.print("Elije una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1 -> rellenar(temperatura, entrada);
                case 2 -> mostrar(temperatura, nombreDias);
                case 3 -> calcularMedia(temperatura);
                case 4 -> mostrarTemperaturaMaxima(temperatura, nombreDias);
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida. Introduce un numero entre 1 y 5");
            }
        } while (opcion != 5);
    }
}
