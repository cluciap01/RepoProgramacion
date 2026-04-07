package ejercicio8tema11;

import java.util.*; //Añade el paquete entero de java.util.

/**
 *
 * @author Christian
 */
public class Ejercicio8Tema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        ArrayList<Ciudad> listaCiudades = new ArrayList<>();
        int opcion;

        do {
            System.out.println("--- GESTIÓN MULTINACIONAL ---");
            System.out.println("1. Añadir ciudad");
            System.out.println("2. Mostrar todo");
            System.out.println("3. Sedes sobre la media");
            System.out.println("4. Buscar sede");
            System.out.println("5. Añadir sede a ciudad");
            System.out.println("6. Mostrar sedes ordenadas (Ingresos)");
            System.out.println("7. Salir");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1 -> añadirCiudad(listaCiudades, entrada);
                case 2 -> mostrarTodo(listaCiudades);
                case 3 -> mostrarSuperioresMedia(listaCiudades);
                case 4 -> System.out.println("¿Existe la sede?: " + buscarSede(listaCiudades, entrada));
                case 5 -> añadirSedeACiudad(listaCiudades, entrada);
                case 6 -> mostrarOrdenadas(listaCiudades);
                case 7 -> System.out.println("Saliendo...");
            }
        } while (opcion != 7);
    }

    //MÉTODOS SOLICITADOS
    //MÉTODO AÑADIR CIUDAD
    public static void añadirCiudad(ArrayList<Ciudad> lista, Scanner sc) {
        System.out.print("Nombre de la ciudad: ");
        Ciudad nueva = new Ciudad(sc.nextLine());
        do {
            System.out.print("Nombre de la sede: ");
            String nSede = sc.nextLine();
            System.out.print("Ingresos: ");
            double ing = sc.nextDouble(); sc.nextLine();
            nueva.añadirSede(new Sede(ing , nSede));
            System.out.print("¿Desea añadir otra sede en esta ciudad? (Si/No): ");
        } while (sc.nextLine().equalsIgnoreCase("Si"));
        lista.add(nueva);
    }

    //MÉTODO MOSTRAR CIUDAD Y SEDES
    public static void mostrarTodo(ArrayList<Ciudad> lista) {
        for (Ciudad c : lista) {
            System.out.println("CIUDAD: " + c.getNombreCiudad());
            c.getConjuntoSedes().forEach(s -> System.out.println("  " + s));
        }
    }

    //MÉTODO MOSTRAR INGRESOS
    public static void mostrarSuperioresMedia(ArrayList<Ciudad> lista) {
        double suma = 0;
        int totalSedes = 0;
        // CALCULAMOS LA MEDIA
        for (Ciudad c : lista) {
            for (Sede s : c.getConjuntoSedes()) {
                suma += s.getIngresosAnuales();
                totalSedes++;
            }
        }
        if (totalSedes == 0) return;
        double media = suma / totalSedes;
        System.out.println("Media global: " + media + ". Sedes superiores:");
        for (Ciudad c : lista) {
            for (Sede s : c.getConjuntoSedes()) {
                if (s.getIngresosAnuales() > media) System.out.println(s.getNombre());
            }
        }
    }

    //MÉTODO BUSCAR POR NOMBRE
    public static boolean buscarSede(ArrayList<Ciudad> lista, Scanner sc) {
        System.out.print("Nombre de sede a buscar: ");
        String busca = sc.nextLine();
        for (Ciudad c : lista) {
            for (Sede s : c.getConjuntoSedes()) {
                if (s.getNombre().equalsIgnoreCase(busca)) return true;
            }
        }
        return false;
    }

    // MÉTODO AÑADIR SEDE A UNA CIUDAD
    public static void añadirSedeACiudad(ArrayList<Ciudad> lista, Scanner sc) {
        System.out.print("Nombre de la ciudad: ");
        String nCiud = sc.nextLine();
        for (Ciudad c : lista) {
            if (c.getNombreCiudad().equalsIgnoreCase(nCiud)) {
                System.out.print("Nombre nueva sede: ");
                String nS = sc.nextLine();
                System.out.print("Ingresos: ");
                double ing = sc.nextDouble(); sc.nextLine();
                c.añadirSede(new Sede(ing, nS));
                return;
            }
        }
        System.out.println("Ciudad no encontrada.");
    }

    // MÉTODOS PARA ORDENAR DE MAYOR A MENOR
    public static void mostrarOrdenadas(ArrayList<Ciudad> lista) {
        // LISTA PARA ORDENAR
        List<Sede> todas = new ArrayList<>();
        for (Ciudad c : lista) {
            todas.addAll(c.getConjuntoSedes());
        }
        //ORDENAR DE MAYOR A MENOR
        todas.sort((s1, s2) -> Double.compare(s2.getIngresosAnuales(), s1.getIngresosAnuales()));
        System.out.println("SEDES ORDENADAS POR INGRESOS (Mayor a Menor)");
        todas.forEach(System.out::println);
    } 
}
