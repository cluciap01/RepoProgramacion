package ejercicio6gestiónsueldos;

/**
 *
 * @author Usuario
 */
public class Empleado {
    private String nombre;
    private int horasTrabajadas;
    private double tarifaPorHora;

    // Constructor para inicializar los datos del empleado
    public Empleado(String nombre, int horasTrabajadas, double tarifaPorHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    // Método para determinar el sueldo bruto según las reglas de la empresa
    public double calcularSueldoBruto() {
        if (horasTrabajadas <= 40) {
            return horasTrabajadas * tarifaPorHora;
        } else {
            // Primeras 40 horas a tarifa normal + excedente a tarifa y media (1.5)
            int horasExtras = horasTrabajadas - 40;
            return (40 * tarifaPorHora) + (horasExtras * tarifaPorHora * 1.5);
        }
    }

    // Métodos para obtener información (getters)
    public String getNombre() { return nombre; }
    public int getHorasTrabajadas() { return horasTrabajadas; }
    public double getTarifaPorHora() { return tarifaPorHora; }
}
