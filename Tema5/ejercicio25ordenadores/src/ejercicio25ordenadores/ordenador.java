package ejercicio25ordenadores;

/**
 *
 * @author Christian
 */
public class ordenador {
    // Atributos privados requeridos [1]
    private int cantidadMemoriaRAM;
    private int capacidadDiscoDuro;
    private String modeloProcesador;
    private String modeloTarjetaGrafica;
    private double precio;

    // Constructor por defecto
    public ordenador() {
        this.cantidadMemoriaRAM = 0;
        this.capacidadDiscoDuro = 0;
        this.modeloProcesador = "";
        this.modeloTarjetaGrafica = "";
        this.precio = 0.0;
    }

    // Constructor
    public ordenador(int ram, int disco, String procesador, String grafica, double precio) {
        this.cantidadMemoriaRAM = ram;
        this.capacidadDiscoDuro = disco;
        this.modeloProcesador = procesador;
        this.modeloTarjetaGrafica = grafica;
        this.precio = precio;
    }

    // Setters
    public void establecerCantidadMemoriaRAM(int cantidadMemoriaRAM) {
        this.cantidadMemoriaRAM = cantidadMemoriaRAM;
    }

    public void establecerCapacidadDiscoDuro(int capacidadDiscoDuro) {
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }

    public void establecerModeloProcesador(String modeloProcesador) {
        this.modeloProcesador = modeloProcesador;
    }

    public void establecerModeloTarjetaGrafica(String modeloTarjetaGrafica) {
        this.modeloTarjetaGrafica = modeloTarjetaGrafica;
    }

    public void establecerPrecio(double precio) {
        this.precio = precio;
    }
    
    // Getters
    public int obtenerCantidadMemoriaRAM() {
        return cantidadMemoriaRAM;
    }

    public int obtenerCapacidadDiscoDuro() {
        return capacidadDiscoDuro;
    }

    public String obtenerModeloProcesador() {
        return modeloProcesador;
    }

    public String obtenerModeloTarjetaGrafica() {
        return modeloTarjetaGrafica;
    }

    public double obtenerPrecio() {
        return precio;
    }

    // Mostrar por pantalla los datos
    public String obtenerDatos() {
        return "Datos del Ordenador Base" +
               "RAM: " + cantidadMemoriaRAM + " GB\n" +
               "Disco Duro: " + capacidadDiscoDuro + " GB\n" +
               "Procesador: " + modeloProcesador + "\n" +
               "Tarjeta Gráfica: " + modeloTarjetaGrafica + "\n" +
               "Precio: " + String.format("%.2f", precio) + " Euros";
    }
}