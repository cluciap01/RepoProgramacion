package examenficheros;

import java.io.*;
import java.util.*;

/**
 *
 * @author Christian
 */
public class ExamenFicheros {

public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Declaro el ArrayList y creo el menú
        ArrayList<Producto> listaProductos = new ArrayList<>();
        int opcion;

        do {
            System.out.println(" MENÚ INVENTARIO ");
            System.out.println("1. Rellenar inventario");
            System.out.println("2. Guardar en fichero");
            System.out.println("3. Leer y procesar");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine(); // Limpiar búfer

            switch (opcion) {
                case 1 -> rellenarInventario(listaProductos, entrada);
                case 2 -> guardarInventario(listaProductos);
                case 3 -> leerYProcesar();
                case 4 -> System.out.println("Saliendo del programa...");
            }
        } while (opcion != 4);
    }

    // Metodo para rellenar la lista
    public static void rellenarInventario(ArrayList<Producto> lista, Scanner sc) {
        String continuar;
        do {
            System.out.print("Nombre del producto: ");
            String nom = sc.nextLine();
            System.out.print("Cantidad: ");
            int cant = sc.nextInt();
            System.out.print("Precio: ");
            double prec = sc.nextDouble(); sc.nextLine();
            
            lista.add(new Producto(nom, cant, prec));
            System.out.print("¿Desea introducir otro producto? (si/no): ");
            continuar = sc.nextLine();
        } while (continuar.equalsIgnoreCase("si"));
    }

    // Guardar en fichero "inventario.txt"
    public static void guardarInventario(ArrayList<Producto> lista) {
        try (PrintWriter pw = new PrintWriter(new FileWriter("inventario.txt"))) {
            for (Producto p : lista) {
                // Formato nombre#cantidad#precio según el enunciado
                pw.println(p.getNombre() + "#" + p.getCantidad() + "#" + p.getPrecio());
            }
            System.out.println("Datos guardados en inventario.txt.");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo");
        }
    }

    // Lectura y procesamiento
    public static void leerYProcesar() {
        double precioTotalGlobal = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("inventario.txt"))) {
            String linea;
            System.out.println(" LISTADO DE PRODUCTOS ");
            while ((linea = br.readLine()) != null) {
                // Divido la cadena usando el separador #
                StringTokenizer st = new StringTokenizer(linea, "#");
                if (st.countTokens() == 3) {
                    String nombre = st.nextToken();
                    int cantidad = Integer.parseInt(st.nextToken());
                    double precio = Double.parseDouble(st.nextToken());

                    // Muestra con el formato solicitado
                    System.out.println("Producto : " + nombre);
                    System.out.println("Cantidad: " + cantidad);
                    System.out.println("Precio: " + precio);
                    
                    // Acumulador para el precio total
                    precioTotalGlobal += (precio * cantidad);
                }
            }
            System.out.println("Precio total de productos: " + precioTotalGlobal);
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo inventario.txt no existe.");
        } catch (IOException e) {
            System.out.println("Error de lectura");
        }
    }
}
