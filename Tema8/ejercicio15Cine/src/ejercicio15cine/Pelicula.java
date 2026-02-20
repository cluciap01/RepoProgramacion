package ejercicio15cine;

/**
 *
 * @author Usuario
 */
public class Pelicula {
    private String titulo;
    private double costeLicencia;
    private Socio[] asistentes = new Socio[6]; // Aforo limitado a 4 socios

    public Pelicula(String titulo, double costeLicencia) {
        this.titulo = titulo;
        this.costeLicencia = costeLicencia;
    }

    // Método para calcular beneficio neto según la fuente
    public double calcularBeneficioNeto() {
        double recaudacion = 0;
        for (Socio s : asistentes) {
            if (s != null) recaudacion += s.getPrecioAbonado();
        }
        return recaudacion - costeLicencia;
    }

    // Getters y Setters
    public String getTitulo() { return titulo; }
    public Socio[] getAsistentes() { return asistentes; }
    public void setAsistente(int pos, Socio s) { asistentes[pos] = s; }
}
