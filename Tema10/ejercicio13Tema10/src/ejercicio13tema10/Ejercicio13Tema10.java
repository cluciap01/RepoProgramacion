package ejercicio13tema10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio13Tema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<venta> listaVentas = new ArrayList<>();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
                          "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int opcion = 0;
        
        do {
            System.out.println(" MENÚ VENTAS ");
            System.out.println("1. Introduce las ventas");
            System.out.println("2. Mostrar ventas");
            System.out.println("3. Mostrar suma total de ventas");
            System.out.println("4. Mostrar ventas totales de meses que empiezan por A");
            System.out.println("5. Mostrar mes con más ventas");
            System.out.println("6. Salir");
            System.out.print("Elije una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1 -> {
                    listaVentas.clear();
                    for (String mes : meses) {
                        System.out.print("Introduce ventas para " + mes + ": ");
                        int cant = entrada.nextInt();
                        listaVentas.add(new venta(mes, cant));
                    }
                }

                case 2 -> {
                    if (listaVentas.isEmpty()) {
                        System.out.println("No hay datos. Use la opción 1.");
                    } else {
                        for (venta v : listaVentas) System.out.println(v);
                    }
                }

                case 3 -> {
                    int sumaTotal = 0;
                    for (venta v : listaVentas) {
                        sumaTotal += v.getVentasCoches();
                    }
                    System.out.println("La suma total de ventas del año es: " + sumaTotal);
                }

                case 4 -> {
                    int sumaA = 0;
                    for (venta v : listaVentas) {
                        if (v.getNombreMes().startsWith("A")) {
                            sumaA += v.getVentasCoches();
                        }
                    }
                    System.out.println("Ventas totales de meses que empiezan por 'A': " + sumaA);
                }

                case 5 -> {
                    if (!listaVentas.isEmpty()) {
                        venta maxVenta = listaVentas.get(0);
                        for (int i = 1; i < listaVentas.size(); i++) {
                            if (listaVentas.get(i).getVentasCoches() > maxVenta.getVentasCoches()) {
                                maxVenta = listaVentas.get(i);
                            }
                        }
                        System.out.println("El mes con más ventas fue: " + maxVenta.getNombreMes());
                    }
                }

                case 6 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida. Introduce un numero entre 1 y 6");
            }
        } while (opcion != 6);
    }    
}