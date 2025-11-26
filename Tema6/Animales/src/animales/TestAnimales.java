package animales;

/**
 *
 * @author alumno
 */
public class TestAnimales {

    public static void main(String[] args) {
        // Instanciamos un objeto de cada subclase implementada
        Perros perro1 = new Perros("Buddy", 5 , 25.0);
        Lobos lobo1 = new Lobos("Alpha", 8, 48.5);
        Leones leon1 = new Leones("Cecil", 12, 180.0);
        Gatos gato1 = new Gatos("Garfield", 3, 5.5);
        
        perro1.caracteristicas();
        lobo1.caracteristicas();
        leon1.caracteristicas();
        gato1.caracteristicas();
        
        // Utilizamos el polimorfismo para crear objetos a partir de la superclase Animal
        
        Animales animalA = new Perros("Snoopy", 2, 10.0);   
        Animales animalB = new Lobos("Fantasma", 6, 55.0);
        Animales animalC = new Leones("Mufasa", 9, 200.0);
        Animales animalD = new Gatos("Silvestre", 4, 4.0);
        
        animalA.caracteristicas();
        animalB.caracteristicas();
        animalC.caracteristicas();
        animalD.caracteristicas();
    }
    
}
