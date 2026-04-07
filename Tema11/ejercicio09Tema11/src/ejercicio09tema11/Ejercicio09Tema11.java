package ejercicio09tema11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Christian
 */
public class Ejercicio09Tema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        TreeMap<LocalDate, Sorteo> gestionSorteos = new TreeMap<>();        
        int opcion;

        do {
            System.out.println("--- TULOTERO ---");
            System.out.println("1. Realizar sorteo");
            System.out.println("2. Repetir sorteo");
            System.out.println("3. Mostrar sorteo del mes actual");
            System.out.println("4. Mostrar sorteo de una fecha concreta");
            System.out.println("5. Realizar sorteo por fecha");
            System.out.println("6. Mostrar todos los sorteos");
            System.out.println("7. Salir");
            System.out.println("Seleccione una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1 -> realizarSorteo(gestionSorteos);
                case 2 -> repetirSorteo(gestionSorteos);
                case 3 -> mostrarSorteoMesActual(gestionSorteos);
                case 4 -> buscarSorteo(gestionSorteos, entrada);
                case 5 -> realizarSorteoPorFecha(gestionSorteos, entrada);
                case 6 -> mostrarTodo(gestionSorteos);
                case 7 -> System.out.println("Saliendo...");
            }
        } while (opcion != 7);
    }
    //MÉTODO PARA REALIZAR SORTEO
    public static void realizarSorteo(TreeMap<LocalDate, Sorteo> mapa) {
        LocalDate hoy = LocalDate.now();
        mapa.put(hoy, new Sorteo(hoy));
        System.out.println("Sorteo de hoy realizado.");
    }

    //MÉTODO PARA ELIMINAR Y VOLVER A REALIZAR EL SORTEO
    public static void repetirSorteo(TreeMap<LocalDate, Sorteo> mapa) {
        LocalDate hoy = LocalDate.now();
        mapa.remove(hoy);
        mapa.put(hoy, new Sorteo(hoy));
        System.out.println("Sorteo de hoy repetido.");
    }

    //MÉTODO PARA EL MES ACTUAL
    public static void mostrarSorteoMesActual(TreeMap<LocalDate, Sorteo> mapa) {
        int mesAct = LocalDate.now().getMonthValue();
        mapa.values().forEach(s -> {
            if (s.getFecha().getMonthValue() == mesAct) System.out.println(s);
        });
    }

    //MÉTODO BUSCAR SORTEO
    public static void buscarSorteo(TreeMap<LocalDate, Sorteo> mapa, Scanner sc) {
        System.out.print("Introduce fecha (aaaa-mm-dd): ");
        LocalDate fecha = LocalDate.parse(sc.nextLine());
        Sorteo s = mapa.get(fecha);
        System.out.println(s != null ? s : "No hay sorteo en esa fecha.");
    }

    //MÉTODO PARA REALIZAR UN SORTEO POR UNA FECHA INDICADA
    public static void realizarSorteoPorFecha(TreeMap<LocalDate, Sorteo> mapa, Scanner sc) {
        System.out.print("¿Para qué fecha? (aaaa-mm-dd): ");
        LocalDate f = LocalDate.parse(sc.nextLine());
        if (!mapa.containsKey(f)) {
            mapa.put(f, new Sorteo(f));
            System.out.println("Sorteo creado.");
        } else {
            System.out.println("Ya existe un sorteo para esa fecha.");
        }
    }

    //MÉTODO PARA MOSTRAR TODOS LOS SORTEOS
    public static void mostrarTodo(TreeMap<LocalDate, Sorteo> mapa) {
        mapa.values().forEach(System.out::println);
    }
}