package ejercicio6cadenaslibro;

/**
 *
 * @author Usuario
 */
public class Ejercicio6CadenasLibro {

    public static void probarTransformable(Transformable t) {
        String tipo = t.getClass().getSimpleName();
        
        System.out.println("Pruebas para: " + tipo + " ");
        
        System.out.println("1. Concatenar todo: " + t.concatenarTodo());
        
        System.out.println("2. Obtener iniciales: " + t.obtenerIniciales());
        
        System.out.print("3. ");
        t.contarVocales();
        
        String masLarga = t.obtenerCadenaMasLarga();
        System.out.println("4. Cadena más larga: " + masLarga);
        
        System.out.println("5. Buscar '" + masLarga + "': " + t.buscarCadena(masLarga));
        System.out.println("5. Buscar 'Inexistente': " + t.buscarCadena("Inexistente"));
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro("Cien anos de soledad", "Gabriel Garcia Marquez", "Realismo Magico");
        Persona persona1 = new Persona("Ana", "Gomez Perez", "Anis");

        System.out.println(" INSTANCIACIÓN DIRECTA ");
        probarTransformable(libro1);
        probarTransformable(persona1);

        // Uso de Polimorfismo
        System.out.println("USO DE POLIMORFISMO");
        
        Transformable objetoT1 = new Libro("La casa de los espiritus", "Isabel Allende", "Novela");
        Transformable objetoT2 = new Persona("Pedro", "Lopez Martinez", "Pete");

        probarTransformable(objetoT1); 
        probarTransformable(objetoT2);
    }
}
