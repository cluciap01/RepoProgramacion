package ejercicio25ordenadores;

/**
 *
 * @author Christian
 */
public class servidor extends ordenador{
     private int tamanoMonitor;
    private String modeloTeclado;
    private String modeloRaton;

    // Constructor por defecto
    public servidor() {
        super(); // Llama al constructor por defecto de Ordenador
        this.tamanoMonitor = 0;
        this.modeloTeclado = "";
        this.modeloRaton = "";
    }

    // Constructor con parámetros
    public servidor(int ram, int disco, String procesador, String grafica, double precio,
                    int monitor, String teclado, String raton) {
        super(ram , disco , procesador , grafica , precio); // Llama al constructor de Ordenador
        this.tamanoMonitor = monitor;
        this.modeloTeclado = teclado;
        this.modeloRaton = raton;
    }

    // Setters
    public void establecerTamanoMonitor(int tamanoMonitor) {
        this.tamanoMonitor = tamanoMonitor;
    }

    public void establecerModeloTeclado(String modeloTeclado) {
        this.modeloTeclado = modeloTeclado;
    }

    public void establecerModeloRaton(String modeloRaton) {
        this.modeloRaton = modeloRaton;
    }

    // Getters
    public int obtenerTamanoMonitor() {
        return tamanoMonitor;
    }

    public String obtenerModeloTeclado() {
        return modeloTeclado;
    }

    public String obtenerModeloRaton() {
        return modeloRaton;
    }

    // Método para mostrar toda la información (incluye la de la superclase)
    @Override
    public String obtenerDatos() {
        return super.obtenerDatos() + "Datos Adicionales del Servidor" +
               "Tamaño Monitor: " + tamanoMonitor + " pulgadas\n" +
               "Modelo Teclado: " + modeloTeclado + "\n" +
               "Modelo Ratón: " + modeloRaton;
    }
}
