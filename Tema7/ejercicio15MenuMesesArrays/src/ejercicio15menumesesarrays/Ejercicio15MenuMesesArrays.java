package ejercicio15menumesesarrays;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio15MenuMesesArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] ventas = new int[12];
        String[] meses = {
            "Enero" , "Febrero" , "Marzo" , "Abril" , "Mayo" , "Junio" ,
            "Julio" , "Agosto" , "Septiembre" , "Octubre" , "Noviembre" , "Diciembre"};
        int opcion;

        do{
            System.out.println("========");
            System.out.println(" MENÚ ");
            System.out.println("========");
            System.out.println("1. Ventas aleatorias");
            System.out.println("2. Mostrar ventas");
            System.out.println("3. Mostrar ventas al revés");
            System.out.println("4. Mostrar suma total de ventas al año");
            System.out.println("5. Mostrar ventas totales en los meses pares");
            System.out.println("6. Mostrar el nombre del mes con más ventas");
            System.out.println("7. Salir del programa");
            
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    rellenarVentas(ventas);
                    System.out.println("¡Ventas listas!");
                    break;
                case 2:
                    mostrarVentas(ventas,meses);
                    break;
                case 3:
                    mostrarVentasAlReves(ventas);
                    break;
                case 4:
                    System.out.println("La suma total del año es:" + sumaVentas(ventas));
                    break;
                case 5:
                    mostrarVentasMesesPares(ventas , meses);
                    break;
                case 6:
                    mostrarMesMasVentas(ventas , meses);
                    break;
                case 7:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }while (opcion != 7);
    }
    
    // Opción 1
    public static void rellenarVentas(int[] ventas) {
        for (int i = 0; i < ventas.length; i++) {
            ventas[i] = (int)(Math.random() * 91) + 10; // entre 10 y 100
        }
    }

    // Opción 2
    public static void mostrarVentas(int[] ventas, String[] meses) {
        for (int i = 0; i < ventas.length; i++) {
            System.out.println(meses[i] + ": " + ventas[i]);
        }
    }

    // Opción 3
    public static void mostrarVentasAlReves(int[] ventas) {
        for (int i = ventas.length - 1; i >= 0; i--) {
            System.out.print(ventas[i] + " ");
        }
        System.out.println();
    }

    // Opción 4
    public static int sumaVentas(int[] ventas) {
        int suma = 0;
        for (int v : ventas) {
            suma += v;
        }
        return suma;
    }

    // Opción 5
    public static void mostrarVentasMesesPares(int[] ventas, String[] meses) {
        for (int i = 1; i < ventas.length; i += 2) {
            System.out.println(meses[i] + ": " + ventas[i]);
        }
    }

    // Opción 6
    public static void mostrarMesMasVentas(int[] ventas, String[] meses) {
        int mayor = ventas[0];
        int posicion = 0;

        for (int i = 1; i < ventas.length; i++) {
            if (ventas[i] > mayor) {
                mayor = ventas[i];
                posicion = i;
            }
        }

        System.out.println("El mes con más ventas es " + meses[posicion] +
                           " con " + mayor + " ventas.");
    }
}
