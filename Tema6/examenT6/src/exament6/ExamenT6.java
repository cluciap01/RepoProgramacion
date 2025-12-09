package exament6;

/**
 *
 * @author alumno
 */
public class ExamenT6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ciclistas");
        CiclistaEscalador ciclista1 = new CiclistaEscalador("Christian", 100, true, 20, 2, 20, 20, 15, 10);
        ciclista1.caracteristicas();
        ciclista1.recuperar(10);
        ciclista1.cogerBidones();
        
        CiclistaSprinter ciclista2 = new CiclistaSprinter("Anabel", 80, false, 30, 3, 25, 15, 20);
        ciclista2.caracteristicas();
        ciclista2.recuperar(15);
        ciclista2.cogerBidones();
        
        System.out.println("Ciclistas Polimorfismo");

        Ciclista c1 = new CiclistaEscalador("Pedro", 31, false, 25, 4, 10, 20, 20, 25);        
        c1.caracteristicas();
        Ciclista c2 = new CiclistaEscalador("Pepe", 48, true, 15, 2, 15, 30, 10, 35);
        c2.caracteristicas();
    }
    
}
