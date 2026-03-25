package ejercicio06tema11;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio06Tema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca el nombre de la campaña: ");
        Campania campana = new Campania(entrada.nextLine());
        
        int opcion;
        do {
            System.out.println("MENÚ DONACIONES");
            System.out.println("1. Añadir donación");
            System.out.println("2. Mostrar donaciones");
            System.out.println("3. Buscar por nombre de donante");
            System.out.println("4. Mostrar número de donaciones");
            System.out.println("5. Mostrar total recaudado");
            System.out.println("6. Ordenar donaciones");
            System.out.println("7. Salir");
            System.out.print("Elija opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Nombre del donante: ");
                    String nombre = entrada.nextLine();
                    System.out.print("Cantidad: ");
                    double cant = entrada.nextDouble();
                    campana.aniadirDonacionOrdenada(new Donacion(nombre, cant));
                    System.out.println("Donación añadida con éxito.");
                }
                case 2 -> campana.mostrarDonaciones();
                case 3 -> {
                    System.out.print("Nombre a buscar: ");
                    campana.mostrarPorNombre(entrada.nextLine());
                }
                case 4 -> System.out.println("Total donaciones: " + campana.obtenerNumeroDonaciones());
                case 5 -> System.out.println("Dinero total recaudado: " + campana.calcularTotalRecaudado() + "€");
                case 6 -> {
                    System.out.println("Las donaciones se encuentran ordenadas de mayor a menor:");
                    campana.mostrarDonaciones();
                }
                case 7 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción errónea. Pruebe entre 1 y 7.");
            }
        } while (opcion != 7);
    }
}