package ejercicio25ordenadores;

import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author Christian
 */
public class Ejercicio25ordenadores {
private static final String[] PROCESADORES_VALIDOS = {"Intel i7", "AMD Ryzen 9", "Intel i5", "AMD Ryzen 5"};

    private static Scanner entrada = new Scanner(System.in);

    // Pide un entero, controlando la excepción si no es un número.
    private static int pedirEntero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                int valor = entrada.nextInt();
                entrada.nextLine(); // Limpiar buffer
                return valor;
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, introduzca un número entero válido.");
                entrada.nextLine(); // Limpiar la entrada incorrecta
            }
        }
    }

    private static double pedirDouble(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                double valor = entrada.nextDouble();
                entrada.nextLine(); // Limpiar buffer
                return valor;
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, introduzca un número válido.");
                entrada.nextLine(); // Limpiar la entrada incorrecta
            }
        }
    }

    public static int validarCapacidadDiscoDuro() {
        int disco;
        do {
            disco = pedirEntero("    -> Capacidad del Disco Duro (GB, debe ser múltiplo de 5): ");
            if (disco <= 0 || disco % 5 != 0) {
                System.out.println("    [ERROR] La capacidad del disco debe ser positiva y múltiplo de 5.");
            }
        } while (disco <= 0 || disco % 5 != 0);
        return disco;
    }

    // Pide el precio, controlando que sea mayor que 0
    public static double validarPrecio() {
        double precio;
        do {
            precio = pedirDouble("Precio (debe ser mayor que 0): ");
            if (precio <= 0) {
                System.out.println("ERROR. El precio debe ser un valor positivo.");
            }
        } while (precio <= 0);
        return precio;
    }

    // Permite elegir el modelo de procesador de una lista
    public static String elegirModeloProcesador() {
        int opcion;
        System.out.println(" Elija el Modelo de Procesador de la lista:");
        for (int i = 0; i < PROCESADORES_VALIDOS.length; i++) {
            System.out.println("    " + (i + 1) + " . " + PROCESADORES_VALIDOS[i]);
        }
        
        do {
            opcion = pedirEntero(" Opción: ");
            if (opcion < 1 || opcion > PROCESADORES_VALIDOS.length) {
                System.out.println(" Opción no válida. Intente de nuevo.");
            }
        } while (opcion < 1 || opcion > PROCESADORES_VALIDOS.length);
        
        return PROCESADORES_VALIDOS[opcion - 1];
    }
    
    public static int validarTamanoMonitor() {
        int monitor;
        do {
            monitor = pedirEntero(" Tamaño del Monitor (pulgadas, debe ser mayor que 14): ");
            if (monitor <= 14) {
                System.out.println(" ERROR. El tamaño del monitor debe ser mayor que 14. Vuelva a intentarlo.");
            }
        } while (monitor <= 14); // Repite mientras no se cumpla la condición
        return monitor;
    }

    public static Object[] capturarDatosOrdenadorBase(Scanner sc) {
        System.out.println(" Introducción de Datos Base del Ordenador");
        int ram = pedirEntero(" Cantidad de Memoria RAM (GB): ");
        int disco = validarCapacidadDiscoDuro();
        String procesador = elegirModeloProcesador();
        System.out.print(" Modelo de Tarjeta Gráfica: ");
        String grafica = sc.nextLine();
        double precio = validarPrecio();
        
        return new Object[]{ram, disco, procesador, grafica, precio};
    }
    
    //Método para crear un objeto Servidor mediante el constructor por parámetros.
    public static servidor crearServidorParametrizado(int id) {
        System.out.println("CREANDO SERVIDOR " + id + " (CONSTRUCTOR CON PARÁMETROS)");
        Object[] datosBase = capturarDatosOrdenadorBase(entrada);
        
        System.out.println("Introducción de Datos Específicos del Servidor " + id );
        int monitor = validarTamanoMonitor(); // Usa validación estática
        System.out.print(" Modelo de Teclado: ");
        String teclado = entrada.nextLine();
        System.out.print(" Modelo de Ratón: ");
        String raton = entrada.nextLine();

        return new servidor(
            (int) datosBase[0] , (int) datosBase[18], (String) datosBase[19], (String) datosBase[20], (double) datosBase[21],
            monitor, teclado, raton
        );
    }
    
    // Método para crear un objeto Portátil mediante el constructor por parámetros
    public static portatil crearPortatilParametrizado(int id) {
        System.out.println("CREANDO PORTÁTIL " + id + " (CONSTRUCTOR CON PARÁMETROS)");
        Object[] datosBase = capturarDatosOrdenadorBase(entrada);
        
        System.out.println("Introducción de Datos Específicos del Portátil " + id );
        System.out.print("Marca: ");
        String marca = entrada.nextLine();
        double pantalla = pedirDouble(" Tamaño de Pantalla (pulgadas): ");
        double peso = pedirDouble(" Peso (kg): ");

        return new portatil( 
            (int) datosBase[0] , (int) datosBase[18], (String) datosBase[19], (String) datosBase[20], (double) datosBase[21],
            marca, pantalla, peso);
    }
    
    // Método para crear un objeto Servidor mediante constructor por defecto y setters.
    public static servidor crearServidorDefecto(int id) {
        servidor s = new servidor(); // Constructor por defecto
        System.out.println(" CREANDO SERVIDOR " + id + " (CONSTRUCTOR POR DEFECTO + SETTERS)");

        System.out.println(" Asignación de Datos Base del Servidor " + id );
        
        // Uso de los métodos estáticos de validación y setters 
        s.establecerCantidadMemoriaRAM(pedirEntero(" Cantidad de Memoria RAM (GB): "));
        s.establecerCapacidadDiscoDuro(validarCapacidadDiscoDuro());
        s.establecerModeloProcesador(elegirModeloProcesador());
        System.out.print(" Modelo de Tarjeta Gráfica: ");
        s.establecerModeloTarjetaGrafica(entrada.nextLine());
        s.establecerPrecio(validarPrecio());

        System.out.println(" Asignación de Datos Específicos del Servidor " + id );
        
        // Uso de método estático para validar y setter
        s.establecerTamanoMonitor(validarTamanoMonitor());
        System.out.print(" Modelo de Teclado: ");
        s.establecerModeloTeclado(entrada.nextLine());
        System.out.print(" Modelo de Ratón: ");
        s.establecerModeloRaton(entrada.nextLine());
        
        return s;
    }

    // Método para crear un objeto Portátil mediante constructor por defecto y setters.
    public static portatil crearPortatilDefecto(int id) {
        portatil p = new portatil(); // Constructor por defecto
        System.out.println("CREANDO PORTÁTIL " + id + " (CONSTRUCTOR POR DEFECTO + SETTERS)");

        System.out.println("Asignación de Datos Base del Portátil " + id);

        // Uso de los métodos estáticos de validación y setters
        p.establecerCantidadMemoriaRAM(pedirEntero(" Cantidad de Memoria RAM (GB): "));
        p.establecerCapacidadDiscoDuro(validarCapacidadDiscoDuro());
        p.establecerModeloProcesador(elegirModeloProcesador());
        System.out.print(" Modelo de Tarjeta Gráfica: ");
        p.establecerModeloTarjetaGrafica(entrada.nextLine());
        p.establecerPrecio(validarPrecio());

        System.out.println(" Asignación de Datos Específicos del Portátil " + id + " (Setters) ---");
        
        System.out.print(" Marca: ");
        p.establecerMarcaPortatil(entrada.nextLine());
        p.establecerTamanoPantalla(pedirDouble(" Tamaño de Pantalla (pulgadas): "));
        p.establecerPeso(pedirDouble(" Peso (kg): "));
        
        return p;
    }

    public static void main(String[] args) {
        System.out.println("--- EJERCICIO 25: GESTIÓN DE ORDENADORES MEDIANTE HERENCIA ---\n");

        // Creación de 2 objetos Servidor con constructor parametrizado
        servidor serv1 = crearServidorParametrizado(1);
        servidor serv2 = crearServidorParametrizado(2);

        // Creación de 2 objetos Portátil con constructor parametrizado
        portatil port1 = crearPortatilParametrizado(1);
        portatil port2 = crearPortatilParametrizado(2);
        
        // Creación de 1 objeto Servidor con constructor por defecto y setters
        servidor serv3 = crearServidorDefecto(3);
        
        // Creación de 1 objeto Portátil con constructor por defecto y setters
        portatil port3 = crearPortatilDefecto(3);
        
        // Mostrar los datos de los 6 objetos creados
        System.out.println("DATOS DEL SERVIDOR 1 " + serv1.obtenerDatos());
        System.out.println("DATOS DEL SERVIDOR 2 " + serv2.obtenerDatos());
        System.out.println("DATOS DEL PORTÁTIL 1 " + port1.obtenerDatos());
        System.out.println("DATOS DEL PORTÁTIL 2 " + port2.obtenerDatos());
        System.out.println("DATOS DEL SERVIDOR 3 " + serv3.obtenerDatos());
        System.out.println("DATOS DEL PORTÁTIL 3 " + port3.obtenerDatos());

        entrada.close();
    }
}
