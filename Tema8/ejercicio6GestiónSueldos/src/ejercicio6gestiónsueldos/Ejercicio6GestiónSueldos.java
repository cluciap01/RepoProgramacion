package ejercicio6gestiónsueldos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio6GestiónSueldos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Cuántos empleados desea introducir?");
        int cantidad = entrada.nextInt();

        // Creación del array para almacenar los objetos de tipo Empleado
        Empleado[] listaEmpleados = new Empleado[cantidad];

        // Bucle para rellenar la información de cada empleado
        for (int i = 0; i < listaEmpleados.length; i++) {
            System.out.println("- EMPLEADO " + (i + 1) + " -");
            entrada.nextLine(); // Limpiar el buffer
            
            System.out.print("Introduzca el nombre del empleado: ");
            String nombre = entrada.nextLine();
            
            System.out.print("¿Cuántas horas trabajó este mes? ");
            int horas = entrada.nextInt();
            
            System.out.print("¿Cuál es su tarifa por hora de trabajo? ");
            double tarifa = entrada.nextDouble();

            // Instanciación del objeto en la posición del array
            listaEmpleados[i] = new Empleado(nombre, horas, tarifa);
            System.out.println("EMPLEADO " + (i + 1) + " ALMACENADO CON ÉXITO –");
        }

        // Mostrar el sueldo bruto de cada empleado
        System.out.println("\nSUELDO BRUTO DE LOS EMPLEADOS");
        for (Empleado emp : listaEmpleados) {
            System.out.println(emp.getNombre() + " trabajó " + emp.getHorasTrabajadas() + 
                " horas, cobra " + emp.getTarifaPorHora() + " euros la hora por lo que " +
                "le corresponde un sueldo de " + emp.calcularSueldoBruto() + " euros.");
        }
    }
}