package examenarrays;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class ExamenArrays {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Coche[] garaje = new Coche[5];
        int opcion;

        do {
            System.out.println(" MENÚ GARAJE: ");
            System.out.println("1. Aparcar coche");
            System.out.println("2. Mostrar plazas libres");
            System.out.println("3. Mostrar todos los coches");
            System.out.println("4. Mostrar titulares");
            System.out.println("5. Buscar por matrícula");
            System.out.println("6. Estado de las plazas");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = entrada.nextInt();
            entrada.nextLine(); // Limpiar búfer

            switch (opcion) {
                case 1 -> aparcarCoche(garaje, entrada);
                case 2 -> mostrarLibres(garaje);
                case 3 -> mostrarCoches(garaje);
                case 4 -> mostrarTitulares(garaje);
                case 5 -> buscarMatricula(garaje, entrada);
                case 6 -> estadoPlazas(garaje);
                case 7 -> System.out.println("Saliendo..");
                default -> System.out.println("Error. Introduzca un número entre 1 y 7");
            }
        } while (opcion != 7);
    }

    //Método Aparcar coche
    public static void aparcarCoche(Coche[] garaje, Scanner entrada) {
        int pos;
        while (true) {
            System.out.print("Elija posición (1-9): ");
            if (entrada.hasNextInt()) {
                pos = entrada.nextInt() - 1;
                entrada.nextLine();
                if (pos >= 0 && pos < 9) {
                    if (garaje[pos] == null) {
                        System.out.print("Nombre del titular: ");
                        String nombre = entrada.nextLine();
                        System.out.print("Matrícula: ");
                        String mat = entrada.nextLine();
                        garaje[pos] = new Coche(nombre, mat);
                        System.out.println("Coche aparcado correctamente.");
                        break;
                    } else {
                        System.out.println("La plaza está ocupada.");
                    }
                } else {
                    System.out.println("La posición no existe.");
                }
            } else {
                System.out.println("Error: Debe introducir un número.");
                entrada.next();
            }
        }
    }

    //Metodo mostrar plazas libres
    public static void mostrarLibres(Coche[] garaje) {
        System.out.print("Plazas libres: ");
        for (int i = 0; i < garaje.length; i++) {
            if (garaje[i] == null) System.out.print((i + 1) + " ");
        }
        System.out.println();
    }

    //Metodo mostar datos coches
    public static void mostrarCoches(Coche[] garaje) {
        for (Coche c : garaje) { 
            if (c != null) System.out.println(c);
        }
    }

    //Metodo para mostrar los titulares de los coches
    public static void mostrarTitulares(Coche[] garaje) {
        String resultado = "";
        for (Coche c : garaje) {
            if (c != null) {
                if (!resultado.isEmpty()) resultado += "#";
                resultado += c.getNombre();
            }
        }
        System.out.println("Cadena generada: " + resultado);
    }

    //Metodo para buscar por matrícula
    public static void buscarMatricula(Coche[] garaje, Scanner entrada) {
        System.out.print("Introduzca matrícula a buscar: ");
        String buscar = entrada.nextLine();
        boolean encontrado = false;
        for (int i = 0; i < garaje.length; i++) {
            if (garaje[i] != null && garaje[i].getMatricula().equalsIgnoreCase(buscar)) {
                System.out.println("El coche está en la posición: " + (i + 1));
                encontrado = true;
                break;
            }
        }
        if (!encontrado) System.out.println("Matrícula no encontrada en el garaje.");
    }

    //Metodo para recorrer el vector
    public static void estadoPlazas(Coche[] garaje) {
        System.out.print("Estado de las plazas del garaje: ");
        for (Coche c : garaje) {
            if (c == null) System.out.print("[L] ");
            else System.out.print("[X] ");
        }
        System.out.println();
    }
}