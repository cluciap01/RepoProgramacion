package ejercicio07tema11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio07Tema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Campania> todasLasCampanias = new ArrayList<>();
        int opcion;

        do {
            System.out.println("VERSIÓN BETA: GESTIÓN MULTI-CAMPAÑA");
            System.out.println("1. Añadir campaña");
            System.out.println("2. Añadir donación");
            System.out.println("3. Mostrar todo");
            System.out.println("4. Buscar campaña");
            System.out.println("5. Total recaudado global");
            System.out.println("6. Mostrar mayor donación");
            System.out.println("7. Salir");
            System.out.print("Elija opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1 -> { // Añadir campaña
                    System.out.print("Nombre de la nueva campaña: ");
                    todasLasCampanias.add(new Campania(entrada.nextLine()));
                    System.out.println("Campaña creada.");
                }
                case 2 -> { // Añadir donación a campaña específica
                    System.out.print("¿A qué campaña desea donar?: ");
                    String nombreBusca = entrada.nextLine();
                    Campania c = buscarCampania(todasLasCampanias, nombreBusca);
                    if (c != null) {
                        System.out.print("Nombre donante: ");
                        String n = entrada.nextLine();
                        System.out.print("Importe: ");
                        double cant = entrada.nextDouble();
                        c.añadirDonacion(new Donacion(n, cant));
                    } else {
                        System.out.println("Campaña no encontrada.");
                    }
                }
                case 3 -> { // Mostrar todas las campañas y sus donaciones
                    for (Campania c : todasLasCampanias) {
                        System.out.println("\nCAMPAÑA: " + c.getNombreCampania());
                        for (Donacion d : c.getListaDonaciones()) System.out.println("  " + d);
                    }
                }
                case 4 -> { // Mostrar campaña por nombre
                    System.out.print("Nombre de campaña a consultar: ");
                    Campania c = buscarCampania(todasLasCampanias, entrada.nextLine());
                    if (c != null) {
                        System.out.println("Datos de " + c.getNombreCampania() + ":");
                        for (Donacion d : c.getListaDonaciones()) System.out.println(d);
                    } else System.out.println("No existe esa campaña.");
                }
                case 5 -> { // Total dinero recaudado global
                    double totalGlobal = 0;
                    for (Campania c : todasLasCampanias) totalGlobal += c.obtenerTotalRecaudado();
                    System.out.println("Total recaudado en todas las campañas: " + totalGlobal + "€");
                }
                case 6 -> { // Mostrar mayor donación (comparación global)
                    Donacion mayor = null;
                    for (Campania c : todasLasCampanias) {
                        for (Donacion d : c.getListaDonaciones()) {
                            if (mayor == null || d.getCantidad() > mayor.getCantidad()) mayor = d;
                        }
                    }
                    if (mayor != null) System.out.println("La mayor donación es: " + mayor);
                    else System.out.println("No hay donaciones registradas.");
                }
                case 7 -> System.out.println("Saliendo de la Versión Beta...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 7);
    }

    public static Campania buscarCampania(ArrayList<Campania> lista, String nombre) {
        for (Campania c : lista) {
            if (c.getNombreCampania().equalsIgnoreCase(nombre)) return c;
        }
        return null;
    }
}
