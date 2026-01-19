package ejercicio14temperaturas;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class Ejercicio14Temperaturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double[][] temperaturas = new double[4][7];
        String[] dias = {
            "Lunes", "Martes", "Miércoles",
            "Jueves", "Viernes", "Sábado", "Domingo"  
    };
    
        int opcion;
        
        do{
            System.out.println("========");
            System.out.println(" MENÚ ");
            System.out.println("========");
            System.out.println("1. Rellenar temperaturas");
            System.out.println("2. Mostrar las temperaturas");
            System.out.println("3. Visualizar la temperatura media del mes");
            System.out.println("4. Día o días más calurosos del mes");
            System.out.println("5. Salir del programa");
        
        opcion = entrada.nextInt();
        
            switch (opcion) {
                case 1:
                    rellenarTemperaturas(temperaturas, entrada);
                    break;
                case 2:
                    mostrarTemperaturas(temperaturas , dias);
                    break;
                case 3:
                    System.out.println("Temperatura media del mes: "
                            + mediaMes(temperaturas) + " ºC");
                    break;
                case 4:
                    diasMasCalurosos(temperaturas, dias);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");;
            }
        }while (opcion != 5);
    }
    
    public static void rellenarTemperaturas(double[][] temperaturas, Scanner entrada) {
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Semana " + (i + 1));
            for (int j = 0; j < temperaturas[i].length; j++) {
                System.out.print("Temperatura del día " + (j + 1) + ": ");
                temperaturas[i][j] = entrada.nextDouble();
            }
        }
    }

    public static void mostrarTemperaturas(double[][] temperaturas , String[] dias){
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Semana " + (i + 1));
            for (int j = 0; j < temperaturas[i].length; j++) {
                System.out.println(dias[j] + ": " + temperaturas[i][j] + " ºC");
            }
        }
    }
    
    public static double mediaMes(double [][] temperaturas){
        return 0;
    }
        
    public static void diasMasCalurosos(double[][] temperaturas , String[] dias){
     
    }
             
}