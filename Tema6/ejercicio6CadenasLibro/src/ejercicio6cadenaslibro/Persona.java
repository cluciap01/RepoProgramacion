package ejercicio6cadenaslibro;

/**
 *
 * @author Usuario
 */
public class Persona implements Transformable{
    private String nombre;
    private String apellidos;
    private String alias;

    //Constructores
    public Persona() {
        this.nombre = "";
        this.apellidos = "";
        this.alias = "";
    }
    public Persona(String nombre, String apellidos, String alias) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.alias = alias;
    }

    // Implementación de los métodos de Transformable

    @Override
    public String concatenarTodo() {
        return nombre + "#" + apellidos + "#" + alias;
    }

    @Override
    public String obtenerIniciales() {
        String i1 = nombre.substring(0, 1);
        String i2 = apellidos.substring(0, 1);
        String i3 = alias.substring(0, 1);
        return i1 + i2 + i3;
    }

    @Override
    public void contarVocales() {
        int contador = 0;
        String vocales = "aeiouAEIOU";

        // Contador para nombre
        for (int i = 0; i < nombre.length(); i++) {
            if (vocales.indexOf(nombre.charAt(i)) != -1) {
                contador++;
            }
        }
        // Contador para apellidos
        for (int i = 0; i < apellidos.length(); i++) {
            if (vocales.indexOf(apellidos.charAt(i)) != -1) {
                contador++;
            }
        }
        // Contador para alias
        for (int i = 0; i < alias.length(); i++) {
            if (vocales.indexOf(alias.charAt(i)) != -1) {
                contador++;
            }
        }
        System.out.println("La persona " + nombre + " tiene un total de " + contador + " vocales en sus atributos.");
    }

    @Override
    public String obtenerCadenaMasLarga() {
        String masLarga = nombre;

        if (apellidos.length() > masLarga.length()) {
            masLarga = apellidos;
        }
        if (alias.length() > masLarga.length()) {
            masLarga = alias;
        }
        return masLarga;
    }

    @Override
    public boolean buscarCadena(String cadenaBuscada) {
        return nombre.equals(cadenaBuscada) || apellidos.equals(cadenaBuscada) || alias.equals(cadenaBuscada);
    }
}
