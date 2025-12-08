package ejercicio6cadenaslibro;

/**
 *
 * @author Usuario
 */
public class Libro implements Transformable{
    private String titulo;
    private String autor;
    private String genero;

    //Constructores
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.genero = "";
    }
    public Libro(String titulo, String autor, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }

    @Override
    public String concatenarTodo() {
        return titulo + "#" + autor + "#" + genero; 
    }
    
    @Override
    public String obtenerIniciales() {
        String i1 = titulo.substring(0, 1);
        String i2 = autor.substring(0, 1);
        String i3 = genero.substring(0, 1);
        return i1 + i2 + i3;
    }

    @Override
    public void contarVocales() {
        int contador = 0;
        String vocales = "aeiouAEIOU";

        // Contador para titulo
        for (int i = 0; i < titulo.length(); i++) {
            if (vocales.indexOf(titulo.charAt(i)) != -1) {
                contador++;
            }
        }
        // Contador para autor
        for (int i = 0; i < autor.length(); i++) {
            if (vocales.indexOf(autor.charAt(i)) != -1) {
                contador++;
            }
        }
        // Contador para genero
        for (int i = 0; i < genero.length(); i++) {
            if (vocales.indexOf(genero.charAt(i)) != -1) {
                contador++;
            }
        }

        System.out.println("El libro '" + titulo + "' tiene un total de " + contador + " vocales en sus atributos.");
    }

    @Override
    public String obtenerCadenaMasLarga() {
        String masLarga = titulo;

        // Compara longitud de cadenas individualmente
        if (autor.length() > masLarga.length()) {
            masLarga = autor;
        }
        if (genero.length() > masLarga.length()) {
            masLarga = genero;
        }
        return masLarga;
    }

    @Override
    public boolean buscarCadena(String cadenaBuscada) {
        // Compara cada atributo con la cadena buscada
        return titulo.equals(cadenaBuscada) || autor.equals(cadenaBuscada) || genero.equals(cadenaBuscada);
    }
}
