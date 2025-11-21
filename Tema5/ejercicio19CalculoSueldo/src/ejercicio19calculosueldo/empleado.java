package ejercicio19calculosueldo;

/**
 *
 * @author Christian
 */
public class empleado {
    private String nombre;
    private double horasTrabajadas;
    private double tarifaPorHora;

    // Constructor que recibe los valores que le asignemos a los empleados
    public empleado(String nombre, double horasTrabajadas, double tarifaPorHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    // Método para calcular el sueldo bruto
    public double determinarSueldoBruto() {
        double sueldoBruto;
        
        // La empresa paga tarifa normal en las primeras 40 horas
        if (horasTrabajadas <= 40) {
            sueldoBruto = horasTrabajadas * tarifaPorHora;
        } else {
            // Horas extra trabajadas que exceden de 40 se pagan a tarifa y media (1.5x)
            double horasBase = 40;
            double horasExtra = horasTrabajadas - horasBase;
            double tarifaExtra = tarifaPorHora * 1.5;

            double pagoBase = horasBase * tarifaPorHora;
            double pagoExtra = horasExtra * tarifaExtra;
            
            sueldoBruto = pagoBase + pagoExtra;
        }
        return sueldoBruto;
    }

    // Método para mostrar el estado y el sueldo bruto
    public void mostrarCalculo() {
        double sueldo = determinarSueldoBruto();
        //Aparecerá por pantalla el nombre del empleado , las horas y lo que ha cobrado
        System.out.println(nombre + " trabajó " + horasTrabajadas + " horas, cobra " 
            + tarifaPorHora + " euros la hora por lo que le corresponde un sueldo de " 
            + sueldo + " euros.");
    }
}
