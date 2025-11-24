package ejercicio25ordenadores;

/**
 *
 * @author Usuario
 */
public class portatil extends ordenador{
    private String marcaPortatil; // Se usa 'marcaPortatil' para evitar ambigüedad con posibles atributos base 'marca'
    private double tamanoPantalla;
    private double peso;

    // Constructor por defecto
    public portatil() {
        super(); // Llama al constructor por defecto de Ordenador
        this.marcaPortatil = "N/A";
        this.tamanoPantalla = 0.0;
        this.peso = 0.0;
    }

    // Constructor con parámetros
    public portatil(int ram, int disco, String procesador, String grafica, double precio, String marca, double pantalla, double peso) {
        super(ram, disco, procesador, grafica, precio); // Llama al constructor de Ordenador
        this.marcaPortatil = marca;
        this.tamanoPantalla = pantalla;
        this.peso = peso;
    }

    // Setters
    public void establecerMarcaPortatil(String marcaPortatil) {
        this.marcaPortatil = marcaPortatil;
    }

    public void establecerTamanoPantalla(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public void establecerPeso(double peso) {
        this.peso = peso;
    }

    // Getters
    public String obtenerMarcaPortatil() {
        return marcaPortatil;
    }

    public double obtenerTamanoPantalla() {
        return tamanoPantalla;
    }

    public double obtenerPeso() {
        return peso;
    }

    // Método para mostrar toda la información
    @Override
    public String obtenerDatos() {
        return super.obtenerDatos() + "Datos Adicionales del Portátil" +
               "Marca Portátil: " + marcaPortatil +
               "Tamaño Pantalla: " + tamanoPantalla + " pulgadas" +
               "Peso: " + String.format("%.2f", peso) + " kg"; //Para sacar la ultima linea utilicé ayuda de inteligencia artificial
    }
}
