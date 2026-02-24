package proyectora6;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class ProyectoRA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Figura[][] vitrina = new Figura[3][3];
        int opcion;
        
        do {
            System.out.println(" MENÚ GESTIÓN VITRINA ");
            System.out.println("1- Rellenar la vitrina");
            System.out.println("2- Mostrar figuras de una colección");
            System.out.println("3- Mostrar figura más valiosa");
            System.out.println("4- Salir");
            System.out.print("Elija una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine(); // Limpiar el búfer

            switch (opcion) {
                case 1:
                    rellenarVitrina(vitrina, entrada);
                    break;
                case 2:
                    mostrarPorColeccion(vitrina, entrada);
                    break;
                case 3:
                    mostrarMasValiosa(vitrina);
                    break;
                case 4:
                    System.out.println("Finalizando programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    }

    public static void rellenarVitrina(Figura[][] matriz, Scanner entrada) {
        for (int i = 0; i < matriz.length; i++) { // Recorre estantes
            for (int j = 0; j < matriz[i].length; j++) { // Recorre compartimentos
                System.out.println("Datos para Estante " + i + ", Compartimento " + j + ":");
                System.out.print("Nombre del personaje: ");
                String nombre = entrada.nextLine();
                System.out.print("Valor de la figura: ");
                double valor = entrada.nextDouble();
                entrada.nextLine(); 
                System.out.print("Colección: ");
                String coleccion = entrada.nextLine();
                
                matriz[i][j] = new Figura(nombre, valor, coleccion);
            }
        }
    }

    //Buscar figuras por colección
    public static void mostrarPorColeccion(Figura[][] matriz, Scanner entrada) {
        System.out.print("Introduzca el nombre de la colección a buscar: ");
        String buscar = entrada.nextLine();
        boolean encontrada = false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != null && matriz[i][j].getColeccion().equalsIgnoreCase(buscar)) {
                    System.out.println("Localizada en [" + i + "][" + j + "]: " + matriz[i][j]);
                    encontrada = true;
                }
            }
        }
        if (!encontrada) {
            System.out.println("No hay figuras de la colección '" + buscar + "'.");
        }
    }

    //Obtener la figura con mayor valor
    public static void mostrarMasValiosa(Figura[][] matriz) {
        Figura maxFigura = null;
        int estanteMax = 0, compMax = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != null) {
                    if (maxFigura == null || matriz[i][j].getValor() > maxFigura.getValor()) {
                        maxFigura = matriz[i][j];
                        estanteMax = i;
                        compMax = j;
                    }
                }
            }
        }

        if (maxFigura != null) {
            System.out.println(" FIGURA MÁS VALIOSA ");
            System.out.println(maxFigura);
            System.out.println("Ubicación: Estante " + estanteMax + ", Compartimento " + compMax);
        } else {
            System.out.println("La vitrina está vacía.");
        }
    }
}