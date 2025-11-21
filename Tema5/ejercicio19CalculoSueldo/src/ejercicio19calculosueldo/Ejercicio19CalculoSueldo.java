package ejercicio19calculosueldo;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio19CalculoSueldo {

    private static Scanner entrada = new Scanner(System.in);

    // Método auxiliar para recoger datos y crear un empleado
    public static empleado crearEmpleado() {
        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();
        
        System.out.print("Horas trabajadas: ");
        double horas = entrada.nextDouble();
        
        System.out.print("Tarifa por hora: ");
        double tarifa = entrada.nextDouble();
        
        entrada.nextLine(); // Consumir nueva línea
        
        // Creación del objeto Empleado con el constructor
        return new empleado(nombre, horas, tarifa);
    }
    public static void main(String[] args) {
        System.out.println("Datos Empleado 1");
        empleado emp1 = crearEmpleado();
        
        System.out.println("Datos Empleado 2");
        empleado emp2 = crearEmpleado();
        
        System.out.println("Datos Empleado 3");
        empleado emp3 = crearEmpleado();
        
        // Muestra el calculo de cada empleado
        emp1.mostrarCalculo();
        emp2.mostrarCalculo();
        emp3.mostrarCalculo();
    }
    
}
