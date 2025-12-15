package consolidacionejercicio10;

/**
 *
 * @author alumno
 */
public class ConsolidacionEjercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Electrodoméstico lavadora = new Electrodoméstico(0.5f, 0.24f, "A++");
        Electrodoméstico frigorifico = new Electrodoméstico(0.2f, 0.24f, "A");
        Electrodoméstico horno = new Electrodoméstico(1.2f, 0.24f, "B");

        System.out.println(lavadora);
        System.out.println("LAVADORA: ");
        System.out.println("Consumo: " + lavadora.calcularConsumo(5));
        System.out.println("Precio: " + lavadora.calcularFactura(5) + "€");
        
        System.out.println(frigorifico);
        System.out.println("FRIGORÍFICO: ");
        System.out.println("Consumo: " + frigorifico.calcularConsumo(720));
        System.out.println("Precio: " + frigorifico.calcularFactura(720) + "€");
        
        System.out.println(horno);
        System.out.println("HORNO: ");
        System.out.println("Consumo: " + horno.calcularConsumo(2));
        System.out.println("Precio: " + horno.calcularFactura(2) + "€");
    }
    
}
