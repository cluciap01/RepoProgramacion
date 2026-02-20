package ejercicio15cine;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio15Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántas películas desea gestionar? ");
        int numPelis = sc.nextInt();
        Pelicula[] cartelera = new Pelicula[numPelis];
        int opcion;

        do {
            System.out.println("\n--- SOFTWARE NOS GUSTA EL CINE ---");
            System.out.println("1. Rellenar películas y socios asistentes.");
            System.out.println("2. Mostrar películas y socios.");
            System.out.println("3. Mostrar película más rentable.");
            System.out.println("4. Mostrar película menos rentable.");
            System.out.println("5. Buscar beneficio e información por título.");
            System.out.println("6. Contar socios con aportación superior a X.");
            System.out.println("7. Salir del programa.");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    for (int i = 0; i < cartelera.length; i++) {
                        System.out.print("Título de la película " + (i+1) + ": ");
                        String t = sc.nextLine();
                        System.out.print("Coste de la licencia: ");
                        double c = sc.nextDouble();
                        cartelera[i] = new Pelicula(t, c);
                        
                        System.out.println("Introduzca los 4 socios (Aforo completo):");
                        for (int j = 0; j < 4; j++) {
                            sc.nextLine();
                            System.out.print("  Nombre socio " + (j+1) + ": ");
                            String n = sc.nextLine();
                            System.out.print("  Precio abonado (voluntad): ");
                            double p = sc.nextDouble();
                            cartelera[i].setAsistente(j, new Socio(n, p));
                        }
                        sc.nextLine();
                    }
                    break;

                case 2:
                    for (Pelicula p : cartelera) {
                        if (p != null) {
                            System.out.println("Película: " + p.getTitulo());
                            for (Socio s : p.getAsistentes()) {
                                if (s != null) System.out.println("  - " + s.getNombre() + " aportó " + s.getPrecioAbonado() + "€");
                            }
                        }
                    }
                    break;

                case 3: // Película más rentable
                    Pelicula masRentable = cartelera;
                    for (Pelicula p : cartelera) {
                        if (p != null && p.calcularBeneficioNeto() > masRentable.calcularBeneficioNeto())
                            masRentable = p;
                    }
                    System.out.println("La más rentable es: " + masRentable.getTitulo() + " con " + masRentable.calcularBeneficioNeto() + "€");
                    break;
                    
                case 4: // Mostrar película menos rentable
                    if (cartelera == null || cartelera == null) {
                        System.out.println("Error: No hay películas registradas para comparar.");
                    } else {
                        // Inicializamos con la primera película del vector como referencia
                        Pelicula menosRentable = cartelera; 

                        // Recorremos el array buscando el valor mínimo
                    for (int i = 1; i < cartelera.length; i++) {
                        if (cartelera[i] != null) {
                        // Comparamos si el beneficio neto de la actual es MENOR que el de la guardada
                            if (cartelera[i].calcularBeneficioNeto() < menosRentable.calcularBeneficioNeto()) {
                            menosRentable = cartelera[i];
                            }
                        }
                    }
                    // Mostramos el resultado según el esquema solicitado
                    System.out.println("La película menos rentable es: " + menosRentable.getTitulo() + 
                           " con un beneficio de " + menosRentable.calcularBeneficioNeto() + "€");
                    }
                    break;

                case 5: // Búsqueda específica
                    System.out.print("Nombre de la película a buscar: ");
                    String buscar = sc.nextLine();
                    for (Pelicula p : cartelera) {
                        if (p != null && p.getTitulo().equalsIgnoreCase(buscar)) {
                            System.out.println("Beneficio neto: " + p.calcularBeneficioNeto());
                            System.out.println("Socios que asistieron:");
                            for (Socio s : p.getAsistentes()) System.out.println(" - " + s.getNombre());
                        }
                    }
                    break;

                case 6: // Filtro por cantidad
                    System.out.print("Indique la cantidad mínima: ");
                    double minima = sc.nextDouble();
                    int contador = 0;
                    for (Pelicula p : cartelera) {
                        if (p != null) {
                            for (Socio s : p.getAsistentes()) {
                                if (s != null && s.getPrecioAbonado() > minima) contador++;
                            }
                        }
                    }
                    System.out.println("Número de socios: " + contador);
                    break;
            }
        } while (opcion != 7); // Persistencia hasta pulsar 7
    }
}